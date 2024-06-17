package ExpressionEvaluation;

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

public enum ExpressionType {
  NUMBER(Number.class, new NumberEvaluator()),
  SUMALTER(SumAlter.class, new SumAlterEvaluator()),
  SUBTRACTALTER(SubtractAlter.class, new SubtractAlterEvaluator()),
  MULTIPLYALTER(MultiplyAlter.class, new MultiplyAlterEvaluator()),
  DIVISIONALTER(DivisionAlter.class, new DivisionAlterEvaluator()),
  MULTIPLICATION(Multiplication.class, new MultiplicationEvaluator()),
  PRODUCT(Product.class, new ProductEvaluator()),
  SUMMATION(Summation.class, new SummationEvaluator()),
  QUOTIENT(Quotient.class, new QuotientEvaluator()),
  MAXIMUM(Maximum.class, new MaximumEvaluator()),
  MINIMUM(Minimum.class, new MinimumEvaluator()),
  AVERAGE(Average.class, new AverageEvaluator()),
  MEAN(Mean.class, new MeanEvaluator()),
  IFLOGIC(IfLogic.class, new IfLogicEvaluator()),
  IFSLOGIC(IfsLogic.class, new IfsLogicEvaluator()),
  SUBSTITUTETEXT(SubstituteText.class, new SubstituteTextEvaluator()),
  EXACTTEXT(ExactText.class, new ExactTextEvaluator()),
  CONCATENATETEXT(ConcatenateText.class, new ConcatenateTextEvaluator()),
  CONCATENATEALTER(ConcatenateAlter.class, new ConcatenateAlterEvaluator()),
  STRINGTEXT(StringText.class, new StringTextEvaluator()),
  TODAYDATE(TodayDate.class, new TodayDateEvaluator()),
  ADDDATE(AddDate.class, new AddDateEvaluator()),
  SUBTRACTDATE(SubtractDate.class, new SubtractDateEvaluator()),
  DURATIONDATE(DurationDate.class, new DurationDateEvaluator()),
  COMPARATOR(Comparator.class, new ComparatorEvaluator()),
  OPERATOR(Operator.class, new OperatorEvaluator()),
  VARIABLE(Variable.class, new VariableEvaluator());

  private final Class<? extends Expression> expressionClass;
  private final ExpressionEvaluator evaluator;

  ExpressionType(Class<? extends Expression> expressionClass, ExpressionEvaluator evaluator) {
    this.expressionClass = expressionClass;
    this.evaluator = evaluator;
  }

  public static ExpressionEvaluator getEvaluatorFor(Class<? extends Expression> expressionClass) {
    for (ExpressionType type : values()) {
      if (type.getExpressionClass().equals(expressionClass)) {
        return type.getEvaluator();
      }
    }
    return null; // Or throw an exception if preferred
  }

  public Class<? extends Expression> getExpressionClass() {
    return expressionClass;
  }

  public ExpressionEvaluator getEvaluator() {
    return evaluator;
  }
}
