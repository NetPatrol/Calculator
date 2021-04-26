package com.calculator.core;

import com.calculator.exeptions.CalculatorExeption;

import static com.calculator.exeptions.CheckConditions.checkAbsenceAllOfExceptRomanAndInteger;
import static com.calculator.exeptions.CheckConditions.checkIntEndString;

/**
 * Checking the input data from the user for compliance
 * with the conditions of the program
 **/
public class InputUserString {
    private static String exp;

    public static String getExp() {
        return exp;
    }
    public static void setExp(String e) throws CalculatorExeption {
        if (checkIntEndString(e))
            throw new CalculatorExeption("Калькулятор может выполнять вычисления одновременно или с римскими или с арабскими числами.");
        if (checkAbsenceAllOfExceptRomanAndInteger(e))
            throw new CalculatorExeption("Неверный формат выражения");
        exp = e;
    }
}
