package com.calculator.out;

public class InstructMessages {
    public static void actoion() {
        System.out.print("\t\t\tВведите выражение: \n");
    }
    public static void choice() {
        System.out.println(
        Color.ANSI_CYAN+"   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +Color.ANSI_RESET+
        Color.ANSI_CYAN+"   +\t\t    "+Color.ANSI_YELLOW+"1........ Продолжить          "+Color.ANSI_RESET + Color.ANSI_CYAN+"    \t\t   +\n"+
        Color.ANSI_CYAN+"   +\t\t    "+Color.ANSI_YELLOW+"2.......... Выход          "+Color.ANSI_RESET + Color.ANSI_CYAN+"\t\t\t   +\n"+
        Color.ANSI_CYAN+"   +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+Color.ANSI_RESET);
    }
    public static void helloUser() {
        System.out.println("   =======================================================================");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   +");
        System.out.println("+                                                                    +   +");
        System.out.println("+"+Color.ANSI_YELLOW+"                  Calculator v.1.0 by N3tPatrol"+Color.ANSI_RESET+"                     +   +\n" +
                "+           Калькулятор получает на вход два числа  от 0 до 10       +   +\n" +
                "+        и производит арифметические вычисления такие как:           +   +\n" +
                "+        - сложение;                                                 +   +\n" +
                "+        - вычитание;                                                +   +\n" +
                "+        - умножение;                                                +   +\n" +
                "+        - деление;                                                  +   +\n" +
                "+           Кроме того, данный калькулятор может производить         +   +\n" +
                "+        вычисления посредством ввода римских цифр от I дл X.        +   +\n" +
                "+           Для ввода Римских цифр включите CapsLock.                + ===\n" +
                "+                                                                    + ===\n" +
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
    public static void bay(){
        System.out.println(Color.ANSI_PURPLE+"\t\t\t\t\t\t\tДо свидания!"+Color.ANSI_RESET);
    }
}
