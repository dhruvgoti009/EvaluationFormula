package ExpressionEvaluation;

import FormulaGrammar.DivisionAlter;
import FormulaGrammar.Expression;
import java.math.BigDecimal;
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
    String trimmedStr = numberStr.trim();

    // Step 2: Create a BigDecimal object
    BigDecimal bigDecimal = new BigDecimal(trimmedStr);

    // Step 3: Compare with BigDecimal.ZERO
    return bigDecimal.compareTo(BigDecimal.ZERO) == 0;
  }

}

