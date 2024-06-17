package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Average extends Expression {

  private List<Expression> average;

  public Average(int row, int column) {
    super(row, column);
    this.average = new ArrayList<>();
  }

  public List<Expression> getAverage() {
    return average;
  }

  public void setAverage(List<Expression> average) {
    this.average = average;
  }

  public void addExpression(Expression e) {
    average.add(e);
  }

  public String toString() {
    String str = "AVERAGE( ";
    if (!average.isEmpty()) {
      str += average.get(0).toString();
    }
    for (int i = 1; i < average.size(); i++) {
      str += " , " + average.get(i).toString();
    }
    str += " )";
    return str;
  }
}
