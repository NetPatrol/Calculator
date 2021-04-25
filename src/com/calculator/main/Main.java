package com.calculator.main;

import com.calculator.exeptions.InputExeption;

public class Main {

    public static void main(String[] args) throws InputExeption {
        System.out.println("   =======================================================================");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   +");
        System.out.println("+                                                                    +   +");
        System.out.println("+"+Color.ANSI_YELLOW+"                  Calculator v.1.0 by N3tPatrol"+Color.ANSI_RESET+"                     +   +\n" +
                           "+        Калькулятор получает на вход два числа  от 0 до 10          +   +\n" +
                           "+        и производит арифметические вычисления такие как:           +   +\n" +
                           "+        - сложение;                                                 +   +\n" +
                           "+        - вычитание;                                                +   +\n" +
                           "+        - умножение;                                                +   +\n" +
                           "+        - деление;                                                  +   +\n" +
                           "+        Кроме того, данный калькулятор может производить            +   +\n" +
                           "+        вычисления посредством ввода римских цифр от I дл X.        +   +\n" +
                           "+                                                                    + ===\n" +
                           "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        Runner.begin();
    }
}