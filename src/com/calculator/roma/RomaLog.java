package com.calculator.roma;

import com.calculator.calc.Parser;
/**
 * Parse the converted array of Roman numerals to Arabic
 * numerals and get an array like int
 * */
public class RomaLog {

    public static int[] Operand(String exp){
        Parser.setArab(RomaIO.convertRomaToInt(RomaIO.romaOperand(exp)));
        String[] romaOperand = RomaIO.romaOperand(exp);
        return Parser.getArab(RomaIO.convertRomaToInt(romaOperand));
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     */
    public static String[] Operator(String exp){
        return RomaIO.romaOperator(exp);
    }
}
