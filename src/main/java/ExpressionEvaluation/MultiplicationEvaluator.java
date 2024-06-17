package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Multiplication;
import org.example.Node;

public class MultiplicationEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Multiplication expression = (Multiplication) exp;
    double result = 1.0;
    for (Expression i : expression.getMultiplication()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "MULTIPLICATION", t.dataType);
        return new Node("", processor.inValidDataType);
      }
      result *= Double.parseDouble(t.value);
    }
    return new Node(Double.toString(result), "NUMBER");
  }
}

