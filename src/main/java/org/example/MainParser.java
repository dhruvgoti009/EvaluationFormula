package org.example;

import ExpressionEvaluation.ExpressionProcessor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class MainParser {

  private final Map<String, Node> variable;
  private final String input;

  public MainParser(Map<String, Node> variable, String input) {
    this.variable = variable;
    this.input = input;
  }

  public static formulaParser getParser(String fileName, ErrorHandleListener errorListener) {

//        got lexer token and parser from input file
    formulaParser parser = null;

    CharStream in = CharStreams.fromString(fileName);
    formulaLexer lexer = new formulaLexer(in);
    lexer.removeErrorListeners();
    lexer.addErrorListener(errorListener);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    parser = new formulaParser(tokens);

    parser.removeErrorListeners();
    parser.addErrorListener(errorListener);

    return parser;
  }

  public List<ValidationError> start()
      throws IOException {

    ErrorHandleListener errorListener = new ErrorHandleListener();
    formulaParser parser = getParser(input, errorListener);

//        Tell ANTLR to create parse tree
//        parse starting from 'prog' start variable
    formulaParser.ProgContext antlrAST = parser.prog();

//    If any syntax error then we print it and return
    if (errorListener.isHasError()) {
      return errorListener.syntaxError;
    }

//        Create visitor for converting parse tree into program/mast_grammar.expression tree
    AntlrToProgram progVisitor = new AntlrToProgram(variable);
    Program prog = progVisitor.visit(antlrAST);

//    If SemanticError is empty that means there does not exist any undefined variable(ID)
//    so we check for semantic errors
    if (progVisitor.semanticErrors.isEmpty()) {

//            Just put already declared variable in Map
      Map<String, Node> fieldToValue = new HashMap<>(variable);

//    go for evaluations and check any semantic error or not
      ExpressionProcessor ep = new ExpressionProcessor(prog.expressions, progVisitor.semanticErrors,
          fieldToValue);
      List<Node> FinalAnswer = new ArrayList<>();
      FinalAnswer.addAll(ep.getEvaluationResult());

//            if semanticError is not empty that means there exist a semantic error
      if (ep.semanticErrors.isEmpty()) {

        List<Node> ans = new ArrayList<>();
        for (Map.Entry<String, Node> entry : fieldToValue.entrySet()) {
          if (input.equals(entry.getKey()) || variable.get(entry.getKey()) == null) {
            ans.add(entry.getValue());
          }
        }
        if (ans.size() > 1) {
          List<ValidationError> as = new ArrayList<>();
          as.add(
              new ValidationError("Error : two different expression in one single expression", 1));
          return as;
        }
        List<ValidationError> sucessList = new ArrayList<>();
        for (Node answer : ans) {
          sucessList.add(new ValidationError(answer.value, answer.dataType));
        }
        return sucessList;
      } else {
        return ep.semanticErrors;
      }

    } else {
      return progVisitor.semanticErrors;
    }
  }


}