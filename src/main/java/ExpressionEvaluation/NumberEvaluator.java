package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Number;
import org.example.Node;

public class NumberEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Number expression = (Number) exp;

    return new Node(expression.getValue(), "NUMBER");
  }
}

