package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class AddDate extends Expression {

  private List<Expression> addDate;

  public AddDate(int row, int column) {
    super(row, column);
    this.addDate = new ArrayList<>();
  }

  public List<Expression> getAddDate() {
    return addDate;
  }

  public void setAddDate(List<Expression> addDate) {
    this.addDate = addDate;
  }

  public void addExpression(Expression e) {
    addDate.add(e);
  }

  public String toString() {
    String str = "DATE.ADD( ";
    if (!addDate.isEmpty()) {
      str += addDate.get(0).toString();
    }
    for (int i = 1; i < addDate.size(); i++) {
      str += " , " + addDate.get(i).toString();
    }
    str += " )";
    return str;
  }
}
