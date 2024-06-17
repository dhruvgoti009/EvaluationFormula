package ExpressionEvaluation;

import FormulaGrammar.ConcatenateText;
import FormulaGrammar.Expression;
import org.example.Node;

public class ConcatenateTextEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    ConcatenateText expression = (ConcatenateText) exp;

    StringBuilder result = new StringBuilder();
    for (Expression i : expression.getConcatenate()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      result.append(t.value);
    }

    return new Node(result.toString(), "TEXT");
  }


}

