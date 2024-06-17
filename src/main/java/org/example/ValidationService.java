package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ValidationService {


  List<ValidationError> validation(Map<String, Node> variable, String input)
      throws IOException {
    MainParser obj = new MainParser(variable, input);
    return obj.start();
  }


}
