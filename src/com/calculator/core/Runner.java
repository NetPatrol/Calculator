package com.calculator.core;

import com.calculator.exeptions.CalculatorExeption;
import com.calculator.exeptions.CheckConditions;

import java.util.Scanner;

import static com.calculator.arab.CalculationArab.result;
import static com.calculator.core.InputUserString.getExp;
import static com.calculator.core.InputUserString.setExp;
import static com.calculator.roma.CalculationRomaAndToString.*;
import static com.calculator.show.CalculatorMessages.*;
import static java.lang.System.in;
import static java.lang.System.out;

/*

   This is the starter class

*/
public class Runner {
    private static final Scanner s = new Scanner(in);

    public static void begin() throws CalculatorExeption {
        startDoMessage();
        setExp(s.nextLine());
        String exp = getExp();

        if (CheckConditions.checkOnlyInt(exp))
            printArabResult(result(exp));
        else if (CheckConditions.checkOnlyRoman(exp))
            setTotalCalculation(exp);
            printRomaResult(getTotalCalculation());

        out.println();
        choiceMenu();
        choiceAction(s.nextLine());
    }
}

