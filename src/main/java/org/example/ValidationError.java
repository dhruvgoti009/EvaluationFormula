package org.example;

public class ValidationError {

  public String error;
  public int line;

  public String result;
  public String dataType;

  public ValidationError(String result, String dataType) {
    this.result = result;
    this.dataType = dataType;
  }


  public ValidationError(String error, int line) {
    this.error = error;
    this.line = line;
  }
}
