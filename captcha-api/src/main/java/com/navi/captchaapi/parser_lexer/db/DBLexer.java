// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: DBLexer.flex

package com.navi.captchaapi.parser_lexer.db;
import java_cup.runtime.*;
import static com.navi.captchaapi.parser_lexer.db.sym.*;
import com.navi.captchaapi.parser_lexer.*;

@SuppressWarnings("fallthrough")
public class DBLexer implements java_cup.runtime.Scanner {

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
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\2\u1f00\1\u2000\7\u1f00\1\u2100\1\u2200\1\u2300"+
    "\1\u1f00\1\u2400\1\u2500\2\u1f00\31\u0100\1\u2600\121\u0100\1\u2700"+
    "\4\u0100\1\u2800\1\u0100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00"+
    "\1\u2e00\53\u0100\1\u2f00\41\u1f00\1\u0100\1\u3000\1\u3100\1\u0100"+
    "\1\u3200\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u3a00\1\u0100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u4100\1\u1f00\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00"+
    "\1\u4f00\1\u5000\1\u1f00\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00"+
    "\4\u0100\1\u5400\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600"+
    "\1\u5700\2\u1f00\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00"+
    "\45\u1f00\1\u0100\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00"+
    "\1\u6000\1\u1f00\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500"+
    "\5\u1f00\1\u6600\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\4\u1f00"+
    "\1\u6b00\2\u1f00\1\u6c00\16\u1f00\246\u0100\1\u6d00\20\u0100\1\u6e00"+
    "\1\u6f00\25\u0100\1\u7000\34\u0100\1\u7100\14\u1f00\2\u0100\1\u7200"+
    "\u0b06\u1f00\1\u2700\u02fe\u1f00";

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
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\1\0\1\4\5\0\1\5\1\6\2\0\1\7\1\0"+
    "\1\10\1\0\12\11\1\12\6\0\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\2\21\1\24"+
    "\1\25\1\26\1\27\2\21\1\30\1\31\1\32\1\33"+
    "\5\21\3\0\1\21\1\34\1\0\1\35\1\36\1\37"+
    "\1\40\3\21\1\41\7\21\1\42\2\21\1\43\1\44"+
    "\6\21\1\45\1\0\1\46\43\0\1\21\10\0\1\21"+
    "\1\0\1\21\3\0\1\21\4\0\1\21\4\0\1\21"+
    "\4\0\30\21\1\0\37\21\1\0\u01ca\21\4\0\14\21"+
    "\16\0\5\21\7\0\1\21\1\0\1\21\21\0\165\21"+
    "\1\0\2\21\2\0\4\21\1\0\1\21\6\0\1\21"+
    "\1\0\3\21\1\0\1\21\1\0\24\21\1\0\123\21"+
    "\1\0\213\21\1\0\255\21\1\0\46\21\2\0\1\21"+
    "\6\0\51\21\10\0\55\21\1\0\1\21\1\0\2\21"+
    "\1\0\2\21\1\0\1\21\10\0\33\21\4\0\4\21"+
    "\35\0\13\21\5\0\112\21\4\0\146\21\1\0\10\21"+
    "\2\0\12\21\1\0\23\21\2\0\1\21\20\0\73\21"+
    "\2\0\145\21\16\0\66\21\4\0\1\21\2\0\1\21"+
    "\2\0\56\21\22\0\34\21\4\0\13\21\65\0\25\21"+
    "\1\0\10\21\25\0\17\21\1\0\201\21\2\0\12\21"+
    "\1\0\23\21\1\0\10\21\2\0\2\21\2\0\26\21"+
    "\1\0\7\21\1\0\1\21\3\0\4\21\2\0\11\21"+
    "\2\0\2\21\2\0\4\21\10\0\1\21\4\0\2\21"+
    "\1\0\5\21\2\0\14\21\12\0\1\21\1\0\1\21"+
    "\2\0\3\21\1\0\6\21\4\0\2\21\2\0\26\21"+
    "\1\0\7\21\1\0\2\21\1\0\2\21\1\0\2\21"+
    "\2\0\1\21\1\0\5\21\4\0\2\21\2\0\3\21"+
    "\3\0\1\21\7\0\4\21\1\0\1\21\7\0\20\21"+
    "\13\0\3\21\1\0\11\21\1\0\3\21\1\0\26\21"+
    "\1\0\7\21\1\0\2\21\1\0\5\21\2\0\12\21"+
    "\1\0\3\21\1\0\3\21\2\0\1\21\17\0\4\21"+
    "\2\0\12\21\11\0\7\21\1\0\3\21\1\0\10\21"+
    "\2\0\2\21\2\0\26\21\1\0\7\21\1\0\2\21"+
    "\1\0\5\21\2\0\11\21\2\0\2\21\2\0\3\21"+
    "\10\0\2\21\4\0\2\21\1\0\5\21\2\0\12\21"+
    "\1\0\1\21\20\0\2\21\1\0\6\21\3\0\3\21"+
    "\1\0\4\21\3\0\2\21\1\0\1\21\1\0\2\21"+
    "\3\0\2\21\3\0\3\21\3\0\14\21\4\0\5\21"+
    "\3\0\3\21\1\0\4\21\2\0\1\21\6\0\1\21"+
    "\16\0\12\21\20\0\15\21\1\0\3\21\1\0\27\21"+
    "\1\0\20\21\3\0\10\21\1\0\3\21\1\0\4\21"+
    "\7\0\2\21\1\0\3\21\5\0\4\21\2\0\12\21"+
    "\20\0\4\21\1\0\10\21\1\0\3\21\1\0\27\21"+
    "\1\0\12\21\1\0\5\21\2\0\11\21\1\0\3\21"+
    "\1\0\4\21\7\0\2\21\7\0\1\21\1\0\4\21"+
    "\2\0\12\21\1\0\2\21\15\0\4\21\1\0\10\21"+
    "\1\0\3\21\1\0\63\21\1\0\3\21\1\0\5\21"+
    "\5\0\4\21\7\0\5\21\2\0\12\21\12\0\6\21"+
    "\2\0\2\21\1\0\22\21\3\0\30\21\1\0\11\21"+
    "\1\0\1\21\2\0\7\21\3\0\1\21\4\0\6\21"+
    "\1\0\1\21\1\0\10\21\6\0\12\21\2\0\2\21"+
    "\15\0\72\21\5\0\17\21\1\0\12\21\47\0\2\21"+
    "\1\0\1\21\1\0\5\21\1\0\30\21\1\0\1\21"+
    "\1\0\27\21\2\0\5\21\1\0\1\21\1\0\6\21"+
    "\2\0\12\21\2\0\4\21\40\0\1\21\27\0\2\21"+
    "\6\0\12\21\13\0\1\21\1\0\1\21\1\0\1\21"+
    "\4\0\12\21\1\0\44\21\4\0\24\21\1\0\22\21"+
    "\1\0\44\21\11\0\1\21\71\0\112\21\6\0\116\21"+
    "\2\0\46\21\1\0\1\21\5\0\1\21\2\0\53\21"+
    "\1\0\115\21\1\0\4\21\2\0\7\21\1\0\1\21"+
    "\1\0\4\21\2\0\51\21\1\0\4\21\2\0\41\21"+
    "\1\0\4\21\2\0\7\21\1\0\1\21\1\0\4\21"+
    "\2\0\17\21\1\0\71\21\1\0\4\21\2\0\103\21"+
    "\2\0\3\21\40\0\20\21\20\0\126\21\2\0\6\21"+
    "\3\0\u016c\21\2\0\21\21\1\0\32\21\5\0\113\21"+
    "\3\0\13\21\7\0\15\21\1\0\7\21\13\0\25\21"+
    "\13\0\24\21\14\0\15\21\1\0\3\21\1\0\2\21"+
    "\14\0\124\21\3\0\1\21\4\0\2\21\2\0\12\21"+
    "\41\0\3\21\2\0\12\21\6\0\131\21\7\0\53\21"+
    "\5\0\106\21\12\0\37\21\1\0\14\21\4\0\14\21"+
    "\12\0\50\21\2\0\5\21\13\0\54\21\4\0\32\21"+
    "\6\0\12\21\46\0\34\21\4\0\77\21\1\0\35\21"+
    "\2\0\13\21\6\0\12\21\15\0\1\21\10\0\17\21"+
    "\101\0\114\21\4\0\12\21\21\0\11\21\14\0\164\21"+
    "\14\0\70\21\10\0\12\21\3\0\61\21\2\0\11\21"+
    "\7\0\53\21\2\0\3\21\20\0\3\21\1\0\47\21"+
    "\5\0\372\21\1\0\33\21\2\0\6\21\2\0\46\21"+
    "\2\0\6\21\2\0\10\21\1\0\1\21\1\0\1\21"+
    "\1\0\1\21\1\0\37\21\2\0\65\21\1\0\7\21"+
    "\1\0\1\21\3\0\3\21\1\0\7\21\3\0\4\21"+
    "\2\0\6\21\4\0\15\21\5\0\3\21\1\0\7\21"+
    "\102\0\2\21\23\0\1\21\34\0\1\21\15\0\1\21"+
    "\20\0\15\21\63\0\41\21\21\0\1\21\4\0\1\21"+
    "\2\0\12\21\1\0\1\21\3\0\5\21\6\0\1\21"+
    "\1\0\1\21\1\0\1\21\1\0\4\21\1\0\13\21"+
    "\2\0\4\21\5\0\5\21\4\0\1\21\21\0\51\21"+
    "\u022d\0\64\21\26\0\57\21\1\0\57\21\1\0\205\21"+
    "\6\0\11\21\14\0\46\21\1\0\1\21\5\0\1\21"+
    "\2\0\70\21\7\0\1\21\17\0\30\21\11\0\7\21"+
    "\1\0\7\21\1\0\7\21\1\0\7\21\1\0\7\21"+
    "\1\0\7\21\1\0\7\21\1\0\7\21\1\0\40\21"+
    "\57\0\1\21\325\0\3\21\31\0\17\21\1\0\5\21"+
    "\2\0\5\21\4\0\126\21\2\0\2\21\2\0\3\21"+
    "\1\0\132\21\1\0\4\21\5\0\53\21\1\0\136\21"+
    "\21\0\33\21\65\0\306\21\112\0\360\21\20\0\215\21"+
    "\103\0\56\21\2\0\15\21\3\0\34\21\24\0\63\21"+
    "\1\0\12\21\1\0\163\21\45\0\11\21\2\0\147\21"+
    "\2\0\65\21\2\0\5\21\60\0\61\21\30\0\64\21"+
    "\14\0\106\21\12\0\12\21\6\0\30\21\3\0\1\21"+
    "\1\0\61\21\2\0\44\21\14\0\35\21\3\0\101\21"+
    "\16\0\13\21\6\0\37\21\1\0\67\21\11\0\16\21"+
    "\2\0\12\21\6\0\27\21\3\0\111\21\30\0\3\21"+
    "\2\0\20\21\2\0\5\21\12\0\6\21\2\0\6\21"+
    "\2\0\6\21\11\0\7\21\1\0\7\21\1\0\53\21"+
    "\1\0\14\21\10\0\173\21\1\0\2\21\2\0\12\21"+
    "\6\0\244\21\14\0\27\21\4\0\61\21\4\0\156\21"+
    "\2\0\152\21\46\0\7\21\14\0\5\21\5\0\14\21"+
    "\1\0\15\21\1\0\5\21\1\0\1\21\1\0\2\21"+
    "\1\0\2\21\1\0\154\21\41\0\153\21\22\0\100\21"+
    "\2\0\66\21\50\0\14\21\4\0\20\21\20\0\20\21"+
    "\3\0\2\21\30\0\3\21\40\0\5\21\1\0\207\21"+
    "\23\0\12\21\7\0\32\21\4\0\1\21\1\0\32\21"+
    "\13\0\131\21\3\0\6\21\2\0\6\21\2\0\6\21"+
    "\2\0\3\21\43\0\14\21\1\0\32\21\1\0\23\21"+
    "\1\0\2\21\1\0\17\21\2\0\16\21\42\0\173\21"+
    "\105\0\65\21\210\0\1\21\202\0\35\21\3\0\61\21"+
    "\17\0\1\21\37\0\40\21\15\0\36\21\5\0\53\21"+
    "\5\0\36\21\2\0\44\21\4\0\10\21\1\0\5\21"+
    "\52\0\236\21\2\0\12\21\6\0\44\21\4\0\44\21"+
    "\4\0\50\21\10\0\64\21\234\0\67\21\11\0\26\21"+
    "\12\0\10\21\230\0\6\21\2\0\1\21\1\0\54\21"+
    "\1\0\2\21\3\0\1\21\2\0\27\21\12\0\27\21"+
    "\11\0\37\21\101\0\23\21\1\0\2\21\12\0\26\21"+
    "\12\0\32\21\106\0\70\21\6\0\2\21\100\0\4\21"+
    "\1\0\2\21\5\0\10\21\1\0\3\21\1\0\35\21"+
    "\2\0\3\21\4\0\1\21\40\0\35\21\3\0\35\21"+
    "\43\0\10\21\1\0\36\21\31\0\66\21\12\0\26\21"+
    "\12\0\23\21\15\0\22\21\156\0\111\21\67\0\63\21"+
    "\15\0\63\21\15\0\50\21\10\0\12\21\306\0\35\21"+
    "\12\0\1\21\10\0\41\21\217\0\27\21\11\0\107\21"+
    "\37\0\12\21\17\0\74\21\25\0\31\21\7\0\12\21"+
    "\6\0\65\21\1\0\12\21\4\0\3\21\11\0\44\21"+
    "\2\0\1\21\11\0\105\21\4\0\4\21\3\0\13\21"+
    "\1\0\1\21\43\0\22\21\1\0\45\21\6\0\1\21"+
    "\101\0\7\21\1\0\1\21\1\0\4\21\1\0\17\21"+
    "\1\0\12\21\7\0\73\21\5\0\12\21\6\0\4\21"+
    "\1\0\10\21\2\0\2\21\2\0\26\21\1\0\7\21"+
    "\1\0\2\21\1\0\5\21\1\0\12\21\2\0\2\21"+
    "\2\0\3\21\2\0\1\21\6\0\1\21\5\0\7\21"+
    "\2\0\7\21\3\0\5\21\213\0\113\21\5\0\12\21"+
    "\4\0\2\21\40\0\106\21\1\0\1\21\10\0\12\21"+
    "\246\0\66\21\2\0\11\21\27\0\6\21\42\0\101\21"+
    "\3\0\1\21\13\0\12\21\46\0\71\21\7\0\12\21"+
    "\66\0\33\21\2\0\17\21\4\0\12\21\306\0\73\21"+
    "\145\0\112\21\25\0\1\21\240\0\10\21\2\0\56\21"+
    "\2\0\10\21\1\0\2\21\33\0\77\21\10\0\1\21"+
    "\10\0\112\21\3\0\1\21\42\0\71\21\7\0\11\21"+
    "\1\0\55\21\1\0\11\21\17\0\12\21\30\0\36\21"+
    "\2\0\26\21\1\0\16\21\111\0\7\21\1\0\2\21"+
    "\1\0\54\21\3\0\1\21\1\0\2\21\1\0\11\21"+
    "\10\0\12\21\6\0\6\21\1\0\2\21\1\0\45\21"+
    "\1\0\2\21\1\0\6\21\7\0\12\21\u0136\0\27\21"+
    "\11\0\232\21\146\0\157\21\21\0\304\21\274\0\57\21"+
    "\321\0\107\21\271\0\71\21\7\0\37\21\1\0\12\21"+
    "\146\0\36\21\2\0\5\21\13\0\67\21\11\0\4\21"+
    "\14\0\12\21\11\0\25\21\5\0\23\21\260\0\100\21"+
    "\200\0\113\21\4\0\71\21\7\0\21\21\100\0\2\21"+
    "\1\0\1\21\34\0\370\21\10\0\363\21\15\0\37\21"+
    "\61\0\3\21\21\0\4\21\10\0\u018c\21\4\0\153\21"+
    "\5\0\15\21\3\0\11\21\7\0\12\21\3\0\2\21"+
    "\306\0\5\21\3\0\6\21\10\0\10\21\2\0\7\21"+
    "\36\0\4\21\224\0\3\21\273\0\125\21\1\0\107\21"+
    "\1\0\2\21\2\0\1\21\2\0\2\21\2\0\4\21"+
    "\1\0\14\21\1\0\1\21\1\0\7\21\1\0\101\21"+
    "\1\0\4\21\2\0\10\21\1\0\7\21\1\0\34\21"+
    "\1\0\4\21\1\0\5\21\1\0\1\21\3\0\7\21"+
    "\1\0\u0154\21\2\0\31\21\1\0\31\21\1\0\37\21"+
    "\1\0\31\21\1\0\37\21\1\0\31\21\1\0\37\21"+
    "\1\0\31\21\1\0\37\21\1\0\31\21\1\0\10\21"+
    "\2\0\151\21\4\0\62\21\10\0\1\21\16\0\1\21"+
    "\26\0\5\21\1\0\17\21\120\0\7\21\1\0\21\21"+
    "\2\0\7\21\1\0\2\21\1\0\5\21\325\0\55\21"+
    "\3\0\16\21\2\0\12\21\4\0\1\21\u0171\0\72\21"+
    "\6\0\305\21\13\0\7\21\51\0\114\21\4\0\12\21"+
    "\246\0\4\21\1\0\33\21\1\0\2\21\1\0\1\21"+
    "\2\0\1\21\1\0\12\21\1\0\4\21\1\0\1\21"+
    "\1\0\1\21\6\0\1\21\4\0\1\21\1\0\1\21"+
    "\1\0\1\21\1\0\3\21\1\0\2\21\1\0\1\21"+
    "\2\0\1\21\1\0\1\21\1\0\1\21\1\0\1\21"+
    "\1\0\1\21\1\0\2\21\1\0\1\21\2\0\4\21"+
    "\1\0\7\21\1\0\4\21\1\0\4\21\1\0\1\21"+
    "\1\0\12\21\1\0\21\21\5\0\3\21\1\0\5\21"+
    "\1\0\21\21\164\0\32\21\6\0\32\21\6\0\32\21"+
    "\166\0\327\21\51\0\65\21\13\0\336\21\2\0\u0182\21"+
    "\16\0\u0131\21\37\0\36\21\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29440];
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
    "\1\0\1\1\2\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\2\10\1\11\1\12\7\0\1\10\1\13\13\0"+
    "\1\14\15\0\1\15\10\0\1\16\2\0\1\17\1\20"+
    "\5\0\1\21\3\0\1\22\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[73];
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
    "\0\0\0\47\0\47\0\116\0\165\0\47\0\47\0\47"+
    "\0\234\0\47\0\303\0\352\0\47\0\47\0\u0111\0\u0138"+
    "\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\47\0\u0249"+
    "\0\u0270\0\u0297\0\u02be\0\u02e5\0\u030c\0\u0333\0\u035a\0\u0381"+
    "\0\u03a8\0\u03cf\0\47\0\u03f6\0\u041d\0\u0444\0\u046b\0\u0492"+
    "\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca"+
    "\0\47\0\u05f1\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db"+
    "\0\u0702\0\47\0\u0729\0\u0750\0\47\0\47\0\u0777\0\u079e"+
    "\0\u07c5\0\u07ec\0\u0813\0\47\0\u083a\0\u0861\0\u0888\0\47"+
    "\0\47";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[73];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\25\13\1\14\4\13\1\15\1\16\51\0"+
    "\1\3\44\0\4\17\1\0\6\17\1\20\4\17\1\21"+
    "\1\17\1\22\1\23\2\17\1\24\4\17\1\25\13\17"+
    "\11\0\1\11\1\0\32\13\13\0\1\13\1\0\32\13"+
    "\13\0\1\13\1\0\23\13\1\26\6\13\2\0\4\17"+
    "\1\27\46\17\1\27\10\17\1\30\35\17\1\27\6\17"+
    "\1\31\37\17\1\27\25\17\1\32\20\17\1\27\11\17"+
    "\1\33\34\17\1\27\22\17\1\34\23\17\1\27\17\17"+
    "\1\35\4\17\1\36\15\17\10\0\1\37\1\13\1\0"+
    "\32\13\2\0\4\17\1\27\16\17\1\40\27\17\1\27"+
    "\17\17\1\41\26\17\1\27\20\17\1\42\25\17\1\43"+
    "\46\17\1\27\20\17\1\44\25\17\1\27\25\17\1\45"+
    "\20\17\1\27\6\17\1\46\33\17\37\0\1\47\7\0"+
    "\4\17\1\27\12\17\1\50\33\17\1\27\17\17\1\51"+
    "\26\17\1\27\17\17\1\52\26\17\1\27\7\17\1\53"+
    "\36\17\1\27\16\17\1\54\27\17\1\27\11\17\1\55"+
    "\30\17\35\0\1\56\11\0\4\17\1\27\23\17\1\57"+
    "\22\17\1\27\22\17\1\60\23\17\1\61\46\17\1\27"+
    "\23\17\1\62\22\17\1\27\20\17\1\63\25\17\1\27"+
    "\22\17\1\64\17\17\42\0\1\65\4\0\4\17\1\27"+
    "\25\17\1\66\20\17\1\27\24\17\1\67\21\17\1\27"+
    "\12\17\1\70\33\17\1\27\22\17\1\71\23\17\1\72"+
    "\42\17\44\0\1\73\2\0\4\17\1\27\22\17\1\74"+
    "\23\17\1\75\46\17\1\76\46\17\1\27\27\17\1\77"+
    "\12\17\37\0\1\100\7\0\4\17\1\27\24\17\1\101"+
    "\21\17\1\27\26\17\1\102\13\17\41\0\1\103\5\0"+
    "\4\17\1\104\46\17\1\27\24\17\1\105\15\17\35\0"+
    "\1\106\11\0\4\17\1\27\22\17\1\107\17\17\43\0"+
    "\1\110\3\0\4\17\1\111\42\17";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2223];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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
    "\1\0\2\11\2\1\3\11\1\1\1\11\2\1\2\11"+
    "\7\0\1\1\1\11\13\0\1\11\15\0\1\11\10\0"+
    "\1\11\2\0\2\11\5\0\1\11\3\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[73];
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
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

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
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type){
        return new Symbol(type, yyline+1,yycolumn+1);
    }
    private Symbol symbol(int type, Object value){
        //System.out.println(type + " line: " + (yyline+1) + " col: "+(yycolumn+1) + " " + value);
        return new Symbol(type, yyline+1, yycolumn+1, value);
    }
    private void error(){
        ErrorsLP.addError(yytext(), yyline+1, yycolumn+1, "Error Léxico","Cadena no definida");
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DBLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
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
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
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
            zzDoEOF();
              {
                return symbol(EOF);
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { error();
            }
          // fall through
          case 20: break;
          case 2:
            { /* ignore */
            }
          // fall through
          case 21: break;
          case 3:
            { return symbol(LPAREN, yytext());
            }
          // fall through
          case 22: break;
          case 4:
            { return symbol(RPAREN, yytext());
            }
          // fall through
          case 23: break;
          case 5:
            { return symbol(COMMA, yytext());
            }
          // fall through
          case 24: break;
          case 6:
            { return symbol(DIGIT, Integer.parseInt(yytext()));
            }
          // fall through
          case 25: break;
          case 7:
            { return symbol(COLON, yytext());
            }
          // fall through
          case 26: break;
          case 8:
            { ErrorsLP.addError(yytext(), yyline+1, yycolumn+1, "Error Léxico","Cadena no definida");
            }
          // fall through
          case 27: break;
          case 9:
            { return symbol(LBRACE, yytext());
            }
          // fall through
          case 28: break;
          case 10:
            { return symbol(RBRACE, yytext());
            }
          // fall through
          case 29: break;
          case 11:
            { return symbol(STRING, yytext());
            }
          // fall through
          case 30: break;
          case 12:
            { return symbol(ID, yytext());
            }
          // fall through
          case 31: break;
          case 13:
            { return symbol(HTML, yytext());
            }
          // fall through
          case 32: break;
          case 14:
            { return symbol(USADO, yytext());
            }
          // fall through
          case 33: break;
          case 15:
            { return symbol(FALLOS, yytext());
            }
          // fall through
          case 34: break;
          case 16:
            { return symbol(NOMBRE, yytext());
            }
          // fall through
          case 35: break;
          case 17:
            { return symbol(ACIERTOS, yytext());
            }
          // fall through
          case 36: break;
          case 18:
            { return symbol(DB_CAPTCHAS, yytext());
            }
          // fall through
          case 37: break;
          case 19:
            { return symbol(ULTIMO_USO, yytext());
            }
          // fall through
          case 38: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}