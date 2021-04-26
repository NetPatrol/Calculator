package com.calculator;
/*

  Calculator v.1.0 by N3tPatrol 2021

**/
import com.calculator.exeptions.CalcExeption;
import com.calculator.exeptions.InputExeption;
import com.calculator.show.CalculatorMessages;
import com.calculator.core.Runner;

public class Calculator {

    public static void main(String[] args) throws InputExeption, CalcExeption {
        CalculatorMessages.helloUser();
        Runner.begin();
    }
}