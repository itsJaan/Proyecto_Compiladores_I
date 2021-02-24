/* The following code was generated by JFlex 1.4.3 on 2/23/21 7:18 p.m. */

package proyectocompiladores;
import static proyectocompiladores.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2/23/21 7:18 p.m. from the specification file
 * <tt>C:/Users/ItsJaan/Documents/Docs Importantes/CLSS/ProyectoCompiladores/src/proyectocompiladores/Analizador_Lexico.flex</tt>
 */
class Analizador_Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\12\1\15\25\0\1\12\1\0\1\14\3\0\1\20\1\16"+
    "\2\17\2\11\1\0\1\1\1\17\1\0\1\2\1\46\1\46\1\2"+
    "\1\46\5\2\2\0\3\4\2\0\1\37\1\27\1\31\1\10\1\32"+
    "\1\34\1\36\1\42\1\21\1\3\1\45\1\30\1\6\1\35\1\7"+
    "\1\22\1\3\1\23\1\25\1\24\1\26\1\44\1\41\1\43\1\40"+
    "\1\3\1\0\1\11\1\0\1\11\1\3\1\0\1\37\1\27\1\31"+
    "\1\10\1\32\1\34\1\36\1\42\1\21\1\3\1\45\1\30\1\6"+
    "\1\35\1\7\1\22\1\3\1\23\1\13\1\24\1\33\1\44\1\41"+
    "\1\43\1\40\1\3\1\17\1\5\1\17\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\4\3\1\5\1\6"+
    "\1\3\1\7\1\10\2\7\1\11\17\3\1\12\1\3"+
    "\2\12\1\3\1\12\12\3\1\12\3\3\1\0\1\13"+
    "\1\12\5\3\1\12\22\3\1\12\3\3\1\12\1\3"+
    "\1\12\3\3\2\12\1\3\1\12\4\3\1\12\1\3"+
    "\1\12\3\3\1\12\4\3\1\12\4\3\1\14\2\12"+
    "\4\3\1\12\4\3\3\12\3\3\1\12\3\3\1\12"+
    "\1\3\1\12\1\3\1\12\1\3\1\12\1\3\1\12"+
    "\1\3\2\12\11\3\2\12\2\3\3\12\6\3\1\12"+
    "\3\3\1\12\4\3\2\12\2\3\2\12\1\3\2\12"+
    "\2\3\1\12\4\3\1\12\3\3\2\12\1\3\1\12"+
    "\1\3\2\12\1\3\1\12\2\3\2\12\1\3\2\12"+
    "\1\3\1\12\1\3\2\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[220];
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
    "\0\0\0\47\0\116\0\116\0\165\0\47\0\234\0\303"+
    "\0\352\0\u0111\0\47\0\u0138\0\u015f\0\u0186\0\47\0\u01ad"+
    "\0\47\0\47\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297"+
    "\0\u02be\0\u02e5\0\u030c\0\u0333\0\u035a\0\u0381\0\u03a8\0\u03cf"+
    "\0\u03f6\0\u041d\0\u0444\0\u046b\0\165\0\u0492\0\u04b9\0\u04e0"+
    "\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u05f1\0\u0618"+
    "\0\u063f\0\u0666\0\u0666\0\u068d\0\u06b4\0\u06db\0\u01ad\0\u0702"+
    "\0\u0729\0\u0750\0\u0777\0\u079e\0\u07c5\0\u07ec\0\u0813\0\u083a"+
    "\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd\0\u0924\0\u094b\0\u0972"+
    "\0\u0999\0\u09c0\0\u09e7\0\u0a0e\0\u0a35\0\u0a5c\0\u0a83\0\u0aaa"+
    "\0\u09c0\0\u0ad1\0\u0af8\0\u0b1f\0\u0b46\0\u0b6d\0\u0b94\0\u0bbb"+
    "\0\u0be2\0\u0c09\0\u0c30\0\u0c57\0\u0c7e\0\u0ca5\0\u0ccc\0\u0cf3"+
    "\0\u0d1a\0\u0d41\0\u0d68\0\u0d8f\0\u0c7e\0\u0db6\0\u0ddd\0\u0c30"+
    "\0\u0e04\0\u0e2b\0\u0e52\0\u0e79\0\u0ea0\0\u0ec7\0\u0eee\0\u0f15"+
    "\0\u0f3c\0\u0f63\0\u06db\0\u0f8a\0\u0fb1\0\u0fd8\0\u0fff\0\u0ca5"+
    "\0\u1026\0\u0f63\0\u104d\0\u1074\0\u109b\0\u10c2\0\u10e9\0\u104d"+
    "\0\u1110\0\u1137\0\u115e\0\u1185\0\u11ac\0\u11d3\0\u11fa\0\u1221"+
    "\0\u1248\0\u126f\0\u1296\0\u12bd\0\u12e4\0\u130b\0\u1332\0\u1332"+
    "\0\u1359\0\u1359\0\u1380\0\u13a7\0\u13ce\0\u13f5\0\u141c\0\u1443"+
    "\0\u146a\0\u12e4\0\u1491\0\u14b8\0\u14df\0\u1506\0\u152d\0\u13a7"+
    "\0\u152d\0\u1554\0\u1491\0\u146a\0\u157b\0\u15a2\0\u15c9\0\u15f0"+
    "\0\u1617\0\u163e\0\u1665\0\u168c\0\u16b3\0\u16da\0\u1701\0\u1728"+
    "\0\u174f\0\u1776\0\u179d\0\u0f3c\0\u1728\0\u17c4\0\u17eb\0\u1812"+
    "\0\u1839\0\u1839\0\u1860\0\u1887\0\u1887\0\u18ae\0\u18d5\0\u18fc"+
    "\0\u1923\0\u1860\0\u194a\0\u174f\0\u1971\0\u1998\0\u19bf\0\u16da"+
    "\0\u19e6\0\u1a0d\0\u1a34\0\u1a5b\0\u1a82\0\u1aa9\0\u1aa9\0\u1ad0"+
    "\0\u1af7\0\u1a82\0\u1af7\0\u0cf3\0\u1b1e\0\u1026\0\u1a0d\0\u1b45"+
    "\0\u1b6c\0\u1b93\0\u1bba\0\u1b93";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[220];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\5\1\40"+
    "\1\5\1\41\4\5\1\4\51\0\1\4\43\0\1\4"+
    "\2\0\2\5\1\0\4\5\2\0\1\5\5\0\26\5"+
    "\2\0\2\5\1\0\1\42\1\43\1\44\1\5\2\0"+
    "\1\45\5\0\1\46\1\5\1\47\1\50\1\45\1\51"+
    "\1\5\1\52\1\5\1\53\1\51\1\45\1\54\1\5"+
    "\1\55\1\56\1\5\1\57\1\60\3\5\2\0\2\5"+
    "\1\0\1\61\1\5\1\61\1\5\2\0\1\5\5\0"+
    "\26\5\2\0\2\5\1\0\1\45\3\5\2\0\1\5"+
    "\5\0\2\5\1\45\23\5\2\0\2\5\1\0\1\62"+
    "\1\5\1\45\1\5\2\0\1\5\5\0\1\63\25\5"+
    "\12\0\2\14\35\0\2\5\1\0\1\64\3\5\1\0"+
    "\1\14\1\65\5\0\3\5\1\50\13\5\1\56\6\5"+
    "\15\66\1\0\31\66\15\67\1\0\31\67\2\0\2\5"+
    "\1\0\1\70\1\43\2\5\2\0\1\5\5\0\13\5"+
    "\1\45\1\71\11\5\2\0\2\5\1\0\1\72\3\5"+
    "\2\0\1\5\5\0\2\5\1\73\2\5\1\74\4\5"+
    "\1\74\13\5\2\0\2\5\1\0\1\75\3\5\2\0"+
    "\1\5\5\0\11\5\1\75\14\5\2\0\2\5\1\0"+
    "\1\76\1\5\1\45\1\5\2\0\1\5\5\0\2\5"+
    "\1\77\16\5\1\100\4\5\2\0\2\5\1\0\1\101"+
    "\3\5\2\0\1\5\5\0\3\5\1\50\1\5\1\102"+
    "\4\5\1\102\4\5\1\56\6\5\2\0\2\5\1\0"+
    "\1\103\3\5\2\0\1\5\5\0\14\5\1\103\11\5"+
    "\2\0\2\5\1\0\1\104\1\5\1\104\1\5\2\0"+
    "\1\5\5\0\26\5\2\0\2\5\1\0\1\105\1\5"+
    "\1\106\1\5\2\0\1\5\5\0\1\107\25\5\2\0"+
    "\2\5\1\0\1\110\1\5\1\110\1\5\2\0\1\5"+
    "\5\0\26\5\2\0\2\5\1\0\1\111\3\5\2\0"+
    "\1\5\5\0\7\5\1\52\4\5\1\112\5\5\1\60"+
    "\3\5\2\0\2\5\1\0\1\113\3\5\2\0\1\5"+
    "\5\0\5\5\1\102\4\5\1\102\1\5\1\103\11\5"+
    "\2\0\2\5\1\0\1\114\1\5\1\11\1\5\2\0"+
    "\1\5\5\0\5\5\1\115\4\5\1\115\3\5\1\55"+
    "\7\5\2\0\2\5\1\0\1\116\3\5\2\0\1\5"+
    "\5\0\5\5\1\117\3\5\1\120\1\117\13\5\2\0"+
    "\2\5\1\0\1\121\3\5\2\0\1\45\5\0\4\5"+
    "\1\45\7\5\1\112\11\5\2\0\2\5\1\0\1\122"+
    "\3\5\2\0\1\5\5\0\2\5\1\123\16\5\1\124"+
    "\4\5\2\0\2\5\1\0\1\125\1\45\1\126\1\127"+
    "\2\0\1\130\5\0\1\131\1\132\1\133\1\134\1\130"+
    "\1\135\1\136\1\137\1\5\1\140\1\135\1\5\1\141"+
    "\5\5\1\142\1\5\1\135\1\5\2\0\2\5\1\0"+
    "\1\132\3\5\2\0\1\5\5\0\1\5\1\132\24\5"+
    "\2\0\2\5\1\0\1\143\1\5\1\126\1\127\2\0"+
    "\1\5\5\0\2\5\1\45\11\5\1\144\11\5\2\0"+
    "\2\5\1\0\1\145\1\45\2\5\2\0\1\5\5\0"+
    "\24\5\1\135\1\5\2\0\2\5\1\0\1\146\3\5"+
    "\2\0\1\5\5\0\1\147\4\5\1\135\4\5\1\135"+
    "\13\5\2\0\2\5\1\0\1\150\3\5\2\0\1\5"+
    "\5\0\2\5\1\150\23\5\2\0\2\5\1\0\1\151"+
    "\3\5\2\0\1\5\5\0\6\5\1\136\1\152\4\5"+
    "\1\153\11\5\2\0\2\5\1\0\1\135\3\5\2\0"+
    "\1\135\5\0\4\5\1\135\21\5\2\0\2\5\1\0"+
    "\1\154\3\5\2\0\1\5\5\0\3\5\1\155\16\5"+
    "\1\142\3\5\2\0\2\5\1\0\1\156\2\5\1\45"+
    "\2\0\1\5\5\0\3\5\1\156\22\5\2\0\2\5"+
    "\1\0\1\52\3\5\2\0\1\5\5\0\7\5\1\52"+
    "\16\5\2\0\2\5\1\0\1\157\3\5\2\0\1\157"+
    "\5\0\4\5\1\157\21\5\2\0\2\5\1\0\1\160"+
    "\3\5\2\0\1\5\5\0\1\161\10\5\1\140\14\5"+
    "\2\0\2\5\1\0\1\142\3\5\2\0\1\5\5\0"+
    "\1\142\25\5\2\0\2\5\1\0\1\127\2\5\1\127"+
    "\2\0\1\5\5\0\26\5\2\0\2\5\1\0\2\45"+
    "\2\5\2\0\1\5\5\0\26\5\2\0\2\5\1\0"+
    "\1\162\3\5\2\0\1\157\5\0\2\5\1\150\1\5"+
    "\1\157\21\5\2\0\2\5\1\0\4\5\1\0\1\14"+
    "\1\65\5\0\26\5\14\66\1\163\1\0\31\66\2\0"+
    "\2\5\1\0\1\164\3\5\2\0\1\5\5\0\1\5"+
    "\1\132\1\5\1\165\22\5\2\0\2\5\1\0\1\165"+
    "\3\5\2\0\1\5\5\0\3\5\1\165\22\5\2\0"+
    "\2\5\1\0\1\166\3\5\2\0\1\5\5\0\1\167"+
    "\5\5\1\170\17\5\2\0\2\5\1\0\1\167\3\5"+
    "\2\0\1\5\5\0\1\167\25\5\2\0\2\5\1\0"+
    "\1\170\3\5\2\0\1\5\5\0\6\5\1\170\17\5"+
    "\2\0\2\5\1\0\1\155\3\5\2\0\1\5\5\0"+
    "\3\5\1\155\22\5\2\0\2\5\1\0\1\171\3\5"+
    "\2\0\1\5\5\0\5\5\1\135\3\5\1\140\1\135"+
    "\13\5\2\0\2\5\1\0\1\135\3\5\2\0\1\5"+
    "\5\0\5\5\1\135\4\5\1\135\13\5\2\0\2\5"+
    "\1\0\1\140\3\5\2\0\1\5\5\0\11\5\1\140"+
    "\14\5\2\0\2\5\1\0\1\172\3\5\2\0\1\157"+
    "\5\0\2\5\1\150\1\5\1\157\1\5\1\45\17\5"+
    "\2\0\2\5\1\0\1\45\3\5\2\0\1\5\5\0"+
    "\6\5\1\45\17\5\2\0\2\5\1\0\1\173\3\5"+
    "\2\0\1\5\5\0\3\5\1\173\22\5\2\0\2\5"+
    "\1\0\1\174\1\5\1\174\1\5\2\0\1\5\5\0"+
    "\26\5\2\0\2\5\1\0\1\175\1\5\1\176\1\5"+
    "\2\0\1\5\5\0\24\5\1\135\1\5\2\0\2\5"+
    "\1\0\1\176\1\5\1\176\1\5\2\0\1\5\5\0"+
    "\26\5\2\0\2\5\1\0\1\135\3\5\2\0\1\5"+
    "\5\0\24\5\1\135\1\5\2\0\2\5\1\0\1\144"+
    "\3\5\2\0\1\5\5\0\14\5\1\144\11\5\2\0"+
    "\2\5\1\0\1\177\2\5\1\45\2\0\1\135\5\0"+
    "\1\142\3\5\1\135\21\5\2\0\2\5\1\0\1\45"+
    "\2\5\1\45\2\0\1\5\5\0\26\5\2\0\2\5"+
    "\1\0\1\200\3\5\2\0\1\5\5\0\3\5\1\173"+
    "\2\5\1\45\17\5\2\0\2\5\1\0\1\201\3\5"+
    "\2\0\1\5\5\0\2\5\1\45\4\5\1\52\4\5"+
    "\1\153\11\5\2\0\2\5\1\0\1\153\3\5\2\0"+
    "\1\5\5\0\14\5\1\153\11\5\2\0\2\5\1\0"+
    "\1\202\3\5\2\0\1\5\5\0\7\5\1\152\12\5"+
    "\1\142\3\5\2\0\2\5\1\0\1\152\3\5\2\0"+
    "\1\5\5\0\7\5\1\152\16\5\2\0\2\5\1\0"+
    "\1\142\3\5\2\0\1\5\5\0\22\5\1\142\3\5"+
    "\2\0\2\5\1\0\1\203\3\5\2\0\1\5\5\0"+
    "\1\203\25\5\2\0\2\5\1\0\1\204\3\5\2\0"+
    "\1\5\5\0\1\204\25\5\2\0\2\5\1\0\1\161"+
    "\3\5\2\0\1\5\5\0\1\161\25\5\2\0\2\5"+
    "\1\0\1\205\1\5\1\206\1\5\2\0\1\207\5\0"+
    "\1\210\1\45\1\5\1\211\1\207\1\212\1\5\1\213"+
    "\1\214\1\215\1\212\1\5\1\45\6\5\1\216\2\5"+
    "\2\0\2\5\1\0\1\217\3\5\2\0\1\5\5\0"+
    "\1\5\1\45\5\5\1\220\16\5\2\0\2\5\1\0"+
    "\1\161\3\5\2\0\1\5\5\0\5\5\1\161\4\5"+
    "\1\161\13\5\2\0\2\5\1\0\1\221\3\5\2\0"+
    "\1\5\5\0\3\5\1\222\5\5\1\45\14\5\2\0"+
    "\2\5\1\0\1\223\3\5\2\0\1\5\5\0\3\5"+
    "\1\224\3\5\1\135\13\5\1\216\2\5\2\0\2\5"+
    "\1\0\1\206\1\5\1\206\1\5\2\0\1\5\5\0"+
    "\26\5\2\0\2\5\1\0\1\225\3\5\2\0\1\5"+
    "\5\0\1\226\4\5\1\227\4\5\1\227\13\5\2\0"+
    "\2\5\1\0\1\230\3\5\2\0\1\5\5\0\1\152"+
    "\4\5\1\231\3\5\1\232\1\231\13\5\2\0\2\5"+
    "\1\0\1\45\3\5\2\0\1\5\5\0\11\5\1\45"+
    "\14\5\2\0\2\5\1\0\1\233\3\5\2\0\1\5"+
    "\5\0\7\5\1\233\16\5\2\0\2\5\1\0\1\145"+
    "\3\5\2\0\1\135\5\0\4\5\1\135\2\5\1\45"+
    "\16\5\2\0\2\5\1\0\1\45\3\5\2\0\1\5"+
    "\5\0\14\5\1\45\11\5\2\0\2\5\1\0\1\234"+
    "\3\5\2\0\1\235\5\0\4\5\1\235\3\5\1\214"+
    "\15\5\2\0\2\5\1\0\1\45\3\5\2\0\1\5"+
    "\5\0\3\5\1\45\22\5\2\0\2\5\1\0\1\236"+
    "\3\5\2\0\1\235\5\0\1\5\1\45\2\5\1\235"+
    "\1\161\1\5\1\220\2\5\1\161\13\5\2\0\2\5"+
    "\1\0\1\235\3\5\2\0\1\235\5\0\4\5\1\235"+
    "\21\5\2\0\2\5\1\0\1\237\3\5\2\0\1\5"+
    "\5\0\3\5\1\240\5\5\1\45\11\5\1\216\2\5"+
    "\2\0\2\5\1\0\1\241\3\5\2\0\1\5\5\0"+
    "\3\5\1\240\17\5\1\216\2\5\2\0\2\5\1\0"+
    "\1\242\3\5\2\0\1\5\5\0\7\5\1\243\1\214"+
    "\15\5\2\0\2\5\1\0\1\45\3\5\2\0\1\5"+
    "\5\0\7\5\1\45\16\5\2\0\2\5\1\0\1\214"+
    "\3\5\2\0\1\5\5\0\10\5\1\214\15\5\2\0"+
    "\2\5\1\0\1\244\3\5\2\0\1\5\5\0\3\5"+
    "\1\45\1\5\1\231\4\5\1\231\13\5\2\0\2\5"+
    "\1\0\1\231\3\5\2\0\1\5\5\0\5\5\1\231"+
    "\4\5\1\231\13\5\2\0\2\5\1\0\1\245\3\5"+
    "\2\0\1\5\5\0\1\152\10\5\1\232\14\5\2\0"+
    "\2\5\1\0\1\222\3\5\2\0\1\5\5\0\3\5"+
    "\1\222\22\5\2\0\2\5\1\0\1\145\3\5\2\0"+
    "\1\5\5\0\7\5\1\135\4\5\1\45\11\5\2\0"+
    "\2\5\1\0\1\135\3\5\2\0\1\5\5\0\7\5"+
    "\1\135\16\5\2\0\2\5\1\0\1\246\3\5\2\0"+
    "\1\5\5\0\1\226\2\5\1\222\1\5\1\227\4\5"+
    "\1\227\13\5\2\0\2\5\1\0\1\247\1\5\1\206"+
    "\1\5\2\0\1\5\5\0\11\5\1\232\14\5\2\0"+
    "\2\5\1\0\1\232\3\5\2\0\1\5\5\0\11\5"+
    "\1\232\14\5\2\0\2\5\1\0\1\250\3\5\2\0"+
    "\1\5\5\0\7\5\1\233\13\5\1\216\2\5\2\0"+
    "\2\5\1\0\1\216\3\5\2\0\1\5\5\0\23\5"+
    "\1\216\2\5\2\0\2\5\1\0\1\45\3\5\2\0"+
    "\1\5\5\0\11\5\1\45\2\5\1\45\11\5\2\0"+
    "\2\5\1\0\1\152\3\5\2\0\1\5\5\0\1\152"+
    "\25\5\2\0\2\5\1\0\1\220\3\5\2\0\1\5"+
    "\5\0\7\5\1\220\16\5\2\0\2\5\1\0\1\45"+
    "\3\5\2\0\1\5\5\0\1\5\1\45\7\5\1\45"+
    "\14\5\2\0\2\5\1\0\1\45\3\5\2\0\1\5"+
    "\5\0\1\5\1\45\24\5\2\0\2\5\1\0\1\45"+
    "\3\5\2\0\1\5\5\0\3\5\1\45\5\5\1\45"+
    "\14\5\2\0\2\5\1\0\1\251\3\5\2\0\1\135"+
    "\5\0\4\5\1\135\3\5\1\214\15\5\2\0\2\5"+
    "\1\0\1\45\3\5\2\0\1\5\5\0\3\5\1\45"+
    "\3\5\1\45\16\5\2\0\2\5\1\0\1\252\3\5"+
    "\2\0\1\5\5\0\3\5\1\240\3\5\1\135\16\5"+
    "\2\0\2\5\1\0\1\240\3\5\2\0\1\5\5\0"+
    "\3\5\1\240\22\5\2\0\2\5\1\0\1\253\1\5"+
    "\1\161\1\5\2\0\1\5\5\0\1\254\1\5\1\255"+
    "\1\256\3\5\1\145\1\142\1\257\2\5\1\260\1\261"+
    "\1\262\7\5\2\0\2\5\1\0\1\263\3\5\2\0"+
    "\1\5\5\0\2\5\1\263\23\5\2\0\2\5\1\0"+
    "\1\264\1\5\1\161\1\5\2\0\1\5\5\0\11\5"+
    "\1\45\14\5\2\0\2\5\1\0\1\265\3\5\2\0"+
    "\1\5\5\0\7\5\1\45\4\5\1\260\11\5\2\0"+
    "\2\5\1\0\1\266\3\5\2\0\1\5\5\0\11\5"+
    "\1\266\14\5\2\0\2\5\1\0\1\267\3\5\2\0"+
    "\1\5\5\0\2\5\1\140\4\5\1\135\1\142\15\5"+
    "\2\0\2\5\1\0\1\270\3\5\2\0\1\5\5\0"+
    "\1\254\10\5\1\271\14\5\2\0\2\5\1\0\1\256"+
    "\3\5\2\0\1\5\5\0\3\5\1\256\22\5\2\0"+
    "\2\5\1\0\1\261\3\5\2\0\1\5\5\0\15\5"+
    "\1\261\10\5\2\0\2\5\1\0\1\262\3\5\2\0"+
    "\1\5\5\0\16\5\1\262\7\5\2\0\2\5\1\0"+
    "\1\272\3\5\2\0\1\5\5\0\11\5\1\272\14\5"+
    "\2\0\2\5\1\0\1\63\3\5\2\0\1\5\5\0"+
    "\11\5\1\63\14\5\2\0\2\5\1\0\1\273\3\5"+
    "\2\0\1\5\5\0\11\5\1\274\4\5\1\262\7\5"+
    "\2\0\2\5\1\0\1\275\3\5\2\0\1\5\5\0"+
    "\11\5\1\275\14\5\2\0\2\5\1\0\1\276\3\5"+
    "\2\0\1\5\5\0\10\5\1\142\3\5\1\260\11\5"+
    "\2\0\2\5\1\0\1\260\3\5\2\0\1\5\5\0"+
    "\14\5\1\260\11\5\2\0\2\5\1\0\1\142\3\5"+
    "\2\0\1\5\5\0\10\5\1\142\15\5\2\0\2\5"+
    "\1\0\1\277\3\5\2\0\1\5\5\0\2\5\1\140"+
    "\4\5\1\45\5\5\1\261\10\5\2\0\2\5\1\0"+
    "\1\140\3\5\2\0\1\5\5\0\2\5\1\140\23\5"+
    "\2\0\2\5\1\0\1\254\3\5\2\0\1\5\5\0"+
    "\1\254\25\5\2\0\2\5\1\0\1\300\1\5\1\161"+
    "\1\5\2\0\1\5\5\0\3\5\1\256\22\5\2\0"+
    "\2\5\1\0\1\161\1\5\1\161\1\5\2\0\1\5"+
    "\5\0\26\5\2\0\2\5\1\0\1\301\1\5\1\161"+
    "\1\5\2\0\1\5\5\0\7\5\1\135\1\5\1\272"+
    "\14\5\2\0\2\5\1\0\1\302\3\5\2\0\1\5"+
    "\5\0\11\5\1\275\4\5\1\262\7\5\2\0\2\5"+
    "\1\0\1\303\3\5\2\0\1\5\5\0\1\254\2\5"+
    "\1\256\22\5\2\0\2\5\1\0\1\304\3\5\2\0"+
    "\1\5\5\0\7\5\1\45\5\5\1\261\10\5\2\0"+
    "\2\5\1\0\1\305\3\5\2\0\1\5\5\0\10\5"+
    "\1\142\1\63\2\5\1\260\11\5\2\0\2\5\1\0"+
    "\1\306\3\5\2\0\1\5\5\0\2\5\1\263\12\5"+
    "\1\261\10\5\2\0\2\5\1\0\1\307\3\5\2\0"+
    "\1\5\5\0\1\254\15\5\1\262\7\5\2\0\2\5"+
    "\1\0\1\310\3\5\2\0\1\5\5\0\3\5\1\256"+
    "\5\5\1\45\14\5\2\0\2\5\1\0\1\274\3\5"+
    "\2\0\1\5\5\0\11\5\1\274\14\5\2\0\2\5"+
    "\1\0\1\311\1\45\2\5\2\0\1\5\5\0\1\312"+
    "\2\5\1\313\3\5\1\314\1\45\1\315\2\5\2\45"+
    "\1\140\7\5\2\0\2\5\1\0\1\45\3\5\2\0"+
    "\1\5\5\0\10\5\1\45\15\5\2\0\2\5\1\0"+
    "\1\316\3\5\2\0\1\5\5\0\3\5\1\317\10\5"+
    "\1\45\11\5\2\0\2\5\1\0\1\312\3\5\2\0"+
    "\1\5\5\0\1\312\25\5\2\0\2\5\1\0\1\320"+
    "\1\45\2\5\2\0\1\5\5\0\7\5\1\321\6\5"+
    "\1\140\7\5\2\0\2\5\1\0\1\45\3\5\2\0"+
    "\1\5\5\0\15\5\1\45\10\5\2\0\2\5\1\0"+
    "\1\322\3\5\2\0\1\5\5\0\11\5\1\322\14\5"+
    "\2\0\2\5\1\0\1\135\3\5\2\0\1\5\5\0"+
    "\3\5\1\135\22\5\2\0\2\5\1\0\1\317\3\5"+
    "\2\0\1\5\5\0\3\5\1\317\22\5\2\0\2\5"+
    "\1\0\1\323\1\45\2\5\2\0\1\5\5\0\7\5"+
    "\1\321\16\5\2\0\2\5\1\0\1\45\3\5\2\0"+
    "\1\5\5\0\3\5\1\45\5\5\1\45\2\5\1\45"+
    "\11\5\2\0\2\5\1\0\1\324\3\5\2\0\1\5"+
    "\5\0\10\5\1\45\5\5\1\140\7\5\2\0\2\5"+
    "\1\0\1\140\3\5\2\0\1\5\5\0\16\5\1\140"+
    "\7\5\2\0\2\5\1\0\1\314\3\5\2\0\1\5"+
    "\5\0\3\5\1\135\3\5\1\321\16\5\2\0\2\5"+
    "\1\0\1\321\3\5\2\0\1\5\5\0\7\5\1\321"+
    "\16\5\2\0\2\5\1\0\1\45\3\5\2\0\1\5"+
    "\5\0\3\5\1\45\11\5\1\45\10\5\2\0\2\5"+
    "\1\0\1\315\3\5\2\0\1\5\5\0\11\5\1\322"+
    "\2\5\1\45\11\5\2\0\2\5\1\0\1\325\3\5"+
    "\2\0\1\5\5\0\1\312\6\5\1\135\16\5\2\0"+
    "\2\5\1\0\1\326\3\5\2\0\1\5\5\0\7\5"+
    "\1\135\1\5\1\45\4\5\1\140\7\5\2\0\2\5"+
    "\1\0\1\327\3\5\2\0\1\5\5\0\1\312\7\5"+
    "\1\45\15\5\2\0\2\5\1\0\2\45\2\5\2\0"+
    "\1\5\5\0\3\5\1\45\11\5\1\45\10\5\2\0"+
    "\2\5\1\0\1\330\3\5\2\0\1\5\5\0\3\5"+
    "\1\317\5\5\1\322\14\5\2\0\2\5\1\0\1\145"+
    "\3\5\2\0\1\5\5\0\3\5\1\135\4\5\1\45"+
    "\15\5\2\0\2\5\1\0\1\331\1\5\1\140\1\5"+
    "\2\0\1\45\5\0\1\332\1\5\1\333\1\5\1\45"+
    "\4\5\1\45\2\5\1\45\11\5\2\0\2\5\1\0"+
    "\1\140\1\5\1\140\1\5\2\0\1\5\5\0\26\5"+
    "\2\0\2\5\1\0\1\45\3\5\2\0\1\45\5\0"+
    "\4\5\1\45\4\5\1\45\14\5\2\0\2\5\1\0"+
    "\1\334\3\5\2\0\1\5\5\0\1\332\10\5\1\45"+
    "\14\5\2\0\2\5\1\0\1\333\3\5\2\0\1\5"+
    "\5\0\2\5\1\333\23\5\2\0\2\5\1\0\1\45"+
    "\3\5\2\0\1\45\5\0\4\5\1\45\21\5\2\0"+
    "\2\5\1\0\1\334\3\5\2\0\1\5\5\0\1\332"+
    "\13\5\1\45\11\5\2\0\2\5\1\0\1\332\3\5"+
    "\2\0\1\5\5\0\1\332\25\5\2\0\2\5\1\0"+
    "\1\324\1\5\1\140\1\5\2\0\1\5\5\0\11\5"+
    "\1\45\14\5\2\0\2\5\1\0\1\333\3\5\2\0"+
    "\1\45\5\0\2\5\1\333\1\5\1\45\21\5\2\0"+
    "\2\5\1\0\1\145\3\5\2\0\1\5\5\0\14\5"+
    "\1\145\10\5\1\45\2\0\2\5\1\0\1\135\3\5"+
    "\2\0\1\5\5\0\14\5\1\135\11\5\2\0\2\5"+
    "\1\0\4\5\2\0\1\5\5\0\25\5\1\45";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7137];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\4\1\1\11\3\1\1\11"+
    "\1\1\2\11\43\1\1\0\246\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[220];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexema;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Analizador_Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Analizador_Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 174) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
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
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { return operadorRelacional;
          }
        case 13: break;
        case 2: 
          { return numero;
          }
        case 14: break;
        case 1: 
          { return ERROR;
          }
        case 15: break;
        case 8: 
          { return findelinea;
          }
        case 16: break;
        case 5: 
          { return operadorAritmetico;
          }
        case 17: break;
        case 3: 
          { return identificador;
          }
        case 18: break;
        case 9: 
          { return continuacionlinea;
          }
        case 19: break;
        case 11: 
          { return comentario;
          }
        case 20: break;
        case 10: 
          { return reservadas;
          }
        case 21: break;
        case 6: 
          { return espacio;
          }
        case 22: break;
        case 7: 
          { return caracterReservado;
          }
        case 23: break;
        case 12: 
          { return texto;
          }
        case 24: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
