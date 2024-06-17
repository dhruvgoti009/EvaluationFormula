package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Summation;
import org.example.Node;

public class SummationEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Summation expression = (Summation) exp;
    double result = 0.0;
    for (Expression i : expression.getSummation()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "SUM", t.dataType);
        return new Node("", processor.inValidDataType);
      }
      result += Double.parseDouble(t.value);
    }
    return new Node(Double.toString(result), "NUMBER");
  }
}
