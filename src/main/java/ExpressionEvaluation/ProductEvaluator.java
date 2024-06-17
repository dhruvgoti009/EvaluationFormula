package ExpressionEvaluation;

import FormulaGrammar.Expression;
import FormulaGrammar.Product;
import org.example.Node;

public class ProductEvaluator implements ExpressionEvaluator {

  @Override
  public Node evaluate(ExpressionProcessor processor, Expression exp) {
    Product expression = (Product) exp;
    double result = 1.0;
    for (Expression i : expression.getProduct()) {
      Node t = processor.getEvalResult(i);
      if (t.dataType.equals(processor.inValidDataType)) {
        return new Node("", processor.inValidDataType);
      }
      if ((!(t.dataType.equals("NUMBER")))) {
        processor.err(i, "NUMBER", "PRODUCT", t.dataType);
        return new Node("", processor.inValidDataType);
      }
      result *= Double.parseDouble(t.value);
    }
    return new Node(Double.toString(result), "NUMBER");
  }
}

