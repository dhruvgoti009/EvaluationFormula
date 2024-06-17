package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Summation extends Expression {

  private List<Expression> summation;

  public Summation(int row, int column) {
    super(row, column);
    this.summation = new ArrayList<>();
  }

  public List<Expression> getSummation() {
    return summation;
  }

  public void setSummation(List<Expression> summation) {
    this.summation = summation;
  }

  public void addExpression(Expression e) {
    summation.add(e);
  }

  public String toString() {
    String str = "SUM( ";
    if (!summation.isEmpty()) {
      str += summation.get(0).toString();
    }
    for (int i = 1; i < summation.size(); i++) {
      str += " , " + summation.get(i).toString();
    }
    str += " )";
    return str;
  }
}
