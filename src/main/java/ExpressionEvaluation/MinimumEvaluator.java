package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Minimum;
import org.example.Node;

public class MinimumEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Minimum expression = (Minimum) exp;
    double result = Double.POSITIVE_INFINITY;
    for (Expression i : expression.getMinimum()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "MIN", t.dataType);
        return new Node("", processor.inValidDataType);
      }

      result = Math.min(result, Double.parseDouble(t.value));
    }
    return new Node(Double.toString(result), "NUMBER");
  }
}

