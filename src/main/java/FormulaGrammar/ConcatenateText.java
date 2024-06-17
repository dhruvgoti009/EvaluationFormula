package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateText extends Expression {

  private List<Expression> concatenate;

  public ConcatenateText(int row, int column) {
    super(row, column);
    this.concatenate = new ArrayList<>();
  }

  public List<Expression> getConcatenate() {
    return concatenate;
  }

  public void setConcatenate(List<Expression> concatenate) {
    this.concatenate = concatenate;
  }

  public void addExpression(Expression e) {
    concatenate.add(e);
  }

  public String toString() {
    String str = "CONCATENATE( ";
    if (!concatenate.isEmpty()) {
      str += concatenate.get(0).toString();
    }
    for (int i = 1; i < concatenate.size(); i++) {
      str += " , " + concatenate.get(i).toString();
    }
    str += " )";
    return str;
  }
}
