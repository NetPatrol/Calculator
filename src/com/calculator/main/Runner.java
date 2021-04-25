package com.calculator.main;

import com.calculator.calc.IntResult;
import com.calculator.calc.RomaResult;
import com.calculator.exeptions.InputExeption;
import com.calculator.exeptions.Proof;

import java.util.Scanner;

public class Runner {
    private static Scanner s = new Scanner(System.in);

    public static void begin() throws InputExeption {
        System.out.print("                        Введите выражение: \n");
        Input.setExp(s.nextLine());
        String exp = Input.getExp();
        if (Proof.isCheckExpInt(exp))
            System.out.println(Color.ANSI_PURPLE + "Результат равен: " + IntResult.intResult(exp) + Color.ANSI_RESET);
        else if (Proof.checkRomaSymbols(exp))
            System.out.println("Результат равен: " + RomaResult.intResult(exp));
        System.out.println();
        System.out.println(Color.ANSI_CYAN+
                                   "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n" +Color.ANSI_RESET+
                Color.ANSI_CYAN+   "+"+Color.ANSI_YELLOW+"                      1........ Продолжить"+Color.ANSI_RESET + Color.ANSI_CYAN+"                          +\n"+
                Color.ANSI_CYAN+   "+"+Color.ANSI_YELLOW+"                      2.......... Выход"+Color.ANSI_RESET + Color.ANSI_CYAN+"                             +\n"+
                Color.ANSI_CYAN+   "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"+Color.ANSI_RESET);
        String x = s.nextLine();
        if (x.equals("1"))
            begin();
        else if (x.equals("2"))
            System.exit(0);
    }
}

