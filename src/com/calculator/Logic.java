package com.calculator;

public class Logic {
    IntIO operator = new IntIO();
    Calc result = new Calc();
    RomaIO romaConvert = new RomaIO();
    int intResult;
    String romaResult;
    public int answerInt(String exp) {
        String[] newOperator = operator.getOperator(exp);
        String[] newOperand = operator.getOperand(exp);
        return intResult = result.add(newOperand, newOperator);
    }

    public String romaAnswer(String exp) {
        String[] romaOperand = romaConvert.romaOperand(exp);
        String[] arabOperand = romaConvert.convertRomaToInt(romaOperand);
        String[] romaOperator = romaConvert.romaOperator(exp);
        int i = result.add(arabOperand, romaOperator);
        return romaResult = romaConvert.convertIntToRoma(i);
    }
}
