package com.calculator.calc;

import com.calculator.arab.IntLog;

public class IntResult {
    private static int[] newOperand;
    private static String[] newOperator;

    public static int intResult(String exp){
        newOperand = IntLog.intOperand(exp);
        newOperator = IntLog.intOperator(exp);
        return Calc.getCalc(newOperand, newOperator);
    }
}
