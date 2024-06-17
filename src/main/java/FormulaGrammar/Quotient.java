package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Quotient extends Expression {

  private List<Expression> quotient;

  public Quotient(int row, int column) {
    super(row, column);
    this.quotient = new ArrayList<>();
  }

  public List<Expression> getQuotient() {
    return quotient;
  }

  public void setQuotient(List<Expression> quotient) {
    this.quotient = quotient;
  }

  public void addExpression(Expression e) {
    quotient.add(e);
  }

  public String toString() {
    String str = "QUOTIENT( ";
    if (!quotient.isEmpty()) {
      str += quotient.get(0).toString();
    }
    for (int i = 1; i < quotient.size(); i++) {
      str += " , " + quotient.get(i).toString();
    }
    str += " )";
    return str;
  }
}
