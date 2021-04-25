package com.calculator.calc;

public class Calc {
    private static int result;
    public static int getCalc(int[] operand, String[] operator){
        int intOperator = operator.length - 1;
        String sign = operator[intOperator];
        char totalSign = sign.charAt(0);
        switch (totalSign) {
            case '+' -> result = operand[0] + operand[1];
            case '-' -> result = operand[0] - operand[1];
            case '*' -> result = operand[0] * operand[1];
            case '/' -> result = operand[0] / operand[1];
        }
        return result;
    }
}
