grammar formula;

/*
    Parser
*/

/*
    Start variable
*/

prog :(exp)+ EOF                                                   # Program
     ;

exp : QUOTIENT '(' exp (',' exp )+')'                              # Quotient
     | exp '/' exp                                                 # DivisionAlter
     | exp '*' exp                                                 # MultiplyAlter
     | MULTIPLY '(' exp (',' exp)* ')'                             # Multiplication
     | PRODUCT '(' exp (',' exp)* ')'                              # Product
     | exp '+' exp                                                 # SumAlter
     | SUM '(' exp (',' exp)* ')'                                  # Summation
     | exp '-' exp                                                 # SubtractAlter
     | MAX '(' exp (',' exp)* ')'                                  # Maximum
     | MIN '(' exp (',' exp)* ')'                                  # Minimum
     | AVERAGE '(' exp (',' exp)* ')'                              # Average
     | MEAN '(' exp (',' exp)* ')'                                 # Mean
     | ID                                                          # Variable
     | NUM                                                         # Number
     | STRING                                                      # StringText
     | IF '(' cmp  ','  exp  (','  exp)+  ')'                      # IfLogic
     | IFS '('  cmp ',' exp  (','  cmp ',' exp )*  ')'             # IfsLogic
     | SUBSTITUTE '(' exp ',' exp (','exp)+ ')'                    # SubstituteText
     | EXACT '(' exp (',' exp)+ ')'                                # ExactText
     | CONCATENATE  '(' exp (',' exp)* ')'                         # ConcatenateText
     | exp '&' exp                                                 # ConcatenateAlter
     | TODAY '.' DATE '('')'                                       # TodayDate
     | DATE '.' ADD  '(' exp (',' exp)+ ')'                        # AddDate
     | DATE '.' SUBTRACT  '(' exp (',' exp)+ ')'                   # SubtractDate
     | DURATION '(' exp (',' exp)+ ')'                             # DurationDate
     ;

cmp : exp (opr exp)?                                               # Comparator
    ;

opr : (EQUAL | GEQUAL | LEQUAL | GT | LT)                          # Operator
    ;

/*
    Lexer
*/

EQUAL  : '=';
GEQUAL : '>=';
LEQUAL : '<=';
GT     : '>';
LT     : '<';

IF     : 'IF';
IFS    : 'IFS';



MAX     : 'MAX';
MIN     : 'MIN';
MEAN    : 'MEAN';
AVERAGE : 'AVERAGE';


QUOTIENT : 'QUOTIENT';
MULTIPLY : 'MULTIPLY';
PRODUCT  : 'PRODUCT';
SUM      : 'SUM';


SUBSTITUTE : 'SUBSTITUTE';
EXACT      : 'EXACT';
CONCATENATE : 'CONCATENATE';




TODAY    : 'TODAY';
DATE     : 'DATE';
SUBTRACT : 'SUBTRACT';
ADD      : 'ADD';
DURATION : 'DURATION';












NUM : '0'
    | [1-9][0-9]*
    | ([0-9]+'.'[0-9]* | '.'[0-9]+)
    | [1-9][0-9]*'.'[0-9]*([eE][+-]?[0-9]+)?
    ;

//ID  : [a-zA-Z]+ [0-9]+ ;
ID  : [a-zA-Z_][a-zA-Z0-9_]* ;
STRING : '"' (~["\\] | '\\' .)* '"' ;   // take all string except " and \



WS : [ \t\n]+ ->skip;
COMMENT: '//' ~[\r\n]* -> skip;