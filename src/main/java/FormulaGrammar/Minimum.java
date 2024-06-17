package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Minimum extends Expression {

  private List<Expression> minimum;

  public Minimum(int row, int column) {
    super(row, column);
    this.minimum = new ArrayList<>();
  }

  public List<Expression> getMinimum() {
    return minimum;
  }

  public void setMinimum(List<Expression> minimum) {
    this.minimum = minimum;
  }

  public void addExpression(Expression e) {
    minimum.add(e);
  }

  public String toString() {
    String str = "MIN( ";
    if (!minimum.isEmpty()) {
      str += minimum.get(0).toString();
    }
    for (int i = 1; i < minimum.size(); i++) {
      str += " , " + minimum.get(i).toString();
    }
    str += " )";
    return str;
  }
}
