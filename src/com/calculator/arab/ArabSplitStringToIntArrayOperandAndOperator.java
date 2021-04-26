package com.calculator.arab;

import com.calculator.exeptions.CalcExeption;

import static com.calculator.arab.SplitStringToIntArrayOperandAndOperator.*;
import static com.calculator.core.ParserToIntArray.getArab;
import static com.calculator.core.ParserToIntArray.setArab;

/**
 * We get a parsed array of int type to pass it to the calculator class
 * */
public class ArabSplitStringToIntArrayOperandAndOperator {

    public static int[] intOperand(String exp) throws CalcExeption {
        setArab(getOperand(exp));
        return getArab();
    }
    /**
     * We get the sign of the operation
     * */
    public static String[] intOperator(String exp){return getOperator(exp);}
}