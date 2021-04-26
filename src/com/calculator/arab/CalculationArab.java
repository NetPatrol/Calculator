package com.calculator.arab;

import com.calculator.exeptions.CalculatorExeption;

import static com.calculator.arab.ArabSplitStringToIntArrayOperandAndOperator.intOperand;
import static com.calculator.arab.ArabSplitStringToIntArrayOperandAndOperator.intOperator;
import static com.calculator.core.CalculatorCore.*;

public class CalculationArab {

    public static int result(String exp) throws CalculatorExeption {
        int[] newOperand = intOperand(exp);
        String[] newOperator = intOperator(exp);
        return getCalc(newOperand, newOperator);
    }
}
