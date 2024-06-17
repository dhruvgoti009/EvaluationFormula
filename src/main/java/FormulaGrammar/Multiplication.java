package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Multiplication extends Expression {

  private List<Expression> multiplication;

  public Multiplication(int row, int column) {
    super(row, column);
    this.multiplication = new ArrayList<>();
  }

  public List<Expression> getMultiplication() {
    return multiplication;
  }

  public void setMultiplication(List<Expression> multiplication) {
    this.multiplication = multiplication;
  }

  public void addExpression(Expression e) {
    multiplication.add(e);
  }

  public String toString() {
    String str = "MULTIPLY( ";
    if (!multiplication.isEmpty()) {
      str += multiplication.get(0).toString();
    }
    for (int i = 1; i < multiplication.size(); i++) {
      str += " , " + multiplication.get(i).toString();
    }
    str += " )";
    return str;
  }
}
