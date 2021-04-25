package com.calculator.calc;

import com.calculator.roma.RomaIO;
import com.calculator.roma.RomaLog;

public class RomaResult {
    private static int[] newOperand;
    private static String[] newOperator;

    public static String intResult(String exp) {
        newOperand = RomaLog.Operand(exp);
        newOperator = RomaLog.Operator(exp);
        int answer = Calc.getCalc(newOperand, newOperator);
        return RomaIO.convertIntToRoma(answer);
    }
}
