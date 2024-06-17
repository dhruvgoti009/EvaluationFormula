package FormulaGrammar;

import java.util.List;

public class IfsLogic extends Expression {

  private List<Expression> cmp;
  private List<Expression> val;

  public IfsLogic(List<Expression> cmp, List<Expression> val, int row, int column) {
    super(row, column);
    this.cmp = cmp;
    this.val = val;
  }

  public List<Expression> getCmp() {
    return cmp;
  }

  public void setCmp(List<Expression> cmp) {
    this.cmp = cmp;
  }

  public List<Expression> getVal() {
    return val;
  }

  public void setVal(List<Expression> val) {
    this.val = val;
  }

  public String toString() {
    String str = "IFS (";
    if (!cmp.isEmpty()) {
      str += cmp.get(0).toString() + " , ";
      str += val.get(0).toString();
    }
    for (int i = 1; i < cmp.size(); i++) {
      str += " , " + cmp.get(i).toString();
      str += " , " + val.get(i).toString();
    }
    str += " )";
    return str;


  }

}
