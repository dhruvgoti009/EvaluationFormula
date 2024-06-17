package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Operator;
import org.example.Node;

public class OperatorEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    return new Node(((Operator) exp).getOpr(), "TEXT");
  }
}
