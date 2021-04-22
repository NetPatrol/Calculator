package com.calculator;

import java.util.HashMap;
import java.util.Map;

public class RomaIO {
    String[] roma;
    String res;
    /**
     * We get all the numbers from the entered expression
     * by splitting the string through, using a regular expression
     * @return*/
    public String[] romaOperand(String exp){
        roma = exp.split("([ -A-Z]+)");
        return roma;
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     * @return*/
    public String[] romaOperator(String exp){
        roma = exp.split("([^ -A-Z]+)");
        return roma;
    }
    /**
     * Convert Roman Numbers to Arabic Numbers
     * for which we create a correspondence dictionary,
     * where the key is a Roman number in string format,
     * and the value is the corresponding number
     *
     * e.g. Roman numerals II and V obtained from the expression will be converted to Arabic numerals 2 and 5
     * @return*/
    public String[] convertRomaToInt(String[] romaOperand){
        Map<String, String> romaToInt = new HashMap<>();
        romaToInt.put("I", "1");
        romaToInt.put("II", "2");
        romaToInt.put("III", "3");
        romaToInt.put("IV", "4");
        romaToInt.put("V", "5");
        romaToInt.put("VI", "6");
        romaToInt.put("VII", "7");
        romaToInt.put("VIII", "8");
        romaToInt.put("IX", "9");
        romaToInt.put("X", "10");
        for (int k = 0; k < romaOperand.length; k++){
            romaOperand[k] = romaToInt.get(romaOperand[k]);
        }
        return romaOperand;
    }
    /**
     * Convert result to Roman Numbers
     * for which we create a correspondence dictionary,
     * where the key is a resulting Arabic number in int format,
     * and the value is the Roman number in String format
     *
     * e.g. the result is 7 will be converted to Roman VII
     * @return*/
    public String convertIntToRoma(int result){
        Map<Integer, String> intToRoma = new HashMap<>();
        intToRoma.put(1, "I");
        intToRoma.put(2, "II");
        intToRoma.put(3, "III");
        intToRoma.put(4, "IV");
        intToRoma.put(5, "V");
        intToRoma.put(6, "VI");
        intToRoma.put(7, "VII");
        intToRoma.put(8, "VIII");
        intToRoma.put(9, "IX");
        intToRoma.put(10, "X");

        for (int k = 0; k < 1; k++){
            res = intToRoma.get(result);
        }
        return res;
    }
}
