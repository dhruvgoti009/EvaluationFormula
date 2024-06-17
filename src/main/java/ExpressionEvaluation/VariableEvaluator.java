package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Variable;
import org.example.Node;
import org.example.ValidationError;

public class VariableEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    try {
      return processor.fieldToValue.get(((Variable) exp).getID());
    } catch (Exception ex) {
      processor.semanticErrors.add(
          new ValidationError("Error : undefined variable " + exp, exp.getColumn()));
      return new Node("", processor.inValidDataType);
    }
  }
}
