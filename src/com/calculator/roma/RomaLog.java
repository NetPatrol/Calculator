package com.calculator.roma;

import com.calculator.calc.Parser;

public class RomaLog {

    public static int[] Operand(String exp){
        Parser.setArab(RomaIO.convertRomaToInt(RomaIO.romaOperand(exp)));
        String[] romaOperand = RomaIO.romaOperand(exp);
        return Parser.getArab(RomaIO.convertRomaToInt(romaOperand));
    }

    public static String[] Operator(String exp){
        return RomaIO.romaOperator(exp);
    }
}
