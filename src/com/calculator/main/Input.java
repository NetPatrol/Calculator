package com.calculator.main;

import com.calculator.exeptions.InputExeption;
import com.calculator.exeptions.Proof;

public class Input {
    private static String exp;
    public static String getExp() {
        return exp;
    }
    public static void setExp(String exp){
        try {
            Proof.input(exp);
            Proof.inputArabAndRoma(exp);
        } catch (InputExeption e) {
            System.err.println("Неверный ввод!");
            System.exit(0);
        }
        Input.exp = exp;
    }
}
