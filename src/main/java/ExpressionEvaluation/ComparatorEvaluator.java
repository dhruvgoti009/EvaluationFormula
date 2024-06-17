package ExpressionEvaluation;

import FormulaGrammar.Comparator;
import FormulaGrammar.Expression;
import java.math.BigDecimal;
import org.example.Node;
import org.example.ValidationError;

public class ComparatorEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Comparator expression = (Comparator) exp;
    Node left = processor.getEvalResult(expression.getLeft());
    if (expression.getRight() != null) {
      Node operator = processor.getEvalResult(expression.getOperator());
      Node right = processor.getEvalResult(expression.getRight());
      if (left.dataType.equals(processor.inValidDataType) || operator.dataType.equals(
          processor.inValidDataType)
          || right.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if (!operator.dataType.equals("TEXT")) {
        processor.err(expression.getOperator(), "TEXT", operator.dataType);
        return new Node("", processor.inValidDataType);
      }
      if (!left.dataType.equals(right.dataType)) {
        processor.semanticErrors.add(
            new ValidationError("Error: different data type, " + left.dataType + " and another is "
                + right.dataType,
                expression.getLeft().getColumn()));
        return new Node("", processor.inValidDataType);
      }
      if (!left.dataType.equals("NUMBER") && !left.dataType.equals("TEXT")) {
        processor.err(expression.getLeft(), "NUMBER OR TEXT", left.dataType);
        return new Node("", processor.inValidDataType);
      }
      boolean result = false;
      if (left.dataType.equals("NUMBER")) {
        if (operator.value.equals("=") && compareNumbers(left.value, right.value)) {
          result = true;
        }
        if (operator.value.equals("<") && Double.parseDouble(left.value) < Double.parseDouble(
            right.value)) {
          result = true;
        }
        if (operator.value.equals(">") && Double.parseDouble(left.value) > Double.parseDouble(
            right.value)) {
          result = true;
        }
        if (operator.value.equals("<=") && Double.parseDouble(left.value) <= Double.parseDouble(
            right.value)) {
          result = true;
        }
        if (operator.value.equals(">=") && Double.parseDouble(left.value) >= Double.parseDouble(
            right.value)) {
          result = true;
        }
      } else {
        int lexicoGraphical = left.value.compareTo(right.value);
        if (operator.value.equals("=") && lexicoGraphical == 0) {
          result = true;
        }
        if (operator.value.equals("<") && lexicoGraphical < 0) {
          result = true;
        }
        if (operator.value.equals(">") && lexicoGraphical > 0) {
          result = true;
        }
        if (operator.value.equals("<=") && lexicoGraphical <= 0) {
          result = true;
        }
        if (operator.value.equals(">=") && lexicoGraphical >= 0) {
          result = true;
        }
      }
      String answer = "True";
      if (!result) {
        answer = "False";
      }
      return new Node(answer, "BOOLEAN");
    } else {
      if (left.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if (!left.dataType.equals("BOOLEAN")) {
        processor.err(expression.getLeft(), "BOOLEAN", left.dataType);
        return new Node("", processor.inValidDataType);
      }
      return left;
    }
  }

  private boolean compareNumbers(String numStr1, String numStr2) {
    BigDecimal bd1 = new BigDecimal(numStr1);
    BigDecimal bd2 = new BigDecimal(numStr2);

    return bd1.compareTo(bd2) == 0;
  }
}

