package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class ErrorHandleListener extends BaseErrorListener {

  public List<ValidationError> syntaxError;
  //    It;s used for checking that Expression contain any syntax error or not
  private boolean hasError;

  public ErrorHandleListener() {
    this.hasError = false;
    this.syntaxError = new ArrayList<>();
  }

  public boolean isHasError() {
    return hasError;
  }

  public void setHasError(boolean hasError) {
    this.hasError = hasError;
  }

  @Override
  public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
      int charPositionInLine, String msg, RecognitionException e) {
    hasError = true;
    if (recognizer instanceof Lexer) {
      String errorToken = offendingSymbol != null ? offendingSymbol.toString() : "unknown";
      syntaxError.add(
          new ValidationError("Token \"" + errorToken + " " + msg, (charPositionInLine + 1)));
    } else if (recognizer instanceof Parser) {
      List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
      Collections.reverse(stack);
      syntaxError.add(
          new ValidationError("Token \"" + ((Token) offendingSymbol).getText() + " " + msg,
              (charPositionInLine + 1)));
    }
  }
}
