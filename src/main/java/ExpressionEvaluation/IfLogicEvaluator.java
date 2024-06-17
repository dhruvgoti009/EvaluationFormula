package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.IfLogic;
import org.example.Node;

public class IfLogicEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    IfLogic expression = (IfLogic) exp;
    Node cmp = processor.getEvalResult(expression.getIfLogic().get(0));
    Node ifTrue = processor.getEvalResult(expression.getIfLogic().get(1));
    Node ifFalse = processor.getEvalResult(expression.getIfLogic().get(2));
    if (cmp.dataType.equals(processor.inValidDataType) || ifTrue.dataType.equals(
        processor.inValidDataType)
        || ifFalse.dataType.equals(processor.inValidDataType)) {
      return new Node("", processor.inValidDataType);
    }
    if ((!(cmp.dataType.equals("BOOLEAN")))) {
      processor.err(expression.getIfLogic().get(0), "BOOLEAN", "IF", cmp.dataType);
      return new Node("", processor.inValidDataType);
    }

    Node result = ifTrue;
    if (cmp.value.equals("False")) {
      result = ifFalse;
    }
    return result;
  }
}
