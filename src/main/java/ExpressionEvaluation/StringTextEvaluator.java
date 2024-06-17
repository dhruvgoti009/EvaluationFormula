package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.StringText;
import org.example.Node;

public class StringTextEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    return new Node(((StringText) exp).getStr(), "TEXT");
  }
}

