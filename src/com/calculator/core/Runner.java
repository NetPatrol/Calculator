package com.calculator.core;

import com.calculator.exeptions.CalcExeption;
import com.calculator.exeptions.InputExeption;
import com.calculator.exeptions.Proof;

import java.util.Scanner;

import static com.calculator.arab.CalculationArab.result;
import static com.calculator.core.InputUserString.*;
import static com.calculator.show.CalculatorMessages.*;
import static com.calculator.roma.CalculationRomaAndToString.intResult;
import static java.lang.System.*;

/*

   This is the starter class

*/
public class Runner {
    private static final Scanner s = new Scanner(in);

    public static void begin() throws InputExeption, CalcExeption {
        startDoMessage();
        setExp(s.nextLine());
        String exp = getExp();

        if (Proof.isCheckExpInt(exp))
            printArabResult(result(exp));
        else if (Proof.checkRomaSymbols(exp))
            printRomaResult(intResult(exp));

        out.println();
        choiceMenu();
        choiceAction(s.nextLine());

    }
}

