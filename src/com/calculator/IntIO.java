package com.calculator;

public class IntIO {
    String[] operator;
    String[] operand;

    public IntIO(){
        super();
    }
    /**
     * We get all the numbers from the entered expression
     * by splitting the string through a split, using a regular expression
     * @return*/
    public String[] getOperand(String exp){
        operand = exp.split("([^-0-9]+)");
        return operand;
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     * @return*/
    public String[] getOperator(String exp){
        operator = exp.split("([-0 1 2 3 4 5 6 7 8 9]+)");
        return operator;
    }
}

