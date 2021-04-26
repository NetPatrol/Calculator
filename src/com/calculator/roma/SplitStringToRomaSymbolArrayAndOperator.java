package com.calculator.roma;

public class SplitStringToRomaSymbolArrayAndOperator {
    private static String[] roma;
    /**
     * We get all the numbers from the entered expression
     * by splitting the string through, using a regular expression
     * @return*/
    public static String[] romaOperand(String exp){
        roma = exp.split("([ -A-Z]+)");
        return roma;
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     * @return*/
    public static String[] romaOperator(String exp){
        roma = exp.split("([^ -A-Z]+)");
        return roma;
    }

    public static String[] romaResult(String exp){
        roma = exp.split("");
        return roma;
    }
}
