package com.calculator.core;

import com.calculator.exeptions.CalculatorExeption;
import com.calculator.exeptions.CheckConditions;
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
        if (CheckConditions.checkIntEndString(e))
            throw new CalculatorExeption("Калькулятор может выполнять вычисления одновременно или с римскими или с арабскими числами.");
        if (CheckConditions.checkAbsenceAllOfExceptRomanAndInteger(e))
            throw new CalculatorExeption("Неверный формат выражения");
        exp = e;
    }
}
