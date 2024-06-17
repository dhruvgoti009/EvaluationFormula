package ExpressionEvaluation;

import FormulaGrammar.ExactText;
import FormulaGrammar.Expression;
import java.math.BigDecimal;
import org.example.Node;
import org.example.ValidationError;

public class ExactTextEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    ExactText expression = (ExactText) exp;
    Node left = processor.getEvalResult(expression.getExactText().get(0));
    Node right = processor.getEvalResult(expression.getExactText().get(1));
    if (left.dataType.equals(processor.inValidDataType) || right.dataType.equals(
        processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if (!left.dataType.equals(right.dataType)) {
      processor.semanticErrors.add(
          new ValidationError("Error: different data type, " + left + " and another is " + right
              + " in EXACT method ", expression.getExactText().get(0).getColumn()));
      return new Node("", processor.inValidDataType);
    }

    boolean result = left.dataType.equals("NUMBER") && compareNumbers(left.value, right.value);
    if (!left.dataType.equals("NUMBER") && left.value.equals(right.value)) {
      result = true;
    }

    String answer = "True";
    if (!result) {
      answer = "False";
    }
    return new Node(answer, "BOOLEAN");
  }

  private boolean compareNumbers(String numStr1, String numStr2) {
    BigDecimal bd1 = new BigDecimal(numStr1);
    BigDecimal bd2 = new BigDecimal(numStr2);

    return bd1.compareTo(bd2) == 0;
  }
}

