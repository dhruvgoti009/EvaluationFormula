package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AntlrToProgram extends formulaBaseVisitor<Program> {

  //    This map is used for check that we have value at this cell or not
//    like [A1->have this Expression]
  public Map<String, Node> fieldToValue;
  public Map<String, Node> variable;
  public List<ValidationError> semanticErrors;

  public AntlrToProgram(Map<String, Node> variable) {
    this.variable = variable;
  }

  @Override
  public Program visitProgram(formulaParser.ProgramContext ctx) {
    Program prog = new Program();
    semanticErrors = new ArrayList<>();
    fieldToValue = new HashMap<>(variable);
    AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors, fieldToValue);

    for (int i = 0; i < ctx.getChildCount(); i++) {
      if (i != ctx.getChildCount() - 1) {
        prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
      }
    }
    return prog;
  }
}
