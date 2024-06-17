package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Mean;
import org.example.Node;

public class MeanEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Mean expression = (Mean) exp;
    double result = 0.0;
    long count = 0;
    for (Expression i : expression.getMean()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "MEAN", t.dataType);
        return new Node("", processor.inValidDataType);
      }
      result += Double.parseDouble(t.value);
      count++;
    }
    result /= count;
    return new Node(Double.toString(result), "NUMBER");
  }
}

