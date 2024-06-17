package FormulaGrammar;

//import mast_grammar.Expression;

import java.util.ArrayList;
import java.util.List;

public class Maximum extends Expression {

  private List<Expression> maximum;

  public Maximum(int row, int column) {
    super(row, column);
    this.maximum = new ArrayList<>();
  }

  public List<Expression> getMaximum() {
    return maximum;
  }

  public void setMaximum(List<Expression> maximum) {
    this.maximum = maximum;
  }

  public void addExpression(Expression e) {
    maximum.add(e);
  }

  public String toString() {
    String str = "MAX( ";
    if (!maximum.isEmpty()) {
      str += maximum.get(0).toString();
    }
    for (int i = 1; i < maximum.size(); i++) {
      str += " , " + maximum.get(i).toString();
    }
    str += " )";
    return str;
  }
}
