package com.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proof {
    public boolean isCheckExpInt(String exp){
        Pattern p = Pattern.compile("\\d+");
        Matcher checkExpInt = p.matcher(exp);
        return checkExpInt.find();
    }
    public boolean checkExpIntEndString(String exp){
        Pattern p2 = Pattern.compile(".*(\\p{L}(?=.*\\d)|\\d(?=.*\\p{L})).*");
        Matcher checkExpIntEndString = p2.matcher(exp);
        return checkExpIntEndString.find();
    }
    public boolean checkRomaSymbols(String exp){
        Pattern p3 = Pattern.compile("[^A-HJ-UWY-Z]+");
        Matcher checkRomaSymbols = p3.matcher(exp);
        return checkRomaSymbols.find();
    }
}
