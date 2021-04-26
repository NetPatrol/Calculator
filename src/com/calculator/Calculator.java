package com.calculator;

import com.calculator.core.Runner;
import com.calculator.exeptions.CalculatorExeption;
import com.calculator.show.CalculatorMessages;
/**
 * Calculator v.1.0 by N3tPatrol 2021 year
 **/
public class Calculator {

    public static void main(String[] args) throws CalculatorExeption {
        CalculatorMessages.helloUser();
        Runner.begin();
    }
}