package com.calculator;

public class GetArgs {
    String[] operator;
    String[] operand;

    public GetArgs(){
        super();
    }

    /**
     *
     *
     *
     *
     * @return*/
    public String[] getOperand(String exp){
        operand = exp.split("[-0 1 2 3 4 5 6 7 8 9]");
        return operand;
    }
    /**
     *
     *[-0 1 2 3 4 5 6 7 8 9]
     *
     *"-[ ^0-9]+"
     * @return*/
    public String[] getOperator(String exp){
        operator = exp.split("([^-0-9]+)");
        return operator;
    }
}
