package com.calculator;

public class Calc {
    public Calc(){
        super();
    }
    public int add(String[] operand, String[] operator){
        int q = operator.length-1;
        String sign = operator[q];
        char o = sign.charAt(0);
        int result = 0;
        if (o == '+') {
            result = Integer.parseInt(operand[0]) + Integer.parseInt(operand[1]);
        } else if (o == '-') {
            result = Integer.parseInt(operand[0]) - Integer.parseInt(operand[1]);
        } else if (o == '*') {
            result = Integer.parseInt(operand[0]) * Integer.parseInt(operand[1]);
        } else if (o == '/') {
            result = Integer.parseInt(operand[0]) / Integer.parseInt(operand[1]);
        }
        return result;
    }

}
