package FormulaGrammar;

import java.util.ArrayList;
import java.util.List;

public class Mean extends Expression {

  private List<Expression> mean;

  public Mean(int row, int column) {
    super(row, column);
    this.mean = new ArrayList<>();
  }

  public List<Expression> getMean() {
    return mean;
  }

  public void setMean(List<Expression> mean) {
    this.mean = mean;
  }

  public void addExpression(Expression e) {
    mean.add(e);
  }

  public String toString() {
    String str = "MEAN( ";
    if (!mean.isEmpty()) {
      str += mean.get(0).toString();
    }
    for (int i = 1; i < mean.size(); i++) {
      str += " , " + mean.get(i).toString();
    }
    str += " )";
    return str;
  }
}
