package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.SubstituteText;
import org.example.Node;

public class SubstituteTextEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    SubstituteText expression = (SubstituteText) exp;
    Node original = processor.getEvalResult(expression.getSubstituteText().get(0));
    Node replaceIt = processor.getEvalResult(expression.getSubstituteText().get(1));
    Node replaceWith = processor.getEvalResult(expression.getSubstituteText().get(2));
    if (original.dataType.equals(processor.inValidDataType) || replaceIt.dataType.equals(
        processor.inValidDataType)
        || replaceWith.dataType.equals(processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if ((!(original.dataType.equals("TEXT")))) {
      processor.err(expression.getSubstituteText().get(0), "TEXT", "SUBSTITUTE", original.dataType);
      return new Node("", processor.inValidDataType);
    }
    if ((!(replaceIt.dataType.equals("TEXT")))) {
      processor.err(expression.getSubstituteText().get(1), "TEXT", "SUBSTITUTE",
          replaceIt.dataType);
      return new Node("", processor.inValidDataType);
    }
    if ((!(replaceWith.dataType.equals("TEXT")))) {
      processor.err(expression.getSubstituteText().get(2), "TEXT", "SUBSTITUTE",
          replaceWith.dataType);
      return new Node("", processor.inValidDataType);
    }
    return new Node(original.value.replace(replaceIt.value, replaceWith.value), "TEXT");
  }
}

