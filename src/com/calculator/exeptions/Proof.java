package com.calculator.exeptions;
/*

Class for checking for compliance with the conditions necessary for the correct operation of the program

*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proof {
/**
 * Check for the presence of digits in a user-entered expression.
 * **/
    public static boolean isCheckExpInt(String exp){
        Pattern p = Pattern.compile("\\d+");
        Matcher checkExpInt = p.matcher(exp);
        return checkExpInt.find();
    }
    /**
     * Checking for the presence of both numbers and string characters
     * in the expression entered by the user.
     * **/
    public static boolean checkExpIntEndString(String exp){
        Pattern p = Pattern.compile(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*");
        Matcher checkExpIntEndString = p.matcher(exp);
        return checkExpIntEndString.find();
    }
    /**
     * Checking for the presence of string characters that match Roman
     * numerals in a user-entered expression.
     * **/
    public static boolean checkRomaSymbols(String exp){
        Pattern p = Pattern.compile("[^A-HJ-UWY-Z]|[a-z]+");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    /**
     * Checking for the presence of string characters that match Roman numerals
     * and the absence of any other characters, including the Russian and Latin
     * alphabets, as well as numeric ones in the expression entered by the user.
     * **/
    public static boolean inputBeginnerSymbols(String exp) {
        Pattern p = Pattern.compile("[А-Я]|[а-я]|[A-H]|[J-U]|[W]|[Y-Z]|[a-z]|\\d]");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    /**
     * Verification for compliance with the conditions 10> = n> = 0, in order to
     * limit the value of the entered values
     * **/
    public static void setIntCalculation(int[] exp) throws CalcExeption {
        for (int j : exp) {
            if (j >= 11 | j <= -1)
                throw new CalcExeption();
        }
    }
    /**
     * {@link Proof#inputBeginnerSymbols}
     * */
    public static void input(String exp) throws InputExeption {
        if (inputBeginnerSymbols(exp))
            throw new InputExeption();
    }
    /**
     * {@link Proof#checkExpIntEndString}
     * */
    public static void inputArabAndRoma(String exp) throws InputExeption {
        if (checkExpIntEndString(exp))
            throw new InputExeption();
    }
}