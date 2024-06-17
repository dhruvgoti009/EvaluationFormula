package ExpressionEvaluation;

import FormulaGrammar.DivisionAlter;
import FormulaGrammar.Expression;
import org.example.Node;
import org.example.ValidationError;

public class DivisionAlterEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    DivisionAlter expression = (DivisionAlter) exp;
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

    if (isExactZero(right.value)) {
      processor.semanticErrors.add(new ValidationError("Divide with zero number at " + right.value,
          expression.getLeft().getColumn()));
      return new Node("", processor.inValidDataType);
    }

    double result = Double.parseDouble(left.value) / Double.parseDouble(right.value);
    return new Node(Double.toString(result), "NUMBER");
  }

  private boolean isExactZero(String numberStr) {
    // Remove leading zeros
    String normalizedStr = numberStr.replaceFirst("^0+", "");

    // If the string is empty after removing leading zeros, it means it was all zeros
    if (normalizedStr.isEmpty()) {
      return true;
    }

    // If there's a decimal point, we need to check further
    if (normalizedStr.contains(".")) {
      // Remove trailing zeros after the decimal point
      normalizedStr = normalizedStr.replaceAll("0+$", "");
      // After removing trailing zeros, if it's just "0.", then it's zero
      if (normalizedStr.equals("0.")) {
        return true;
      }
    }

    // Check if the normalized string is exactly "0"
    return normalizedStr.equals("0");
  }

}

