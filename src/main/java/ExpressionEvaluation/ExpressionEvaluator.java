package ExpressionEvaluation;

import FormulaGrammar.Expression;
import org.example.Node;

public interface ExpressionEvaluator {

  Node evaluate(ExpressionProcessor processor, Expression exp);
}

