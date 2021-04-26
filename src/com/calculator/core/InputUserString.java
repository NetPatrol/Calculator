package com.calculator.core;

import com.calculator.exeptions.InputExeption;
import com.calculator.exeptions.Proof;
/**
 * Checking the input data from the user for compliance
 * with the conditions of the program
 **/
public class InputUserString {
    private static String exp;

    public static String getExp() {
        return exp;
    }
    public static void setExp(String e) throws InputExeption {
        if (Proof.checkExpIntEndString(e))
            throw new InputExeption("Калькулятор может выполнять вычисления одновременно или с римскими или с арабскими числами.");
        if (Proof.inputBeginnerSymbols(e))
            throw new InputExeption("Неверный формат выражения");
        exp = e;
    }
}
