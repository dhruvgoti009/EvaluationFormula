package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class DurationDate extends Expression {

  private List<Expression> durationDate;

  public DurationDate(int row, int column) {
    super(row, column);
    this.durationDate = new ArrayList<>();
  }

  public List<Expression> getDurationDate() {
    return durationDate;
  }

  public void setDurationDate(List<Expression> durationDate) {
    this.durationDate = durationDate;
  }

  public void addExpression(Expression e) {
    durationDate.add(e);
  }

  public String toString() {
    String str = "DURATION( ";
    if (!durationDate.isEmpty()) {
      str += durationDate.get(0).toString();
    }
    for (int i = 1; i < durationDate.size(); i++) {
      str += " , " + durationDate.get(i).toString();
    }
    str += " )";
    return str;
  }
}
