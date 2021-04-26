package com.calculator.arab;

class SplitStringToIntArrayOperandAndOperator {

    /**
     * We get all the numbers from the entered expression
     * by splitting the string through a split, using a regular expression
     **/
    public static String[] getOperand(String exp) {
        return exp.split("\\D+");
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     **/
    public static String[] getOperator(String exp){
        return exp.split("\\d+");
    }
}

