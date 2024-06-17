package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Quotient;
import org.example.Node;
import org.example.ValidationError;

public class QuotientEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Quotient expression = (Quotient) exp;
    Node left = processor.getEvalResult(expression.getQuotient().get(0));
    Node right = processor.getEvalResult(expression.getQuotient().get(1));
    if (left.dataType.equals(processor.inValidDataType) || right.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if ((!(left.dataType.equals("NUMBER")))) {
      processor.err(expression.getQuotient().get(0), "NUMBER", "QUOTIENT", left.dataType);
      return new Node("", processor.inValidDataType);
    }
    if ((!(right.dataType.equals("NUMBER")))) {
      processor.err(expression.getQuotient().get(1), "NUMBER", "QUOTIENT", right.dataType);
      return new Node("", processor.inValidDataType);
    }

    if (isExactZero(right.value)) {
      processor.semanticErrors.add(new ValidationError(
          "Denominator with zero number at " + right.value + " in QUOTIENT method",
          expression.getQuotient().get(1).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    if (!isInteger(left.value)) {
      processor.semanticErrors.add(
          new ValidationError("Numerator value must be an INTEGER format here found " + left.value
              + " in QUOTIENT method",
              expression.getQuotient().get(0).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    if (!isInteger(right.value)) {
      processor.semanticErrors.add(
          new ValidationError(
              "Denominator value must be an INTEGER format here found " + right.value
                  + " in QUOTIENT method",
              expression.getQuotient().get(1).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    long numerator = (long) Double.parseDouble(left.value);
    long denominator = (long) Double.parseDouble(right.value);
    if (denominator < 0) {
      numerator *= -1;
      denominator *= -1;
    }

    long result = numerator % denominator;
    result += denominator;
    result %= denominator;

    return new Node(Long.toString(result), "NUMBER");
  }

  private boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      try {
        double d = Double.parseDouble(s);
        return d == Math.floor(d);
      } catch (NumberFormatException ex) {
        return false;
      }
    }
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
