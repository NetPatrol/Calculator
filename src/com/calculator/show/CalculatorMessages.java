package com.calculator.show;

import com.calculator.exeptions.CalculatorExeption;
import com.calculator.exeptions.CheckConditions;

import static com.calculator.core.Runner.begin;

public class CalculatorMessages {

    public static void startDoMessage() {
        System.out.print("\t\t\tВведите выражение: \n\n\n");
    }
    public static void choiceMenu() {
        System.out.println(
        Color.ANSI_CYAN+"   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +Color.ANSI_RESET+
        Color.ANSI_CYAN+"   +\t\t    "+Color.ANSI_YELLOW+"1........ Продолжить          "+Color.ANSI_RESET + Color.ANSI_CYAN+"    \t\t   +\n"+
        Color.ANSI_CYAN+"   +\t\t    "+Color.ANSI_YELLOW+"2.......... Выход          "+Color.ANSI_RESET + Color.ANSI_CYAN+"\t\t\t   +\n"+
        Color.ANSI_CYAN+"   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+Color.ANSI_RESET);
    }

    public static void choiceAction(String e) throws CalculatorExeption {
        if (!e.equals("2")) {
            if((CheckConditions.checkAbsenceAllOfExceptRomanAndInteger(e) | e.isEmpty()) | e.equals("1")) begin();
        } else {
            bay();
            System.exit(0);}
    }

    public static void helloUser() {
        System.out.println("   =======================================================================");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   +");
        System.out.println("+                                                                    +   +");
        System.out.println("+"+Color.ANSI_YELLOW+"                  Calculator v.1.0 by N3tHunter"+Color.ANSI_RESET+"                     +   +\n" +
                "+                                                                    +   +\n" +
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   +\n" +
                "+                                                                    +   +\n" +
                "+        Калькулятор получает на вход два числа  от 0 до 10          +   +\n" +
                "+        и производит арифметические вычисления такие как:           +   +\n" +
                "+        - сложение;                                                 +   +\n" +
                "+        - вычитание;                                                +   +\n" +
                "+        - умножение;                                                +   +\n" +
                "+        - деление;                                                  +   +\n" +
                "+        Кроме того, данный калькулятор может производить            +   +\n" +
                "+        вычисления посредством ввода римских цифр от I дл X.        +   +\n" +
                "+        Римских цифры вводите латиницей и включите CapsLock.        + ===\n" +
                "+                                                                    + == \n" +
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public static void printArabResult(int num){
        System.out.println(Color.ANSI_PURPLE + "\t\t\tРезультат равен: " + num + Color.ANSI_RESET);
    }

    public static void printRomaResult(String num){


        System.out.println(Color.ANSI_PURPLE + "\t\t\tРезультат равен: " + num + Color.ANSI_RESET);
    }

    public static void bay(){
        System.out.println(Color.ANSI_PURPLE+"\t\t\t   До свидания!\n\n\n"+Color.ANSI_RESET);
    }
}
