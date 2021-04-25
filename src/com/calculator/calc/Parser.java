package com.calculator.calc;

import com.calculator.exeptions.CalcExeption;
import com.calculator.exeptions.Proof;

import java.util.Arrays;
/**
 * Parse the string array and get an array of int type,
 * together with that we check the resulting array for
 * compliance with the conditions for exceeding the permissible
 * values, as well as for the correctness of the set of
 * Roman numerals
 *
 * */
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
    }
}