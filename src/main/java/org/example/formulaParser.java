// Generated from /Users/dhruv.goti/Desktop/Validation_Gradle/src/main/java/org/example/formula.g4 by ANTLR 4.13.1
package org.example;

import java.util.List;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class formulaParser extends Parser {

  public static final int
      T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
      EQUAL = 10, GEQUAL = 11, LEQUAL = 12, GT = 13, LT = 14, IF = 15, IFS = 16, MAX = 17, MIN = 18,
      MEAN = 19, AVERAGE = 20, QUOTIENT = 21, MULTIPLY = 22, PRODUCT = 23, SUM = 24, SUBSTITUTE = 25,
      EXACT = 26, CONCATENATE = 27, TODAY = 28, DATE = 29, SUBTRACT = 30, ADD = 31, DURATION = 32,
      NUM = 33, ID = 34, STRING = 35, WS = 36, COMMENT = 37;
  public static final int
      RULE_prog = 0, RULE_math = 1, RULE_cmp = 2, RULE_opr = 3;
  public static final String[] ruleNames = makeRuleNames();
  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;
  public static final String _serializedATN =
      "\u0004\u0001%\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
          "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b" +
          "\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u0016" +
          "\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001" +
          "\n\u0001\f\u0001$\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u0001" +
          "0\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001<\t\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0005\u0001E\b\u0001\n\u0001\f\u0001H\t\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0005\u0001Q\b\u0001\n\u0001\f\u0001T\t\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001" +
          "]\b\u0001\n\u0001\f\u0001`\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001i\b\u0001" +
          "\n\u0001\f\u0001l\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0004\u0001z\b\u0001\u000b\u0001\f\u0001{\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005" +
          "\u0001\u008a\b\u0001\n\u0001\f\u0001\u008d\t\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0004\u0001\u0098\b\u0001\u000b\u0001\f\u0001\u0099\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0004\u0001\u00a3\b\u0001\u000b\u0001\f\u0001\u00a4\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0005\u0001\u00ae\b\u0001\n\u0001\f\u0001\u00b1\t\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0004\u0001\u00c1\b\u0001\u000b\u0001\f\u0001\u00c2\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0004\u0001\u00ce\b\u0001\u000b\u0001\f\u0001" +
          "\u00cf\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0004\u0001\u00d9\b\u0001\u000b\u0001\f\u0001\u00da" +
          "\u0001\u0001\u0001\u0001\u0003\u0001\u00df\b\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
          "\u0001\u0001\u0005\u0001\u00f0\b\u0001\n\u0001\f\u0001\u00f3\t\u0001\u0001" +
          "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f9\b\u0002\u0001" +
          "\u0003\u0001\u0003\u0001\u0003\u0000\u0001\u0002\u0004\u0000\u0002\u0004" +
          "\u0006\u0000\u0001\u0001\u0000\n\u000e\u0122\u0000\t\u0001\u0000\u0000" +
          "\u0000\u0002\u00de\u0001\u0000\u0000\u0000\u0004\u00f4\u0001\u0000\u0000" +
          "\u0000\u0006\u00fa\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000" +
          "\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001" +
          "\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000" +
          "\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000" +
          "\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u0011\u0005\u0015\u0000" +
          "\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0015\u0003\u0002\u0001" +
          "\u0000\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0016\u0003\u0002\u0001" +
          "\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000" +
          "\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000" +
          "\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0003\u0000" +
          "\u0000\u001a\u00df\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0016\u0000" +
          "\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\"\u0003\u0002\u0001\u0000" +
          "\u001e\u001f\u0005\u0002\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 \u001e" +
          "\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000" +
          "\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000" +
          "\u0000\u0000%&\u0005\u0003\u0000\u0000&\u00df\u0001\u0000\u0000\u0000" +
          "\'(\u0005\u0017\u0000\u0000()\u0005\u0001\u0000\u0000).\u0003\u0002\u0001" +
          "\u0000*+\u0005\u0002\u0000\u0000+-\u0003\u0002\u0001\u0000,*\u0001\u0000" +
          "\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001" +
          "\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000" +
          "12\u0005\u0003\u0000\u00002\u00df\u0001\u0000\u0000\u000034\u0005\u0018" +
          "\u0000\u000045\u0005\u0001\u0000\u00005:\u0003\u0002\u0001\u000067\u0005" +
          "\u0002\u0000\u000079\u0003\u0002\u0001\u000086\u0001\u0000\u0000\u0000" +
          "9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000" +
          "\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0003" +
          "\u0000\u0000>\u00df\u0001\u0000\u0000\u0000?@\u0005\u0011\u0000\u0000" +
          "@A\u0005\u0001\u0000\u0000AF\u0003\u0002\u0001\u0000BC\u0005\u0002\u0000" +
          "\u0000CE\u0003\u0002\u0001\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000" +
          "\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001" +
          "\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000\u0000" +
          "J\u00df\u0001\u0000\u0000\u0000KL\u0005\u0012\u0000\u0000LM\u0005\u0001" +
          "\u0000\u0000MR\u0003\u0002\u0001\u0000NO\u0005\u0002\u0000\u0000OQ\u0003" +
          "\u0002\u0001\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000" +
          "RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000" +
          "\u0000TR\u0001\u0000\u0000\u0000UV\u0005\u0003\u0000\u0000V\u00df\u0001" +
          "\u0000\u0000\u0000WX\u0005\u0014\u0000\u0000XY\u0005\u0001\u0000\u0000" +
          "Y^\u0003\u0002\u0001\u0000Z[\u0005\u0002\u0000\u0000[]\u0003\u0002\u0001" +
          "\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000" +
          "\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001" +
          "\u0000\u0000\u0000ab\u0005\u0003\u0000\u0000b\u00df\u0001\u0000\u0000" +
          "\u0000cd\u0005\u0013\u0000\u0000de\u0005\u0001\u0000\u0000ej\u0003\u0002" +
          "\u0001\u0000fg\u0005\u0002\u0000\u0000gi\u0003\u0002\u0001\u0000hf\u0001" +
          "\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000" +
          "jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000" +
          "\u0000mn\u0005\u0003\u0000\u0000n\u00df\u0001\u0000\u0000\u0000o\u00df" +
          "\u0005\"\u0000\u0000p\u00df\u0005!\u0000\u0000q\u00df\u0005#\u0000\u0000" +
          "rs\u0005\u000f\u0000\u0000st\u0005\u0001\u0000\u0000tu\u0003\u0004\u0002" +
          "\u0000uv\u0005\u0002\u0000\u0000vy\u0003\u0002\u0001\u0000wx\u0005\u0002" +
          "\u0000\u0000xz\u0003\u0002\u0001\u0000yw\u0001\u0000\u0000\u0000z{\u0001" +
          "\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000" +
          "|}\u0001\u0000\u0000\u0000}~\u0005\u0003\u0000\u0000~\u00df\u0001\u0000" +
          "\u0000\u0000\u007f\u0080\u0005\u0010\u0000\u0000\u0080\u0081\u0005\u0001" +
          "\u0000\u0000\u0081\u0082\u0003\u0004\u0002\u0000\u0082\u0083\u0005\u0002" +
          "\u0000\u0000\u0083\u008b\u0003\u0002\u0001\u0000\u0084\u0085\u0005\u0002" +
          "\u0000\u0000\u0085\u0086\u0003\u0004\u0002\u0000\u0086\u0087\u0005\u0002" +
          "\u0000\u0000\u0087\u0088\u0003\u0002\u0001\u0000\u0088\u008a\u0001\u0000" +
          "\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000" +
          "\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000" +
          "\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000" +
          "\u0000\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u00df\u0001\u0000" +
          "\u0000\u0000\u0090\u0091\u0005\u0019\u0000\u0000\u0091\u0092\u0005\u0001" +
          "\u0000\u0000\u0092\u0093\u0003\u0002\u0001\u0000\u0093\u0094\u0005\u0002" +
          "\u0000\u0000\u0094\u0097\u0003\u0002\u0001\u0000\u0095\u0096\u0005\u0002" +
          "\u0000\u0000\u0096\u0098\u0003\u0002\u0001\u0000\u0097\u0095\u0001\u0000" +
          "\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000" +
          "\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000" +
          "\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u00df\u0001\u0000" +
          "\u0000\u0000\u009d\u009e\u0005\u001a\u0000\u0000\u009e\u009f\u0005\u0001" +
          "\u0000\u0000\u009f\u00a2\u0003\u0002\u0001\u0000\u00a0\u00a1\u0005\u0002" +
          "\u0000\u0000\u00a1\u00a3\u0003\u0002\u0001\u0000\u00a2\u00a0\u0001\u0000" +
          "\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000" +
          "\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000" +
          "\u0000\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00df\u0001\u0000" +
          "\u0000\u0000\u00a8\u00a9\u0005\u001b\u0000\u0000\u00a9\u00aa\u0005\u0001" +
          "\u0000\u0000\u00aa\u00af\u0003\u0002\u0001\u0000\u00ab\u00ac\u0005\u0002" +
          "\u0000\u0000\u00ac\u00ae\u0003\u0002\u0001\u0000\u00ad\u00ab\u0001\u0000" +
          "\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000" +
          "\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000" +
          "\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0003" +
          "\u0000\u0000\u00b3\u00df\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u001c" +
          "\u0000\u0000\u00b5\u00b6\u0005\t\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000" +
          "\u0000\u00b7\u00b8\u0005\u0001\u0000\u0000\u00b8\u00df\u0005\u0003\u0000" +
          "\u0000\u00b9\u00ba\u0005\u001d\u0000\u0000\u00ba\u00bb\u0005\t\u0000\u0000" +
          "\u00bb\u00bc\u0005\u001f\u0000\u0000\u00bc\u00bd\u0005\u0001\u0000\u0000" +
          "\u00bd\u00c0\u0003\u0002\u0001\u0000\u00be\u00bf\u0005\u0002\u0000\u0000" +
          "\u00bf\u00c1\u0003\u0002\u0001\u0000\u00c0\u00be\u0001\u0000\u0000\u0000" +
          "\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000" +
          "\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000" +
          "\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00df\u0001\u0000\u0000\u0000" +
          "\u00c6\u00c7\u0005\u001d\u0000\u0000\u00c7\u00c8\u0005\t\u0000\u0000\u00c8" +
          "\u00c9\u0005\u001e\u0000\u0000\u00c9\u00ca\u0005\u0001\u0000\u0000\u00ca" +
          "\u00cd\u0003\u0002\u0001\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc" +
          "\u00ce\u0003\u0002\u0001\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce" +
          "\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf" +
          "\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1" +
          "\u00d2\u0005\u0003\u0000\u0000\u00d2\u00df\u0001\u0000\u0000\u0000\u00d3" +
          "\u00d4\u0005 \u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5\u00d8" +
          "\u0003\u0002\u0001\u0000\u00d6\u00d7\u0005\u0002\u0000\u0000\u00d7\u00d9" +
          "\u0003\u0002\u0001\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da" +
          "\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db" +
          "\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd" +
          "\u0005\u0003\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u000f" +
          "\u0001\u0000\u0000\u0000\u00de\u001b\u0001\u0000\u0000\u0000\u00de\'\u0001" +
          "\u0000\u0000\u0000\u00de3\u0001\u0000\u0000\u0000\u00de?\u0001\u0000\u0000" +
          "\u0000\u00deK\u0001\u0000\u0000\u0000\u00deW\u0001\u0000\u0000\u0000\u00de" +
          "c\u0001\u0000\u0000\u0000\u00deo\u0001\u0000\u0000\u0000\u00dep\u0001" +
          "\u0000\u0000\u0000\u00deq\u0001\u0000\u0000\u0000\u00der\u0001\u0000\u0000" +
          "\u0000\u00de\u007f\u0001\u0000\u0000\u0000\u00de\u0090\u0001\u0000\u0000" +
          "\u0000\u00de\u009d\u0001\u0000\u0000\u0000\u00de\u00a8\u0001\u0000\u0000" +
          "\u0000\u00de\u00b4\u0001\u0000\u0000\u0000\u00de\u00b9\u0001\u0000\u0000" +
          "\u0000\u00de\u00c6\u0001\u0000\u0000\u0000\u00de\u00d3\u0001\u0000\u0000" +
          "\u0000\u00df\u00f1\u0001\u0000\u0000\u0000\u00e0\u00e1\n\u0018\u0000\u0000" +
          "\u00e1\u00e2\u0005\u0004\u0000\u0000\u00e2\u00f0\u0003\u0002\u0001\u0019" +
          "\u00e3\u00e4\n\u0017\u0000\u0000\u00e4\u00e5\u0005\u0005\u0000\u0000\u00e5" +
          "\u00f0\u0003\u0002\u0001\u0018\u00e6\u00e7\n\u0014\u0000\u0000\u00e7\u00e8" +
          "\u0005\u0006\u0000\u0000\u00e8\u00f0\u0003\u0002\u0001\u0015\u00e9\u00ea" +
          "\n\u0012\u0000\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb\u00f0\u0003" +
          "\u0002\u0001\u0013\u00ec\u00ed\n\u0005\u0000\u0000\u00ed\u00ee\u0005\b" +
          "\u0000\u0000\u00ee\u00f0\u0003\u0002\u0001\u0006\u00ef\u00e0\u0001\u0000" +
          "\u0000\u0000\u00ef\u00e3\u0001\u0000\u0000\u0000\u00ef\u00e6\u0001\u0000" +
          "\u0000\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000" +
          "\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000" +
          "\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u0003\u0001\u0000" +
          "\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f8\u0003\u0002" +
          "\u0001\u0000\u00f5\u00f6\u0003\u0006\u0003\u0000\u00f6\u00f7\u0003\u0002" +
          "\u0001\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000" +
          "\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0005\u0001\u0000" +
          "\u0000\u0000\u00fa\u00fb\u0007\u0000\u0000\u0000\u00fb\u0007\u0001\u0000" +
          "\u0000\u0000\u0015\u000b\u0017\".:FR^j{\u008b\u0099\u00a4\u00af\u00c2" +
          "\u00cf\u00da\u00de\u00ef\u00f1\u00f8";
  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
      new PredictionContextCache();
  private static final String[] _LITERAL_NAMES = makeLiteralNames();
  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  static {
    RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
  }

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }

  public formulaParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  private static String[] makeRuleNames() {
    return new String[]{
        "prog", "math", "cmp", "opr"
    };
  }

  private static String[] makeLiteralNames() {
    return new String[]{
        null, "'('", "','", "')'", "'/'", "'*'", "'+'", "'-'", "'&'", "'.'",
        "'='", "'>='", "'<='", "'>'", "'<'", "'IF'", "'IFS'", "'MAX'", "'MIN'",
        "'MEAN'", "'AVERAGE'", "'QUOTIENT'", "'MULTIPLY'", "'PRODUCT'", "'SUM'",
        "'SUBSTITUTE'", "'EXACT'", "'CONCATENATE'", "'TODAY'", "'DATE'", "'SUBTRACT'",
        "'ADD'", "'DURATION'"
    };
  }

  private static String[] makeSymbolicNames() {
    return new String[]{
        null, null, null, null, null, null, null, null, null, null, "EQUAL",
        "GEQUAL", "LEQUAL", "GT", "LT", "IF", "IFS", "MAX", "MIN", "MEAN", "AVERAGE",
        "QUOTIENT", "MULTIPLY", "PRODUCT", "SUM", "SUBSTITUTE", "EXACT", "CONCATENATE",
        "TODAY", "DATE", "SUBTRACT", "ADD", "DURATION", "NUM", "ID", "STRING",
        "WS", "COMMENT"
    };
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "formula.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public final ProgContext prog() throws RecognitionException {
    ProgContext _localctx = new ProgContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_prog);
    int _la;
    try {
      _localctx = new ProgramContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
        setState(9);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(8);
              math(0);
            }
          }
          setState(11);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65498218496L) != 0));
        setState(13);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final MathContext math() throws RecognitionException {
    return math(0);
  }

  private MathContext math(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    MathContext _localctx = new MathContext(_ctx, _parentState);
    MathContext _prevctx = _localctx;
    int _startState = 2;
    enterRecursionRule(_localctx, 2, RULE_math, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(222);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
          case 1: {
            _localctx = new QuotientContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;

            setState(16);
            match(QUOTIENT);
            setState(17);
            match(T__0);
            setState(18);
            math(0);
            setState(21);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(19);
                  match(T__1);
                  setState(20);
                  math(0);
                }
              }
              setState(23);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(25);
            match(T__2);
          }
          break;
          case 2: {
            _localctx = new MultiplicationContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(27);
            match(MULTIPLY);
            setState(28);
            match(T__0);
            setState(29);
            math(0);
            setState(34);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(30);
                  match(T__1);
                  setState(31);
                  math(0);
                }
              }
              setState(36);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(37);
            match(T__2);
          }
          break;
          case 3: {
            _localctx = new ProductContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(39);
            match(PRODUCT);
            setState(40);
            match(T__0);
            setState(41);
            math(0);
            setState(46);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(42);
                  match(T__1);
                  setState(43);
                  math(0);
                }
              }
              setState(48);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(49);
            match(T__2);
          }
          break;
          case 4: {
            _localctx = new SummationContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(51);
            match(SUM);
            setState(52);
            match(T__0);
            setState(53);
            math(0);
            setState(58);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(54);
                  match(T__1);
                  setState(55);
                  math(0);
                }
              }
              setState(60);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(61);
            match(T__2);
          }
          break;
          case 5: {
            _localctx = new MaximumContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(63);
            match(MAX);
            setState(64);
            match(T__0);
            setState(65);
            math(0);
            setState(70);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(66);
                  match(T__1);
                  setState(67);
                  math(0);
                }
              }
              setState(72);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(73);
            match(T__2);
          }
          break;
          case 6: {
            _localctx = new MinimumContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(75);
            match(MIN);
            setState(76);
            match(T__0);
            setState(77);
            math(0);
            setState(82);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(78);
                  match(T__1);
                  setState(79);
                  math(0);
                }
              }
              setState(84);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(85);
            match(T__2);
          }
          break;
          case 7: {
            _localctx = new AverageContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(87);
            match(AVERAGE);
            setState(88);
            match(T__0);
            setState(89);
            math(0);
            setState(94);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(90);
                  match(T__1);
                  setState(91);
                  math(0);
                }
              }
              setState(96);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(97);
            match(T__2);
          }
          break;
          case 8: {
            _localctx = new MeanContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(99);
            match(MEAN);
            setState(100);
            match(T__0);
            setState(101);
            math(0);
            setState(106);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(102);
                  match(T__1);
                  setState(103);
                  math(0);
                }
              }
              setState(108);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(109);
            match(T__2);
          }
          break;
          case 9: {
            _localctx = new VariableContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(111);
            match(ID);
          }
          break;
          case 10: {
            _localctx = new NumberContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(112);
            match(NUM);
          }
          break;
          case 11: {
            _localctx = new StringTextContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(113);
            match(STRING);
          }
          break;
          case 12: {
            _localctx = new IfLogicContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(114);
            match(IF);
            setState(115);
            match(T__0);
            setState(116);
            cmp();
            setState(117);
            match(T__1);
            setState(118);
            math(0);
            setState(121);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(119);
                  match(T__1);
                  setState(120);
                  math(0);
                }
              }
              setState(123);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(125);
            match(T__2);
          }
          break;
          case 13: {
            _localctx = new IfsLogicContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(127);
            match(IFS);
            setState(128);
            match(T__0);
            setState(129);
            cmp();
            setState(130);
            match(T__1);
            setState(131);
            math(0);
            setState(139);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(132);
                  match(T__1);
                  setState(133);
                  cmp();
                  setState(134);
                  match(T__1);
                  setState(135);
                  math(0);
                }
              }
              setState(141);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(142);
            match(T__2);
          }
          break;
          case 14: {
            _localctx = new SubstituteTextContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(144);
            match(SUBSTITUTE);
            setState(145);
            match(T__0);
            setState(146);
            math(0);
            setState(147);
            match(T__1);
            setState(148);
            math(0);
            setState(151);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(149);
                  match(T__1);
                  setState(150);
                  math(0);
                }
              }
              setState(153);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(155);
            match(T__2);
          }
          break;
          case 15: {
            _localctx = new ExactTextContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(157);
            match(EXACT);
            setState(158);
            match(T__0);
            setState(159);
            math(0);
            setState(162);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(160);
                  match(T__1);
                  setState(161);
                  math(0);
                }
              }
              setState(164);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(166);
            match(T__2);
          }
          break;
          case 16: {
            _localctx = new ConcatenateTextContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(168);
            match(CONCATENATE);
            setState(169);
            match(T__0);
            setState(170);
            math(0);
            setState(175);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__1) {
              {
                {
                  setState(171);
                  match(T__1);
                  setState(172);
                  math(0);
                }
              }
              setState(177);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(178);
            match(T__2);
          }
          break;
          case 17: {
            _localctx = new TodayDateContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(180);
            match(TODAY);
            setState(181);
            match(T__8);
            setState(182);
            match(DATE);
            setState(183);
            match(T__0);
            setState(184);
            match(T__2);
          }
          break;
          case 18: {
            _localctx = new AddDateContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(185);
            match(DATE);
            setState(186);
            match(T__8);
            setState(187);
            match(ADD);
            setState(188);
            match(T__0);
            setState(189);
            math(0);
            setState(192);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(190);
                  match(T__1);
                  setState(191);
                  math(0);
                }
              }
              setState(194);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(196);
            match(T__2);
          }
          break;
          case 19: {
            _localctx = new SubtractDateContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(198);
            match(DATE);
            setState(199);
            match(T__8);
            setState(200);
            match(SUBTRACT);
            setState(201);
            match(T__0);
            setState(202);
            math(0);
            setState(205);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(203);
                  match(T__1);
                  setState(204);
                  math(0);
                }
              }
              setState(207);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(209);
            match(T__2);
          }
          break;
          case 20: {
            _localctx = new DurationDateContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(211);
            match(DURATION);
            setState(212);
            match(T__0);
            setState(213);
            math(0);
            setState(216);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
                {
                  setState(214);
                  match(T__1);
                  setState(215);
                  math(0);
                }
              }
              setState(218);
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while (_la == T__1);
            setState(220);
            match(T__2);
          }
          break;
        }
        _ctx.stop = _input.LT(-1);
        setState(241);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
        while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) {
              triggerExitRuleEvent();
            }
            _prevctx = _localctx;
            {
              setState(239);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1: {
                  _localctx = new DivisionAlterContext(new MathContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_math);
                  setState(224);
                  if (!(precpred(_ctx, 24))) {
                    throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                  }
                  setState(225);
                  match(T__3);
                  setState(226);
                  math(25);
                }
                break;
                case 2: {
                  _localctx = new MultiplyAlterContext(new MathContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_math);
                  setState(227);
                  if (!(precpred(_ctx, 23))) {
                    throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                  }
                  setState(228);
                  match(T__4);
                  setState(229);
                  math(24);
                }
                break;
                case 3: {
                  _localctx = new SumAlterContext(new MathContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_math);
                  setState(230);
                  if (!(precpred(_ctx, 20))) {
                    throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                  }
                  setState(231);
                  match(T__5);
                  setState(232);
                  math(21);
                }
                break;
                case 4: {
                  _localctx = new SubtractAlterContext(new MathContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_math);
                  setState(233);
                  if (!(precpred(_ctx, 18))) {
                    throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                  }
                  setState(234);
                  match(T__6);
                  setState(235);
                  math(19);
                }
                break;
                case 5: {
                  _localctx = new ConcatenateAlterContext(
                      new MathContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_math);
                  setState(236);
                  if (!(precpred(_ctx, 5))) {
                    throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                  }
                  setState(237);
                  match(T__7);
                  setState(238);
                  math(6);
                }
                break;
              }
            }
          }
          setState(243);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 19, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  public final CmpContext cmp() throws RecognitionException {
    CmpContext _localctx = new CmpContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_cmp);
    int _la;
    try {
      _localctx = new ComparatorContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
        setState(244);
        math(0);
        setState(248);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) {
          {
            setState(245);
            opr();
            setState(246);
            math(0);
          }
        }

      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public final OprContext opr() throws RecognitionException {
    OprContext _localctx = new OprContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_opr);
    int _la;
    try {
      _localctx = new OperatorContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
        setState(250);
        _la = _input.LA(1);
        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) {
            matchedEOF = true;
          }
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 1:
        return math_sempred((MathContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean math_sempred(MathContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 24);
      case 1:
        return precpred(_ctx, 23);
      case 2:
        return precpred(_ctx, 20);
      case 3:
        return precpred(_ctx, 18);
      case 4:
        return precpred(_ctx, 5);
    }
    return true;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProgContext extends ParserRuleContext {

    public ProgContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public ProgContext() {
    }

    @Override
    public int getRuleIndex() {
      return RULE_prog;
    }

    public void copyFrom(ProgContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProgramContext extends ProgContext {

    public ProgramContext(ProgContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode EOF() {
      return getToken(formulaParser.EOF, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterProgram(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitProgram(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitProgram(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MathContext extends ParserRuleContext {

    public MathContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public MathContext() {
    }

    @Override
    public int getRuleIndex() {
      return RULE_math;
    }

    public void copyFrom(MathContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MeanContext extends MathContext {

    public MeanContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode MEAN() {
      return getToken(formulaParser.MEAN, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterMean(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitMean(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitMean(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MultiplicationContext extends MathContext {

    public MultiplicationContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode MULTIPLY() {
      return getToken(formulaParser.MULTIPLY, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterMultiplication(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitMultiplication(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitMultiplication(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MinimumContext extends MathContext {

    public MinimumContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode MIN() {
      return getToken(formulaParser.MIN, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterMinimum(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitMinimum(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitMinimum(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class VariableContext extends MathContext {

    public VariableContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode ID() {
      return getToken(formulaParser.ID, 0);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterVariable(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitVariable(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitVariable(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProductContext extends MathContext {

    public ProductContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode PRODUCT() {
      return getToken(formulaParser.PRODUCT, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterProduct(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitProduct(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitProduct(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SubstituteTextContext extends MathContext {

    public SubstituteTextContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode SUBSTITUTE() {
      return getToken(formulaParser.SUBSTITUTE, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterSubstituteText(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitSubstituteText(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitSubstituteText(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ConcatenateTextContext extends MathContext {

    public ConcatenateTextContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode CONCATENATE() {
      return getToken(formulaParser.CONCATENATE, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterConcatenateText(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitConcatenateText(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitConcatenateText(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SubtractAlterContext extends MathContext {

    public SubtractAlterContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterSubtractAlter(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitSubtractAlter(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitSubtractAlter(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MaximumContext extends MathContext {

    public MaximumContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode MAX() {
      return getToken(formulaParser.MAX, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterMaximum(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitMaximum(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitMaximum(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NumberContext extends MathContext {

    public NumberContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode NUM() {
      return getToken(formulaParser.NUM, 0);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterNumber(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitNumber(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitNumber(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DivisionAlterContext extends MathContext {

    public DivisionAlterContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterDivisionAlter(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitDivisionAlter(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitDivisionAlter(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExactTextContext extends MathContext {

    public ExactTextContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode EXACT() {
      return getToken(formulaParser.EXACT, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterExactText(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitExactText(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitExactText(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ConcatenateAlterContext extends MathContext {

    public ConcatenateAlterContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterConcatenateAlter(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitConcatenateAlter(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitConcatenateAlter(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MultiplyAlterContext extends MathContext {

    public MultiplyAlterContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterMultiplyAlter(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitMultiplyAlter(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitMultiplyAlter(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DurationDateContext extends MathContext {

    public DurationDateContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode DURATION() {
      return getToken(formulaParser.DURATION, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterDurationDate(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitDurationDate(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitDurationDate(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AverageContext extends MathContext {

    public AverageContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode AVERAGE() {
      return getToken(formulaParser.AVERAGE, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterAverage(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitAverage(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitAverage(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SumAlterContext extends MathContext {

    public SumAlterContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterSumAlter(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitSumAlter(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitSumAlter(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StringTextContext extends MathContext {

    public StringTextContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode STRING() {
      return getToken(formulaParser.STRING, 0);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterStringText(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitStringText(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitStringText(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SubtractDateContext extends MathContext {

    public SubtractDateContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode DATE() {
      return getToken(formulaParser.DATE, 0);
    }

    public TerminalNode SUBTRACT() {
      return getToken(formulaParser.SUBTRACT, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterSubtractDate(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitSubtractDate(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitSubtractDate(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AddDateContext extends MathContext {

    public AddDateContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode DATE() {
      return getToken(formulaParser.DATE, 0);
    }

    public TerminalNode ADD() {
      return getToken(formulaParser.ADD, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterAddDate(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitAddDate(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitAddDate(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IfLogicContext extends MathContext {

    public IfLogicContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode IF() {
      return getToken(formulaParser.IF, 0);
    }

    public CmpContext cmp() {
      return getRuleContext(CmpContext.class, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterIfLogic(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitIfLogic(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitIfLogic(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IfsLogicContext extends MathContext {

    public IfsLogicContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode IFS() {
      return getToken(formulaParser.IFS, 0);
    }

    public List<CmpContext> cmp() {
      return getRuleContexts(CmpContext.class);
    }

    public CmpContext cmp(int i) {
      return getRuleContext(CmpContext.class, i);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterIfsLogic(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitIfsLogic(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitIfsLogic(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TodayDateContext extends MathContext {

    public TodayDateContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode TODAY() {
      return getToken(formulaParser.TODAY, 0);
    }

    public TerminalNode DATE() {
      return getToken(formulaParser.DATE, 0);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterTodayDate(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitTodayDate(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitTodayDate(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class QuotientContext extends MathContext {

    public QuotientContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode QUOTIENT() {
      return getToken(formulaParser.QUOTIENT, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterQuotient(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitQuotient(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitQuotient(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SummationContext extends MathContext {

    public SummationContext(MathContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode SUM() {
      return getToken(formulaParser.SUM, 0);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterSummation(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitSummation(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitSummation(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CmpContext extends ParserRuleContext {

    public CmpContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public CmpContext() {
    }

    @Override
    public int getRuleIndex() {
      return RULE_cmp;
    }

    public void copyFrom(CmpContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ComparatorContext extends CmpContext {

    public ComparatorContext(CmpContext ctx) {
      copyFrom(ctx);
    }

    public List<MathContext> math() {
      return getRuleContexts(MathContext.class);
    }

    public MathContext math(int i) {
      return getRuleContext(MathContext.class, i);
    }

    public OprContext opr() {
      return getRuleContext(OprContext.class, 0);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterComparator(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitComparator(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitComparator(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class OprContext extends ParserRuleContext {

    public OprContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    public OprContext() {
    }

    @Override
    public int getRuleIndex() {
      return RULE_opr;
    }

    public void copyFrom(OprContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class OperatorContext extends OprContext {

    public OperatorContext(OprContext ctx) {
      copyFrom(ctx);
    }

    public TerminalNode EQUAL() {
      return getToken(formulaParser.EQUAL, 0);
    }

    public TerminalNode GEQUAL() {
      return getToken(formulaParser.GEQUAL, 0);
    }

    public TerminalNode LEQUAL() {
      return getToken(formulaParser.LEQUAL, 0);
    }

    public TerminalNode GT() {
      return getToken(formulaParser.GT, 0);
    }

    public TerminalNode LT() {
      return getToken(formulaParser.LT, 0);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).enterOperator(this);
      }
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof formulaListener) {
        ((formulaListener) listener).exitOperator(this);
      }
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof formulaVisitor) {
        return ((formulaVisitor<? extends T>) visitor).visitOperator(this);
      } else {
        return visitor.visitChildren(this);
      }
    }
  }
}