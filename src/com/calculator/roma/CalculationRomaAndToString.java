package com.calculator.roma;

import com.calculator.exeptions.CalculatorExeption;

import static com.calculator.core.CalculatorCore.getCalc;
import static com.calculator.core.ParserToIntArray.getArab;
import static com.calculator.core.ParserToIntArray.setArab;
import static com.calculator.roma.ConvertRomaToIntAndBack.convertIntToRoma;
import static com.calculator.roma.RomaSplitStringToIntArrayOperandAndOperator.Operand;
import static com.calculator.roma.RomaSplitStringToIntArrayOperandAndOperator.Operator;
import static com.calculator.roma.SplitStringToRomaSymbolArrayAndOperator.*;

/**
 * if the result is greater than 10 and is not divisible by 10 without a remainder
 * parse it into elements into an array, multiply the first element of the array by 10,
 * then find a match in the table of Roman symbols for each element, and return the
 * result as a string, otherwise simply return the converted result
 */
public class CalculationRomaAndToString {
    static String n;
    static int digit;
    static int unit;
    static int[] array;
    static String total;
    public static String intResult(String exp) throws CalculatorExeption {
        int[] newOperand = Operand(exp);
        String[] newOperator = Operator(exp);
        int result = getCalc(newOperand, newOperator);
        if (result <= 0) throw new CalculatorExeption("Нет такого числа в Римском алфавите");
        if (result >= 11 && result%10 != 0){
            n = String.valueOf(result);
            setArab(romaResult(n));
            array = getArab();
            digit = array[0] * 10;
            unit = array[1];
            total = convertIntToRoma(digit) + convertIntToRoma(unit);
            return total;
        } else return convertIntToRoma(result);
    }
}
