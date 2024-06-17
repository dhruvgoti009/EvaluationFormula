package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class ExactText extends Expression {

  private List<Expression> exactText;

  public ExactText(int row, int column) {
    super(row, column);
    this.exactText = new ArrayList<>();
  }

  public void addExpression(Expression e) {
    exactText.add(e);
  }

  public List<Expression> getExactText() {
    return exactText;
  }

  public void setExactText(List<Expression> exactText) {
    this.exactText = exactText;
  }

  public String toString() {
    String str = "EXACT( ";
    if (!exactText.isEmpty()) {
      str += exactText.get(0).toString();
    }
    for (int i = 1; i < exactText.size(); i++) {
      str += " , " + exactText.get(i).toString();
    }
    str += " )";
    return str;
  }
}
