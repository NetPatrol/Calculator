package com.calculator.arab;

import com.calculator.calc.Parser;
/**
 * We get a parsed array of int type to pass it to the calculator class
 * */
public class IntLog {
    public static int[] intOperand(String exp){
        Parser.setArab(IntIO.getOperand(exp));
        return Parser.getArab(IntIO.getOperand(exp));
    }
    /**
     * We get the sign of the operation
     * */
    public static String[] intOperator(String exp){return IntIO.getOperator(exp);}
}