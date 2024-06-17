package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class SubtractDate extends Expression {

  private List<Expression> subtractDate;

  public SubtractDate(int row, int column) {
    super(row, column);
    this.subtractDate = new ArrayList<>();
  }

  public List<Expression> getSubtractDate() {
    return subtractDate;
  }

  public void setSubtractDate(List<Expression> subtractDate) {
    this.subtractDate = subtractDate;
  }

  public void addExpression(Expression e) {
    subtractDate.add(e);
  }

  public String toString() {
    String str = "DATE.SUBTRACT( ";
    if (!subtractDate.isEmpty()) {
      str += subtractDate.get(0).toString();
    }
    for (int i = 1; i < subtractDate.size(); i++) {
      str += " , " + subtractDate.get(i).toString();
    }
    str += " )";
    return str;
  }
}
