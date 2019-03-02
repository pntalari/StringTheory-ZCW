package rocks.zipcode.stringsgalore;

import java.util.InputMismatchException;

public class StringTheory {
    //  String input = "";

    public StringTheory() {
//this.input =
    }
    // Put your code for all 70 exercises starting here.

    public String getCharAt(String input, Integer pos) {
        String str = "";
        str += input.charAt(pos);

        return "The character at position " + pos + " is " + str;
    }

    public Integer getUnicode(String input, Integer pos) {
        return Integer.valueOf(input.charAt(pos));
    }

    public Integer getUnicodeCnt(String input) {
        return input.codePointCount(0, input.length());
    }

    public String lexicoStrCompare(String str1, String str2) {
        String strRet = "";

        if (str1.compareTo(str2) == 0) {

            strRet = str1 + " is equal to " + str2;
        } else if (str1.compareTo(str2) < 0) {

            strRet = str1 + " is less than " + str2;
        } else if (str1.compareTo(str2) > 0) {

            strRet = str1 + " is greater than " + str2;
        }

        return strRet;
    }

    public String lexicoStrCompareIgnoreCase(String str1, String str2){

        String str = "";
        if (str1.equalsIgnoreCase(str2)) {

            str = str1 + " is equal to " + str2;
        } else{
            str = str1 + " is not equal to " + str2;
        }

        return str;
    }

    public String StringConcat(String str1, String str2){
        return str1 + " " + str2;
    }

    public Boolean StringContains(String str, String cont){
        return str.contains(cont);
    }

    public Boolean StringCompare(String str1, String str2){
        return str1.equals(str2);
    }


}
