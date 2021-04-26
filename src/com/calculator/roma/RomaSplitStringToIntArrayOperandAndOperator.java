package com.calculator.roma;

import com.calculator.exeptions.CalculatorExeption;

import static com.calculator.roma.ConvertRomaToIntAndBack.*;
import static com.calculator.roma.SplitStringToRomaSymbolArrayAndOperator.*;
import static com.calculator.core.ParserToIntArray.getArab;
import static com.calculator.core.ParserToIntArray.setArab;


public class RomaSplitStringToIntArrayOperandAndOperator {
    /**
     * Parse the converted array of Roman numerals to Arabic
     * numerals and get an array like int
     **/
    public static int[] Operand(String exp) throws CalculatorExeption {
        setArab(convertRomaToInt(romaOperand(exp)));
        return getArab();
    }
    /**
     * Emitting expression signs [+ - * /]
     * by splitting the string through, using a regular expression
     **/
    public static String[] Operator(String exp){
        return romaOperator(exp);
    }
}
