package com.calculator.roma;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomaToIntAndBack {

    /**
     * Convert Roman Numbers to Arabic Numbers
     * for which we create a correspondence dictionary,
     * where the key is a Roman number in string format,
     * and the value is the corresponding number
     *
     * e.g. Roman numerals II and V obtained from the expression will be converted to Arabic numerals 2 and 5
     * @return*/
    public static String[] convertRomaToInt(String[] romaOperand){
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
        romaToInt.put("XI", "11");
        romaToInt.put("XII", "12");
        romaToInt.put("XIII", "13");
        romaToInt.put("XIV", "14");
        romaToInt.put("XV", "15");
        romaToInt.put("XVI", "16");
        romaToInt.put("XVII", "17");
        romaToInt.put("XVIII", "18");
        romaToInt.put("XIX", "19");
        romaToInt.put("XX", "20");
        romaToInt.put("XXX", "30");
        romaToInt.put("XL", "40");
        romaToInt.put("L", "50");
        romaToInt.put("LX", "60");
        romaToInt.put("LXX", "70");
        romaToInt.put("LXXX", "80");
        romaToInt.put("XC", "90");
        romaToInt.put("C", "100");
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
    private static String result;
    public static String convertIntToRoma(int res){
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
        intToRoma.put(11, "XI");
        intToRoma.put(12, "XII");
        intToRoma.put(13, "XIII");
        intToRoma.put(14, "XIV");
        intToRoma.put(15, "XV");
        intToRoma.put(16, "XVI");
        intToRoma.put(17, "XVII");
        intToRoma.put(18, "XVIII");
        intToRoma.put(19, "XIX");
        intToRoma.put(20, "XX");
        intToRoma.put(30, "XXX");
        intToRoma.put(40, "XL");
        intToRoma.put(50, "L");
        intToRoma.put(60, "LX");
        intToRoma.put(70, "LXX");
        intToRoma.put(80, "LXXX");
        intToRoma.put(90, "XC");
        intToRoma.put(100, "C");

        for (int k = 0; k < 1; k++){
            result = intToRoma.get(res);
        }
        return result;
    }
}
