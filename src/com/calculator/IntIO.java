package com.calculator;

public class IntIO {
    String[] operator;
    String[] operand;

    public IntIO(){
        super();
    }
    /**
     * Получаем все числа из введенного выражения
     * @return*/
    public String[] getOperand(String exp){
        operand = exp.split("([^-0-9]+)");
        return operand;
    }
    /**
     * Плучаем знаки выражения [+ - * /]
     * @return*/
    public String[] getOperator(String exp){
        operator = exp.split("([-0 1 2 3 4 5 6 7 8 9]+)");
        return operator;
    }
}

