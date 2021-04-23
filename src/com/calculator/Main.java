package com.calculator;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Action message = new Action();
    static Logic log = new Logic();
    static Proof proof = new Proof();

    static String exp;
    static String calculation;
    static char extOrAgain;


    public static void main(String[] args) {
        System.out.println(message.Hello());
        do {
            beginning();
            System.out.println("Продолжить - press any key \n" +
                    "Выйти - q");
            extOrAgain = s.nextLine().charAt('q');
        } while ('q' == extOrAgain);

    }

    public static void beginning() {
        System.out.println(message.inputNum());
        exp = s.nextLine();
        if (proof.checkExpIntEndString(exp)) {
            System.out.println(message.errorInput());
        } else {
            if (proof.isCheckExpInt(exp)) {
                calculation = String.valueOf(log.answerInt(exp));
            } else if (proof.checkRomaSymbols(exp)){
                calculation = log.romaAnswer(exp);
            } else {
                System.out.println(message.errorInput());
            }
        }
        System.out.println(message.resMess() + calculation);
    }
}