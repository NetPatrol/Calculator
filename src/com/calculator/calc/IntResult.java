package com.calculator.calc;

import com.calculator.arab.IntLog;

public class IntResult {

    public static int intResult(String exp){
        int[] newOperand = IntLog.intOperand(exp);
        String[] newOperator = IntLog.intOperator(exp);
        return Calc.getCalc(newOperand, newOperator);
    }
}
