package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.IfsLogic;
import org.example.Node;
import org.example.ValidationError;

public class IfsLogicEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    IfsLogic expression = (IfsLogic) exp;

    for (int i = 0; i < expression.getCmp().size(); i++) {
      Node t = processor.getEvalResult(expression.getCmp().get(i));
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("BOOLEAN")))) {
        processor.err(expression.getCmp().get(i), "BOOLEAN", "IFS", t.dataType);
        return new Node("", processor.inValidDataType);
      }

      if (t.value.equals("True")) {
        return processor.getEvalResult(expression.getVal().get(i));
      }
    }

    processor.semanticErrors.add(
        new ValidationError("At least one condition must be true in IFS method", exp.getColumn()));

    return new Node("", processor.inValidDataType);
  }
}

