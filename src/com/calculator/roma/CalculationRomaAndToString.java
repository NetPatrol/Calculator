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
 * We return the data to the calculator, the result obtained,
 * we check the calculations for compliance with the condition
 * n <= 0, if we return everything well, if not, throw an exception
 **/
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
        if (result >= 11 & result < 100 & (result%10 != 0)){
            n = String.valueOf(result);
            setArab(romaResult(n));
            array = getArab();
            digit = array[0] * 10;
            unit = array[1];
            return total;
        } else return convertIntToRoma(result);
    }
}
