package com.calculator.arab;

public class IntIO {
    private static String[] operator;
    private static String[] operand;
    /**
     * We get all the numbers from the entered expression
     * by splitting the string through a split, using a regular expression
     * @return*/
    public static String[] getOperand(String exp) {
        operand = exp.split("\\D+");
        return operand;
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     * @return*/
    public static String[] getOperator(String exp){
        operator = exp.split("\\d+");
        return operator;
    }
}

