// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\4\1\5\22\0\1\1"+
    "\1\6\1\7\2\0\1\10\1\11\1\0\1\12\1\13"+
    "\1\14\1\15\1\16\1\15\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\26\1\30\1\26"+
    "\1\31\1\32\1\33\1\34\1\35\2\0\32\36\1\37"+
    "\1\40\1\41\1\0\1\36\1\0\1\42\1\43\1\44"+
    "\1\36\1\45\1\46\1\47\1\50\1\51\1\36\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\36\1\60\1\61"+
    "\1\62\1\63\1\64\1\65\1\66\1\67\1\36\1\70"+
    "\1\71\1\72\7\0\1\3\73\0\1\36\7\0\1\36"+
    "\3\0\1\36\3\0\1\36\1\0\1\36\6\0\1\36"+
    "\1\0\1\36\4\0\1\36\7\0\1\36\3\0\1\36"+
    "\3\0\1\36\1\0\1\36\6\0\1\36\1\0\1\36"+
    "\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\7\2\12\1\1\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\15\17\1\22\1\4"+
    "\1\23\1\24\1\0\1\25\2\0\1\2\1\0\1\26"+
    "\1\27\1\30\1\31\11\17\1\32\14\17\2\0\2\33"+
    "\10\17\1\34\2\17\1\35\7\17\1\36\1\17\1\0"+
    "\1\2\1\17\1\37\2\17\1\40\1\17\1\41\1\17"+
    "\1\42\4\17\1\43\1\35\1\17\1\44\1\17\1\45"+
    "\1\35\11\17\1\46\1\17\1\47\1\17\1\50\1\51"+
    "\2\17\1\52\2\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\73\0\166\0\261\0\354\0\73\0\73"+
    "\0\73\0\73\0\u0127\0\73\0\73\0\u0162\0\u019d\0\u01d8"+
    "\0\u0213\0\73\0\u024e\0\u0289\0\u02c4\0\u02ff\0\73\0\73"+
    "\0\u033a\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461\0\u049c\0\u04d7"+
    "\0\u0512\0\u054d\0\u0588\0\u05c3\0\u05fe\0\73\0\u0127\0\73"+
    "\0\73\0\354\0\73\0\u0639\0\u0674\0\u06af\0\u06ea\0\73"+
    "\0\73\0\73\0\73\0\u0725\0\u0760\0\u079b\0\u07d6\0\u0811"+
    "\0\u084c\0\u0887\0\u08c2\0\u08fd\0\u02ff\0\u0938\0\u0973\0\u09ae"+
    "\0\u09e9\0\u0a24\0\u0a5f\0\u0a9a\0\u0ad5\0\u0b10\0\u0b4b\0\u0b86"+
    "\0\u0bc1\0\u0bfc\0\u0c37\0\73\0\u0c72\0\u0cad\0\u0ce8\0\u0d23"+
    "\0\u0d5e\0\u0d99\0\u0dd4\0\u0e0f\0\u0e4a\0\u02ff\0\u0e85\0\u0ec0"+
    "\0\u02ff\0\u0efb\0\u0f36\0\u0f71\0\u0fac\0\u0fe7\0\u1022\0\u105d"+
    "\0\u02ff\0\u1098\0\u10d3\0\u0bfc\0\u110e\0\u02ff\0\u1149\0\u1184"+
    "\0\u02ff\0\u11bf\0\u02ff\0\u11fa\0\u02ff\0\u1235\0\u1270\0\u12ab"+
    "\0\u12e6\0\u02ff\0\u1321\0\u135c\0\u02ff\0\u1397\0\u02ff\0\u13d2"+
    "\0\u140d\0\u1448\0\u1483\0\u14be\0\u14f9\0\u1534\0\u156f\0\u15aa"+
    "\0\u15e5\0\u02ff\0\u1620\0\u02ff\0\u165b\0\u02ff\0\u02ff\0\u1696"+
    "\0\u16d1\0\u02ff\0\u170c\0\u1747";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\2\1\13\1\14\1\15\1\16"+
    "\1\17\7\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\2\1\30\1\26\1\31\1\32\1\33\1\34"+
    "\2\26\1\35\2\26\1\36\2\26\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\2\26\1\46\1\47\1\50"+
    "\75\0\1\3\124\0\1\51\36\0\7\52\1\53\30\52"+
    "\1\54\32\52\21\0\1\17\7\20\56\0\1\55\3\0"+
    "\1\56\71\0\1\57\72\0\1\57\1\0\10\20\76\0"+
    "\1\60\72\0\1\61\72\0\1\62\72\0\1\63\57\0"+
    "\10\26\5\0\1\26\3\0\26\26\24\0\10\26\5\0"+
    "\1\26\3\0\14\26\1\64\1\26\1\65\6\26\1\66"+
    "\24\0\10\26\5\0\1\26\3\0\1\67\13\26\1\70"+
    "\11\26\24\0\10\26\5\0\1\26\3\0\11\26\1\71"+
    "\14\26\24\0\10\26\5\0\1\26\3\0\11\26\1\72"+
    "\2\26\1\73\4\26\1\74\4\26\24\0\10\26\5\0"+
    "\1\26\3\0\4\26\1\75\5\26\1\76\1\77\12\26"+
    "\24\0\10\26\5\0\1\26\3\0\1\100\25\26\24\0"+
    "\10\26\5\0\1\26\3\0\1\101\25\26\24\0\10\26"+
    "\5\0\1\26\3\0\3\26\1\102\15\26\1\103\4\26"+
    "\24\0\10\26\5\0\1\26\3\0\20\26\1\104\2\26"+
    "\1\105\2\26\24\0\10\26\5\0\1\26\3\0\25\26"+
    "\1\106\24\0\10\26\5\0\1\26\3\0\7\26\1\107"+
    "\16\26\24\0\10\26\5\0\1\26\3\0\1\110\25\26"+
    "\24\0\10\26\5\0\1\26\3\0\6\26\1\111\17\26"+
    "\3\0\2\52\4\0\65\52\14\112\1\113\56\112\2\56"+
    "\1\3\2\56\1\4\65\56\21\0\1\114\7\115\63\0"+
    "\10\26\5\0\1\26\3\0\14\26\1\116\11\26\24\0"+
    "\10\26\5\0\1\26\3\0\3\26\1\117\22\26\24\0"+
    "\10\26\5\0\1\26\3\0\20\26\1\120\5\26\24\0"+
    "\10\26\5\0\1\26\3\0\17\26\1\121\6\26\24\0"+
    "\10\26\5\0\1\26\3\0\12\26\1\122\1\123\12\26"+
    "\24\0\10\26\5\0\1\26\3\0\17\26\1\124\6\26"+
    "\24\0\10\26\5\0\1\26\3\0\14\26\1\125\11\26"+
    "\24\0\10\26\5\0\1\26\3\0\16\26\1\126\7\26"+
    "\24\0\10\26\5\0\1\26\3\0\13\26\1\127\12\26"+
    "\24\0\10\26\5\0\1\26\3\0\15\26\1\130\10\26"+
    "\24\0\10\26\5\0\1\26\3\0\20\26\1\131\5\26"+
    "\24\0\10\26\5\0\1\26\3\0\7\26\1\132\16\26"+
    "\24\0\10\26\5\0\1\26\3\0\2\26\1\133\23\26"+
    "\24\0\10\26\5\0\1\26\3\0\20\26\1\134\5\26"+
    "\24\0\10\26\5\0\1\26\3\0\13\26\1\120\12\26"+
    "\24\0\10\26\5\0\1\26\3\0\16\26\1\135\7\26"+
    "\24\0\10\26\5\0\1\26\3\0\7\26\1\136\16\26"+
    "\24\0\10\26\5\0\1\26\3\0\15\26\1\137\10\26"+
    "\24\0\10\26\5\0\1\26\3\0\13\26\1\140\12\26"+
    "\24\0\10\26\5\0\1\26\3\0\16\26\1\141\7\26"+
    "\24\0\10\26\5\0\1\26\3\0\7\26\1\142\16\26"+
    "\3\0\14\112\1\143\72\112\1\143\3\112\1\144\52\112"+
    "\21\0\10\115\63\0\10\26\5\0\1\26\3\0\11\26"+
    "\1\131\14\26\24\0\10\26\5\0\1\26\3\0\1\145"+
    "\25\26\24\0\10\26\5\0\1\26\3\0\3\26\1\131"+
    "\22\26\24\0\10\26\5\0\1\26\3\0\3\26\1\146"+
    "\22\26\24\0\10\26\5\0\1\26\3\0\15\26\1\147"+
    "\10\26\24\0\10\26\5\0\1\26\3\0\17\26\1\150"+
    "\6\26\24\0\10\26\5\0\1\26\3\0\3\26\1\151"+
    "\22\26\24\0\10\26\5\0\1\26\3\0\1\152\25\26"+
    "\24\0\10\26\5\0\1\26\3\0\2\26\1\153\23\26"+
    "\24\0\10\26\5\0\1\26\3\0\14\26\1\154\11\26"+
    "\24\0\10\26\5\0\1\26\3\0\13\26\1\155\12\26"+
    "\24\0\10\26\5\0\1\26\3\0\10\26\1\156\15\26"+
    "\24\0\10\26\5\0\1\26\3\0\21\26\1\157\4\26"+
    "\24\0\10\26\5\0\1\26\3\0\7\26\1\160\16\26"+
    "\24\0\10\26\5\0\1\26\3\0\20\26\1\161\5\26"+
    "\24\0\10\26\5\0\1\26\3\0\3\26\1\162\22\26"+
    "\24\0\10\26\5\0\1\26\3\0\20\26\1\163\5\26"+
    "\24\0\10\26\5\0\1\26\3\0\11\26\1\164\14\26"+
    "\3\0\14\112\1\143\3\112\1\3\52\112\21\0\10\26"+
    "\5\0\1\26\3\0\10\26\1\165\15\26\24\0\10\26"+
    "\5\0\1\26\3\0\11\26\1\166\14\26\24\0\10\26"+
    "\5\0\1\26\3\0\20\26\1\167\5\26\24\0\10\26"+
    "\5\0\1\26\3\0\20\26\1\170\5\26\24\0\10\26"+
    "\5\0\1\26\3\0\16\26\1\171\7\26\24\0\10\26"+
    "\5\0\1\26\3\0\1\172\25\26\24\0\10\26\5\0"+
    "\1\26\3\0\16\26\1\173\7\26\24\0\10\26\5\0"+
    "\1\26\3\0\13\26\1\174\12\26\24\0\10\26\5\0"+
    "\1\26\3\0\2\26\1\175\23\26\24\0\1\26\1\176"+
    "\1\26\1\177\2\26\1\200\1\131\5\0\1\26\3\0"+
    "\15\26\1\201\10\26\24\0\10\26\5\0\1\26\3\0"+
    "\3\26\1\202\22\26\24\0\10\26\5\0\1\26\3\0"+
    "\3\26\1\203\22\26\24\0\3\26\1\177\2\26\1\200"+
    "\1\26\5\0\1\26\3\0\26\26\24\0\10\26\5\0"+
    "\1\26\3\0\20\26\1\204\5\26\24\0\10\26\5\0"+
    "\1\26\3\0\5\26\1\205\20\26\24\0\10\26\5\0"+
    "\1\26\3\0\13\26\1\206\12\26\24\0\10\26\5\0"+
    "\1\26\3\0\5\26\1\131\20\26\24\0\10\26\5\0"+
    "\1\26\3\0\6\26\1\207\17\26\24\0\6\26\1\131"+
    "\1\26\5\0\1\26\3\0\26\26\24\0\2\26\1\131"+
    "\5\26\5\0\1\26\3\0\26\26\24\0\4\26\1\131"+
    "\3\26\5\0\1\26\3\0\26\26\24\0\10\26\5\0"+
    "\1\26\3\0\20\26\1\210\5\26\24\0\10\26\5\0"+
    "\1\26\3\0\24\26\1\211\1\26\24\0\10\26\5\0"+
    "\1\26\3\0\3\26\1\212\22\26\24\0\10\26\5\0"+
    "\1\26\3\0\16\26\1\131\7\26\24\0\1\26\1\213"+
    "\4\26\1\200\1\26\5\0\1\26\3\0\26\26\24\0"+
    "\2\26\1\214\5\26\5\0\1\26\3\0\26\26\24\0"+
    "\7\26\1\131\5\0\1\26\3\0\26\26\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6018];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\4\11\1\1\2\11\4\1\1\11"+
    "\4\1\2\11\15\1\1\11\1\1\2\11\1\0\1\11"+
    "\2\0\1\1\1\0\4\11\26\1\2\0\1\11\26\1"+
    "\1\0\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[140];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 44: break;
          case 3:
            { return token(yytext(), "MOD", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 4:
            { return token(yytext(), "OP_LOGICO", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 5:
            { return token(yytext(), "Parentesis_izq", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 6:
            { return token(yytext(), "Parentesis_der", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 7:
            { return token(yytext(), "OP_ARI", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 8:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 9:
            { return token(yytext(), "PUNTO", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 10:
            { return token(yytext(), "Numero_entero", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 11:
            { return token(yytext(), "P_C", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 12:
            { return token(yytext(), "MENOR_QUE", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          case 13:
            { return token(yytext(), "Asignacion", yyline, yycolumn);
            }
            // fall through
          case 55: break;
          case 14:
            { return token(yytext(), "MAYOR_QUE", yyline, yycolumn);
            }
            // fall through
          case 56: break;
          case 15:
            { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn);
            }
            // fall through
          case 57: break;
          case 16:
            { return token(yytext(), "Corchete_izq", yyline, yycolumn);
            }
            // fall through
          case 58: break;
          case 17:
            { return token(yytext(), "Corchete_der", yyline, yycolumn);
            }
            // fall through
          case 59: break;
          case 18:
            { return token(yytext(), "Llave_izq", yyline, yycolumn);
            }
            // fall through
          case 60: break;
          case 19:
            { return token(yytext(), "Llave_der", yyline, yycolumn);
            }
            // fall through
          case 61: break;
          case 20:
            { return token(yytext(), "NO_IGUAL_A ", yyline, yycolumn);
            }
            // fall through
          case 62: break;
          case 21:
            { return token(yytext(), "STRING", yyline, yycolumn);
            }
            // fall through
          case 63: break;
          case 22:
            { return token(yytext(), "Asignacion_corta", yyline, yycolumn);
            }
            // fall through
          case 64: break;
          case 23:
            { return token(yytext(), ",MENOR_O_IGUAL_QUE", yyline, yycolumn);
            }
            // fall through
          case 65: break;
          case 24:
            { return token(yytext(), "COMPARACION_IGUAL_A", yyline, yycolumn);
            }
            // fall through
          case 66: break;
          case 25:
            { return token(yytext(), "MAYOR_O_IGUAL_QUE", yyline, yycolumn);
            }
            // fall through
          case 67: break;
          case 26:
            { return token(yytext(), "PALABRA_IF", yyline, yycolumn);
            }
            // fall through
          case 68: break;
          case 27:
            { return token(yytext(), "Numero_Flotante", yyline, yycolumn);
            }
            // fall through
          case 69: break;
          case 28:
            { return token(yytext(), "FOR", yyline, yycolumn);
            }
            // fall through
          case 70: break;
          case 29:
            { return token(yytext(), "TIPO_DATO", yyline, yycolumn);
            }
            // fall through
          case 71: break;
          case 30:
            { return token(yytext(), "TIPO_V", yyline, yycolumn);
            }
            // fall through
          case 72: break;
          case 31:
            { return token(yytext(), "CASE", yyline, yycolumn);
            }
            // fall through
          case 73: break;
          case 32:
            { return token(yytext(), "PALABRA_ELSE", yyline, yycolumn);
            }
            // fall through
          case 74: break;
          case 33:
            { return token(yytext(), "FUNC", yyline, yycolumn);
            }
            // fall through
          case 75: break;
          case 34:
            { return token(yytext(), "MAIN", yyline, yycolumn);
            }
            // fall through
          case 76: break;
          case 35:
            { return token(yytext(), "TYPE", yyline, yycolumn);
            }
            // fall through
          case 77: break;
          case 36:
            { return token(yytext(), "BREAK", yyline, yycolumn);
            }
            // fall through
          case 78: break;
          case 37:
            { return token(yytext(), "TIPO_C", yyline, yycolumn);
            }
            // fall through
          case 79: break;
          case 38:
            { return token(yytext(), "WHILE", yyline, yycolumn);
            }
            // fall through
          case 80: break;
          case 39:
            { return token(yytext(), "IMPORTACION", yyline, yycolumn);
            }
            // fall through
          case 81: break;
          case 40:
            { return token(yytext(), "RETORNO", yyline, yycolumn);
            }
            // fall through
          case 82: break;
          case 41:
            { return token(yytext(), "PALABRA_SWITCH", yyline, yycolumn);
            }
            // fall through
          case 83: break;
          case 42:
            { return token(yytext(), "PACKAGE", yyline, yycolumn);
            }
            // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
