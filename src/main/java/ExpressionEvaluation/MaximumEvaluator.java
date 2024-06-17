package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Maximum;
import org.example.Node;

public class MaximumEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Maximum expression = (Maximum) exp;
    double result = Double.NEGATIVE_INFINITY;
    for (Expression i : expression.getMaximum()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "MAX", t.dataType);
        return new Node("", processor.inValidDataType);
      }

      result = Math.max(result, Double.parseDouble(t.value));
    }
    return new Node(Double.toString(result), "NUMBER");
  }
}

