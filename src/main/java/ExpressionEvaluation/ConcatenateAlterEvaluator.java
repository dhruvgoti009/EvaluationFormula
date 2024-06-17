package ExpressionEvaluation;

import FormulaGrammar.ConcatenateAlter;
import FormulaGrammar.Expression;
import org.example.Node;

public class ConcatenateAlterEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    ConcatenateAlter expression = (ConcatenateAlter) exp;

    Node left = processor.getEvalResult(expression.getLeft());
    Node right = processor.getEvalResult(expression.getRight());

    if (left.dataType.equals(processor.inValidDataType) || right.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }

    return new Node(left.value + " " + right.value, "TEXT");
  }
}

