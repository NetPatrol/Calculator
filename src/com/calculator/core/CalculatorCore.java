package com.calculator.core;

import com.calculator.exeptions.CalcExeption;

public class CalculatorCore {
    private static int result;
    public static int getCalc(int[] operand, String[] operator) throws CalcExeption {
        int intOperator = operator.length - 1;
        String sign = operator[intOperator];
        char totalSign = sign.charAt(0);
        if (operand[1] == 0) throw new CalcExeption("Деление на 0 не лучшая из идей, по крайней мере в пределах этой локации");
        switch (totalSign) {
            case '+' -> result = operand[0] + operand[1];
            case '-' -> result = operand[0] - operand[1];
            case '*' -> result = operand[0] * operand[1];
            case '/' -> result = operand[0] / operand[1];
        }
        return result;
    }
}
