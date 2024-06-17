package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class IfLogic extends Expression {

  private List<Expression> ifLogic;

  public IfLogic(int row, int column) {
    super(row, column);
    this.ifLogic = new ArrayList<>();
  }

  public List<Expression> getIfLogic() {
    return ifLogic;
  }

  public void setIfLogic(List<Expression> ifLogic) {
    this.ifLogic = ifLogic;
  }

  public void addExpression(Expression e) {
    ifLogic.add(e);
  }

  public String toString() {
    String str = "IF( ";
    if (!ifLogic.isEmpty()) {
      str += ifLogic.get(0).toString();
    }
    for (int i = 1; i < ifLogic.size(); i++) {
      str += " , " + ifLogic.get(i).toString();
    }
    str += " )";
    return str;
  }

}
