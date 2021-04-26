package com.calculator.roma;

import com.calculator.exeptions.CalculatorExeption;

import static com.calculator.core.CalculatorCore.getCalc;
import static com.calculator.core.ParserToIntArray.getArab;
import static com.calculator.core.ParserToIntArray.setArab;
import static com.calculator.roma.ConvertRomaToIntAndBack.convertIntToRoma;
import static com.calculator.roma.RomaSplitStringToIntArrayOperandAndOperator.Operand;
import static com.calculator.roma.RomaSplitStringToIntArrayOperandAndOperator.Operator;
import static com.calculator.roma.SplitStringToRomaSymbolArrayAndOperator.*;
import static java.lang.String.*;

/**
 * if the result is greater than 10 and is not divisible by 10 without a remainder
 * parse it into elements into an array, multiply the first element of the array by 10,
 * then find a match in the table of Roman symbols for each element, and return the
 * result as a string, otherwise simply return the converted result
 */
public class CalculationRomaAndToString {
    static int calculation;
    static String unitCalculation;
    static String digitCalculation;
    static String totalCalculation;

    public static String getTotalCalculation() {
        return totalCalculation;
    }

    public static void setTotalCalculation(String exp) throws CalculatorExeption {
        setCalculation(exp);
        if (getCalculation() >= 11 && getCalculation()%10 != 0){
              setDigitCalculation(getCalculation());
              totalCalculation = getDigitCalculation();
        } else {
              setUnitCalculation(getCalculation());
              totalCalculation = getUnitCalculation();
        }
    }

    public static int getCalculation() {
        return calculation;
    }

    public static void setCalculation(String exp) throws CalculatorExeption {
        int[] newOperand = Operand(exp);
        String[] newOperator = Operator(exp);
        calculation = getCalc(newOperand, newOperator);
    }

    public static String getUnitCalculation() {
        return unitCalculation;
    }

    public static void setUnitCalculation(int calculation) throws CalculatorExeption {
        if (calculation <= 0) throw new CalculatorExeption("Нет такого числа в Римском алфавите");
        unitCalculation = convertIntToRoma(calculation);
    }


    static int[] array;
    static int digit, unit;

    public static String getDigitCalculation() {
        return digitCalculation;}

    public static void setDigitCalculation(int calculation) throws CalculatorExeption {
        setArab(romaCalculation(valueOf(calculation)));
        array = getArab();
        digit = array[0] * 10;
        unit = array[1];
        digitCalculation = convertIntToRoma(digit) + convertIntToRoma(unit);
    }
}
