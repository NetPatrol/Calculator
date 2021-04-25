package com.calculator.calc;

import com.calculator.roma.RomaIO;
import com.calculator.roma.RomaLog;

public class RomaResult {

    public static String intResult(String exp) {
        int[] newOperand = RomaLog.Operand(exp);
        String[] newOperator = RomaLog.Operator(exp);
        int answer = Calc.getCalc(newOperand, newOperator);
        return RomaIO.convertIntToRoma(answer);
    }
}
