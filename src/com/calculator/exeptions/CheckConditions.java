package com.calculator.exeptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Setting up validation of input data for compliance with
 * the conditions is necessary for the correct start of calculations
 **/
public class CheckConditions {
    /**
     * Check for the presence of digits in a user-entered expression.
     **/
    public static boolean checkOnlyInt(String exp){
        Pattern p = Pattern.compile("\\d+");
        Matcher checkExpInt = p.matcher(exp);
        return checkExpInt.find();
    }
    /**
     * Checking for the presence of both numbers and string characters
     * in the expression entered by the user.
     **/
    public static boolean checkIntEndString(String exp){
        Pattern p = Pattern.compile(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*");
        Matcher checkExpIntEndString = p.matcher(exp);
        return checkExpIntEndString.find();
    }
    /**
     * Checking for the presence of string characters that match Roman
     * numerals in a user-entered expression.
     **/
    public static boolean checkOnlyRoman(String exp){
        Pattern p = Pattern.compile("[^A-HJ-UWY-Z]|[a-z]+");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    /**
     * Checking for the presence of string characters that match Roman numerals
     * and the absence of any other characters, including the Russian and Latin
     * alphabets, as well as numeric ones in the expression entered by the user.
     **/
    public static boolean checkAbsenceAllOfExceptRomanAndInteger(String exp) {
        Pattern p = Pattern.compile("[А-Я]|[а-я]|[A-H]|[J-U]|[W]|[Y-Z]|[a-z]|\\d]");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    public static boolean checkOperandAndOperator(String exp){
        Pattern p = Pattern.compile("[^-+*/]");
        Matcher checkExpInt = p.matcher(exp);
        return checkExpInt.find();
    }
}