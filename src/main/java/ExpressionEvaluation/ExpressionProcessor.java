package ExpressionEvaluation;

import FormulaGrammar.Expression;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.example.Node;
import org.example.ValidationError;


public class ExpressionProcessor {

  public List<Expression> list;
  public List<ValidationError> semanticErrors;
  public Map<String, Node> fieldToValue;
  //  is used for special case of CONCATENATE in which IF condition occur then it's different data type allowed.

  public String inValidDataType = "####";


  public ExpressionProcessor(List<Expression> list, List<ValidationError> semanticErrors,
      Map<String, Node> fieldToValue) {
    this.list = list;
    this.semanticErrors = semanticErrors;
    this.fieldToValue = fieldToValue;

  }

  public List<Node> getEvaluationResult() {
    List<Node> ans = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {
      Expression exp = list.get(i);

      Node evaluation = getEvalResult(exp);

      if (evaluation.dataType.equals(inValidDataType)) {
        break;
      }
      ans.add(new Node(exp + " is " + evaluation.value, evaluation.dataType));
//      System.out.println(inp.get(i));
      fieldToValue.put(list.get(i).toString(), evaluation);
    }
    return ans;
  }


  public void err(Expression exp, String expect, String have) {
    semanticErrors.add(
        new ValidationError("Error: expect " + expect + " instead of " + exp + " ( " + have + " ) ",
            exp.getColumn()));
  }

  public void err(Expression exp, String expect, String expression, String have) {
    semanticErrors.add(
        new ValidationError("Error: expect " + expect + " instead of " + exp + "( " + have
            + " ) in \" + expression + \" method\"", exp.getColumn()));
  }

  public Node getEvalResult(Expression exp) {
    ExpressionEvaluator evaluator = ExpressionType.getEvaluatorFor(exp.getClass());
    if (evaluator != null) {
      return evaluator.evaluate(this, exp);
    } else {
      // Handle the case where no evaluator is found for the expression type
      return new Node("", inValidDataType);
    }
  }

}


