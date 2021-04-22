package com.calculator;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Action message = new Action();
    static Logic log = new Logic();
    public static void main(String[] args) {
        System.out.println(message.Hello());
        System.out.println(message.inputNum());
        String exp = s.nextLine();
        boolean checkExp = exp.matches("([\\d]+)");
        if (!checkExp) {
            System.out.println(log.answerInt(exp));
        } else {
            System.out.println(log.romaAnswer(exp));
        }
    }
}