package com.calculator;
/*

  Calculator v.1.0 by N3tPatrol

**/
import com.calculator.exeptions.InputExeption;
import com.calculator.run.Runner;
import com.calculator.out.InstructMessages;

public class Calculator {

    public static void main(String[] args) throws InputExeption {
        InstructMessages.helloUser();
        Runner.begin();
    }
}