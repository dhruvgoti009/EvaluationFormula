package ExpressionEvaluation;

import FormulaGrammar.Average;
import FormulaGrammar.Expression;
import org.example.Node;

public class AverageEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Average expression = (Average) exp;

    double result = 0.0;
    long count = 0;
    for (Expression i : expression.getAverage()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "AVERAGE", t.dataType);
        return new Node("", processor.inValidDataType);
      }
      result += Double.parseDouble(t.value);
      count++;
    }
    result /= count;
    return new Node(Double.toString(result), "NUMBER");
  }
}

