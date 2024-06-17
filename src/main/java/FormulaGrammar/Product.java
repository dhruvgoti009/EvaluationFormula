package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Product extends Expression {

  private List<Expression> product;

  public Product(int row, int column) {
    super(row, column);
    this.product = new ArrayList<>();
  }

  public List<Expression> getProduct() {
    return product;
  }

  public void setProduct(List<Expression> product) {
    this.product = product;
  }

  public void addExpression(Expression e) {
    product.add(e);
  }

  public String toString() {
    String str = "PRODUCT( ";
    if (!product.isEmpty()) {
      str += product.get(0).toString();
    }
    for (int i = 1; i < product.size(); i++) {
      str += " , " + product.get(i).toString();
    }
    str += " )";
    return str;
  }
}
