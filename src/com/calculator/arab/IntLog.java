package com.calculator.arab;

import com.calculator.calc.Parser;

public class IntLog {
    public static int[] intOperand(String exp){
        Parser.setArab(IntIO.getOperand(exp));
        return Parser.getArab(IntIO.getOperand(exp));
    }
    public static String[] intOperator(String exp){return IntIO.getOperator(exp);}
}