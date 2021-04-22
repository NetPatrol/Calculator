package com.calculator;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static Action message = new Action();
    static IntIO operator = new IntIO();
    static Calc result = new Calc();
    static RomaIO romaConvert = new RomaIO();
    public static void main(String[] args) {
        String exp = s.nextLine(); // Вводим арифмктическое выражение
        boolean checkExp = exp.matches("([\\d]+)");
        if (!checkExp) {
            String[] newOperator = operator.getOperator(exp); // Выделяем арифметические знаки операций
            String[] newOperand = operator.getOperand(exp); // Выделяем числа
            System.out.println(result.add(newOperand, newOperator)); // Скармливаем все калькулятору, получаем результат
        } else {
            String[] romaOperand = romaConvert.romaOperand(exp);
            String[] arabOperand = romaConvert.convertRomaToInt(romaOperand);
            String[] romaOperator = romaConvert.romaOperator(exp);
            int res = result.add(arabOperand, romaOperator);
            System.out.println(romaConvert.convertIntToRoma(res));
        }
    }
}