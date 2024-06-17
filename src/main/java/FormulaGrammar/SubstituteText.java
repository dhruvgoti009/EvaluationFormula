package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class SubstituteText extends Expression {

  private List<Expression> substituteText;

  public SubstituteText(int row, int column) {
    super(row, column);
    this.substituteText = new ArrayList<>();
  }

  public List<Expression> getSubstituteText() {
    return substituteText;
  }

  public void setSubstituteText(List<Expression> substituteText) {
    this.substituteText = substituteText;
  }

  public void addExpression(Expression e) {
    substituteText.add(e);
  }

  public String toString() {
    String str = "SUBSTITUTE( ";
    if (!substituteText.isEmpty()) {
      str += substituteText.get(0).toString();
    }
    for (int i = 1; i < substituteText.size(); i++) {
      str += " , " + substituteText.get(i).toString();
    }
    str += " )";
    return str;
  }
}
