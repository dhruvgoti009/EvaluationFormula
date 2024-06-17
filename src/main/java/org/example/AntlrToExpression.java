package org.example;

import FormulaGrammar.AddDate;
import FormulaGrammar.Average;
import FormulaGrammar.Comparator;
import FormulaGrammar.ConcatenateAlter;
import FormulaGrammar.ConcatenateText;
import FormulaGrammar.DivisionAlter;
import FormulaGrammar.DurationDate;
import FormulaGrammar.ExactText;
import FormulaGrammar.Expression;
import FormulaGrammar.IfLogic;
import FormulaGrammar.IfsLogic;
import FormulaGrammar.Maximum;
import FormulaGrammar.Mean;
import FormulaGrammar.Minimum;
import FormulaGrammar.Multiplication;
import FormulaGrammar.MultiplyAlter;
import FormulaGrammar.Number;
import FormulaGrammar.Operator;
import FormulaGrammar.Product;
import FormulaGrammar.Quotient;
import FormulaGrammar.StringText;
import FormulaGrammar.SubstituteText;
import FormulaGrammar.SubtractAlter;
import FormulaGrammar.SubtractDate;
import FormulaGrammar.SumAlter;
import FormulaGrammar.Summation;
import FormulaGrammar.TodayDate;
import FormulaGrammar.Variable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class AntlrToExpression extends formulaBaseVisitor<Expression> {

  //  map is just for checking that we used defined variable in our Expression
  public Map<String, Node> fieldToValue;
  //  semanticErrors contains all the errors when we used undefined variable in Expression
  public List<ValidationError> semanticErrors;
  //  it's just for checking that semanticError doesn't contain duplicate error
  public Set<String> reportedErrors;


  public AntlrToExpression(List<ValidationError> semanticErrors, Map<String, Node> fieldToValue) {
    this.fieldToValue = fieldToValue;
    this.semanticErrors = semanticErrors;
    this.reportedErrors = new HashSet<>();
  }

//  this function is used for get row and column number for given ParseTree node

  public List<Integer> place(ParseTree child) {
    List<Integer> line = new ArrayList<>();
    Token idToken = null;

    if (child instanceof TerminalNode) {
      idToken = ((TerminalNode) child).getSymbol();
    } else if (child instanceof ParserRuleContext) {
      idToken = ((ParserRuleContext) child).getStart();
    }
    assert idToken != null;
    line.add(idToken.getLine());
    line.add(idToken.getCharPositionInLine() + 1);
    return line;
  }

  //  check is basically check for variable is undefined or not
  public boolean check(Expression p) {
    if (p instanceof Variable) {
      try {
        return fieldToValue.get(((Variable) p).getID()) == null;
      } catch (Exception e) {
        return true;
      }
    }
    return false;
  }

  public boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      try {
        double d = Double.parseDouble(s);
        return d == Math.floor(d);
      } catch (NumberFormatException ex) {
        return false;
      }
    }
  }

  @Override
  public Expression visitMean(formulaParser.MeanContext ctx) {
    Mean ans = new Mean(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "MEAN");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitMultiplyAlter(formulaParser.MultiplyAlterContext ctx) {
    Expression left = visit(ctx.getChild(0));
    Expression right = visit(ctx.getChild(2));
    checkAndAddError(ctx, 0);
    checkAndAddError(ctx, 2);
    return new MultiplyAlter(left, right, ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitMultiplication(formulaParser.MultiplicationContext ctx) {
    Multiplication ans = new Multiplication(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "MULTIPLY");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;

  }

  @Override
  public Expression visitMinimum(formulaParser.MinimumContext ctx) {
    Minimum ans = new Minimum(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "MIN");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitVariable(formulaParser.VariableContext ctx) {
    checkAndAddError(ctx, 0);
    return new Variable(ctx.getChild(0).getText(), ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitAverage(formulaParser.AverageContext ctx) {
    Average ans = new Average(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "AVERAGE");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitProduct(formulaParser.ProductContext ctx) {
    Product ans = new Product(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "PRODUCT");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitSumAlter(formulaParser.SumAlterContext ctx) {
    Expression left = visit(ctx.getChild(0));
    Expression right = visit(ctx.getChild(2));
    checkAndAddError(ctx, 0);
    checkAndAddError(ctx, 2);
    return new SumAlter(left, right, ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitSubtractAlter(formulaParser.SubtractAlterContext ctx) {
    Expression left = visit(ctx.getChild(0));
    Expression right = visit(ctx.getChild(2));
    checkAndAddError(ctx, 0);
    checkAndAddError(ctx, 2);
    return new SubtractAlter(left, right, ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitMaximum(formulaParser.MaximumContext ctx) {
    Maximum ans = new Maximum(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "MAX");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitNumber(formulaParser.NumberContext ctx) {
    checkAndAddError(ctx, 0);
    return new Number(ctx.getChild(0).getText(), ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  public void checkAndAddError(ParserRuleContext ctx, int childIndex, String expression) {

    List<Integer> line = place(ctx.getChild(childIndex));
    String str1 = "Error: used undefined Variable(ID) " + ctx.getChild(childIndex).getText() + " "
        + expression + " Expression";
    if (!reportedErrors.contains(str1) && check(visit(ctx.getChild(childIndex)))) {
      semanticErrors.add(new ValidationError(str1, line.get(1)));
      reportedErrors.add(str1);
    }
  }

  public void checkAndAddError(ParserRuleContext ctx, int childIndex) {

    List<Integer> line = place(ctx.getChild(childIndex));
    String str = "Error: used undefined Variable(ID) " + ctx.getChild(childIndex).getText();
    if (!reportedErrors.contains(str) && check(visit(ctx.getChild(childIndex)))) {
      semanticErrors.add(new ValidationError(str, line.get(1)));
      reportedErrors.add(str);
    }
  }

  @Override
  public Expression visitDivisionAlter(formulaParser.DivisionAlterContext ctx) {
    Expression left = visit(ctx.getChild(0));
    Expression right = visit(ctx.getChild(2));

    checkAndAddError(ctx, 0);
    checkAndAddError(ctx, 2);
    return new DivisionAlter(left, right, ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitIfLogic(formulaParser.IfLogicContext ctx) {
    IfLogic ans = new IfLogic(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "IF");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getIfLogic().size() != 3) {
      List<Integer> line = place(ctx.getChild(0));
      String str =
          "Error: IF method must contain exactly 3 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    return ans;

  }

  @Override
  public Expression visitIfsLogic(formulaParser.IfsLogicContext ctx) {
    List<Expression> cmp = new ArrayList<>();
    List<Expression> val = new ArrayList<>();
    for (int i = 2; i < ctx.getChildCount(); i += 4) {
      cmp.add(visit(ctx.getChild(i)));
      checkAndAddError(ctx, i, "IFS");
    }
    for (int i = 4; i < ctx.getChildCount(); i += 4) {
      val.add(visit(ctx.getChild(i)));
      checkAndAddError(ctx, i, "IFS");
    }
    return new IfsLogic(cmp, val, ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitQuotient(formulaParser.QuotientContext ctx) {
    Quotient ans = new Quotient(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "QUOTIENT");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getQuotient().size() != 2) {
      List<Integer> line = place(ctx.getChild(0));
      String str = "Error: QUOTIENT method must contain exactly 2 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }

    if (ans.getQuotient().get(0) instanceof Number && !isInteger(
        ((Number) ans.getQuotient().get(0)).getValue())) {
      List<Integer> line = place(ctx.getChild(2));
      String str = "Error: Invalid input " + ((Number) ans.getQuotient().get(0)).getValue()
          + " Expect integer in QUOTIENT method";
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    if (ans.getQuotient().get(1) instanceof Number && !isInteger(
        ((Number) ans.getQuotient().get(1)).getValue())) {
      List<Integer> line = place(ctx.getChild(4));
      String str = "Error: Invalid input " + ((Number) ans.getQuotient().get(1)).getValue()
          + " Expect integer in QUOTIENT method";
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }

    return ans;
  }

  @Override
  public Expression visitSummation(formulaParser.SummationContext ctx) {
    Summation ans = new Summation(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "SUM");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitSubstituteText(formulaParser.SubstituteTextContext ctx) {
    SubstituteText ans = new SubstituteText(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "SUBSTITUTE");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getSubstituteText().size() != 3) {
      List<Integer> line = place(ctx.getChild(0));
      String str = "Error: SUBSTITUTE method must contain exactly 3 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    return ans;

  }

  @Override
  public Expression visitExactText(formulaParser.ExactTextContext ctx) {
    ExactText ans = new ExactText(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "EXACT");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getExactText().size() != 2) {
      List<Integer> line = place(ctx.getChild(0));
      String str =
          "Error: EXACT method must contain exactly 2 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    return ans;
  }

  @Override
  public Expression visitConcatenateText(formulaParser.ConcatenateTextContext ctx) {
    ConcatenateText ans = new ConcatenateText(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "CONCATENATE");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    return ans;
  }

  @Override
  public Expression visitConcatenateAlter(formulaParser.ConcatenateAlterContext ctx) {
    Expression left = visit(ctx.getChild(0));
    Expression right = visit(ctx.getChild(2));
    checkAndAddError(ctx, 0);
    checkAndAddError(ctx, 2);
    return new ConcatenateAlter(left, right, ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitStringText(formulaParser.StringTextContext ctx) {
    checkAndAddError(ctx, 0);
    return new StringText(ctx.getChild(0).getText(), ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitTodayDate(formulaParser.TodayDateContext ctx) {
    return new TodayDate(ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);
  }

  @Override
  public Expression visitAddDate(formulaParser.AddDateContext ctx) {
    AddDate ans = new AddDate(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 4; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "DATE.ADD");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getAddDate().size() != 2) {
      List<Integer> line = place(ctx.getChild(0));
      String str = "Error: DATE.ADD method must contain exactly 2 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    return ans;

  }

  @Override
  public Expression visitSubtractDate(formulaParser.SubtractDateContext ctx) {
    SubtractDate ans = new SubtractDate(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 4; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "DATE.SUBTRACT");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getSubtractDate().size() != 2) {
      List<Integer> line = place(ctx.getChild(0));
      String str =
          "Error: DATE.SUBTRACT method must contain exactly 2 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    return ans;

  }

  @Override
  public Expression visitDurationDate(formulaParser.DurationDateContext ctx) {
    DurationDate ans = new DurationDate(ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);

    for (int i = 2; i < ctx.getChildCount(); i += 2) {
      checkAndAddError(ctx, i, "DURATION");
      ans.addExpression(visit(ctx.getChild(i)));
    }
    if (ans.getDurationDate().size() != 2) {
      List<Integer> line = place(ctx.getChild(0));
      String str = "Error: DURATION method must contain exactly 2 parameter in " + ctx.getText();
      if (!reportedErrors.contains(str)) {
        semanticErrors.add(new ValidationError(str, line.get(1)));
        reportedErrors.add(str);
      }
    }
    return ans;

  }

  @Override
  public Expression visitComparator(formulaParser.ComparatorContext ctx) {
    Expression left = visit(ctx.getChild(0));
    if (ctx.getChildCount() > 1) {
      Expression opr = visit(ctx.getChild(1));
      Expression right = visit(ctx.getChild(2));
      checkAndAddError(ctx, 0);
      checkAndAddError(ctx, 1);
      checkAndAddError(ctx, 2);
      return new Comparator(left, opr, right, ctx.start.getLine(),
          ctx.start.getCharPositionInLine() + 1);
    } else {
      checkAndAddError(ctx, 0);
      return new Comparator(left, ctx.start.getLine(), ctx.start.getCharPositionInLine() + 1);
    }
  }


  @Override
  public Expression visitOperator(formulaParser.OperatorContext ctx) {
    checkAndAddError(ctx, 0);
    return new Operator(ctx.getChild(0).getText(), ctx.start.getLine(),
        ctx.start.getCharPositionInLine() + 1);
  }


}
