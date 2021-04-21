package com.calculator;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Action message = new Action();
    static GetArgs operator = new GetArgs();
    static Calc result = new Calc();
    public static void main(String[] args) {
        message.Hello();
        String exp = s.nextLine(); // Вводим арифмктическое выражение
        String[] i = operator.getOperator(exp);
//        for (String d : i){
//            System.out.print(d + " ");}
//        System.out.println();
        String[] j = operator.getOperand(exp);
//        for (String f : j){
//            System.out.print(f + " ");}
//        System.out.println();
        System.out.println(result.add(i, j));

        String[] arab = new String[]{"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] roma = new String[]{"X","I","II","III","IV","V","VI","VII","VIII","IX"};
        String romaStr = "-XI+III";

    }
}

















//        GetArgs arg = new GetArgs();
//        Calc calc = new Calc();
//
//
//
//        System.out.println(message.Hello());
//        System.out.println(message.inputNum());
//        arg.args();
//        System.out.println(message.resMess() + calc.result);