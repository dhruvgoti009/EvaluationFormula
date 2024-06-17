package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.SumAlter;
import org.example.Node;

public class SumAlterEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    SumAlter expression = (SumAlter) exp;
    Node left = processor.getEvalResult(expression.getLeft());
    Node right = processor.getEvalResult(expression.getRight());
    if (left.dataType.equals(processor.inValidDataType) || right.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if ((!(left.dataType.equals("NUMBER")))) {
      processor.err(expression.getLeft(), "NUMBER", left.dataType);
      return new Node("", processor.inValidDataType);
    }
    if ((!(right.dataType.equals("NUMBER")))) {
      processor.err(expression.getRight(), "NUMBER", right.dataType);
      return new Node("", processor.inValidDataType);
    }
    double result = Double.parseDouble(left.value) + Double.parseDouble(right.value);
    return new Node(Double.toString(result), "NUMBER");
  }
}
