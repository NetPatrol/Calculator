package com.calculator.run;

import com.calculator.exeptions.InputExeption;
import com.calculator.exeptions.Proof;

public class Input {
    private static String exp;
    public static String getExp() {
        return exp;
    }
    /**
     *We receive a string from the user, check it for compliance with
     * the conditions, if not, throw an exception and exit the program.
     * If everything is in order, we continue.
     * */
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
