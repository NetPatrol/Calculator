package com.calculator.run;
/*

   This is the starter class

*/

import com.calculator.out.Color;
import com.calculator.out.InstructMessages;
import com.calculator.calc.IntResult;
import com.calculator.calc.RomaResult;
import com.calculator.exeptions.Proof;

import java.util.Scanner;

public class Runner {
    private static final Scanner s = new Scanner(System.in);

    public static void begin() {
        InstructMessages.actoion();
        Input.setExp(s.nextLine());
        String exp = Input.getExp();

        if (Proof.isCheckExpInt(exp))
            System.out.println(Color.ANSI_PURPLE + "Результат равен: " + IntResult.intResult(exp) + Color.ANSI_RESET);
        else if (Proof.checkRomaSymbols(exp))
            System.out.println(Color.ANSI_PURPLE + "Результат равен: " + RomaResult.intResult(exp) + Color.ANSI_RESET);
        System.out.println();
        InstructMessages.choice();
        String x = s.nextLine();
        if (x.equals("1"))
            begin();
        else if (x.equals("2")){
            InstructMessages.bay();
            System.exit(0);}
        else if((Proof.inputBeginnerSymbols(x) | x.isEmpty()))
                    begin();

    }
}

