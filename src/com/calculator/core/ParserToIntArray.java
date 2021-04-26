package com.calculator.core;

import com.calculator.exeptions.CalcExeption;

import java.util.Arrays;
/**
 * Parse the string array and get an array of int type,
 * together with that we check the resulting array for
 * compliance with the conditions for exceeding the permissible
 * values, as well as for the correctness of the set of
 * Roman numerals
 **/
public class ParserToIntArray {
    private static int[] arab;
    public static int[] getArab() {
        return arab;
    }
    public static void setArab(String[] exp) throws CalcExeption {
            int[] array = Arrays.stream(exp).mapToInt(Integer::parseInt).toArray();
            for (int j : array) {
                if (j >= 11 | j <= -1)
                    throw new CalcExeption();}
            arab = array;
    }
}
