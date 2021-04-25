package com.calculator.exeptions;

import com.calculator.arab.IntLog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proof {
    IntLog intLog = new IntLog();
    private boolean answer;


    public static boolean isCheckExpInt(String exp){
        Pattern p = Pattern.compile("\\d+");
        Matcher checkExpInt = p.matcher(exp);
        return checkExpInt.find();
    }
    public static boolean checkExpIntEndString(String exp){
        Pattern p = Pattern.compile(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*");
        Matcher checkExpIntEndString = p.matcher(exp);
        return checkExpIntEndString.find();
    }
    public static boolean checkRomaSymbols(String exp){
        Pattern p = Pattern.compile("[^A-HJ-UWY-Z]|[a-z]+");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    public static boolean anyKey(String exp){
        Pattern p = Pattern.compile("[^A-Z]|[А-Я]\\w+");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    public static boolean inputBeginnerSymbols(String exp) {
        Pattern p = Pattern.compile("[А-Я]|[а-я]|[A-H]|[J-U]|[W]|[Y-Z]|[a-z]|\\d]");
        Matcher checkRomaSymbols = p.matcher(exp);
        return checkRomaSymbols.find();
    }
    public static void setIntCalculation(int[] exp) throws CalcExeption {
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] >= 11 | exp[i] <= -1)
                throw new CalcExeption();

        }
    }
    public static void input(String exp) throws InputExeption {
        if (inputBeginnerSymbols(exp))
            throw new InputExeption();
    }
    public static void inputArabAndRoma(String exp) throws InputExeption {
        if (checkExpIntEndString(exp))
            throw new InputExeption();
    }
}