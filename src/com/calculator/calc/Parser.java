package com.calculator.calc;

import com.calculator.exeptions.CalcExeption;
import com.calculator.exeptions.Proof;

import java.util.Arrays;

public class Parser {
    static int[] operand;
    public static int[] getArab(String[] exp) {
        operand = Arrays.stream(exp).mapToInt(Integer::parseInt).toArray();
        return operand;
    }

    public static void setArab(String[] exp){
        try {
            operand = Arrays.stream(exp).mapToInt(Integer::parseInt).toArray();
            Proof.setIntCalculation(operand);
        } catch (CalcExeption e) {
            System.err.println("Неподдерживаемый размер чисел!");
            System.exit(0);
        } catch (NumberFormatException ex){
            System.err.println("Одно из чисел, введенных вами не существует.");
            System.exit(0);
        }
        Parser.operand = operand;
    }
}