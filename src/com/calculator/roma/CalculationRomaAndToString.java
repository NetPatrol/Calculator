package com.calculator.roma;

import com.calculator.exeptions.CalcExeption;
import com.calculator.exeptions.InputExeption;

import static com.calculator.core.CalculatorCore.getCalc;
import static com.calculator.roma.ConvertRomaToIntAndBack.convertIntToRoma;
import static com.calculator.roma.RomaSplitStringToIntArrayOperandAndOperator.Operand;
import static com.calculator.roma.RomaSplitStringToIntArrayOperandAndOperator.Operator;

/**
 * We return the data to the calculator, the result obtained,
 * we check the calculations for compliance with the condition
 * n <= 0, if we return everything well, if not, throw an exception
 **/
public class CalculationRomaAndToString {

    public static String intResult(String exp) throws InputExeption, CalcExeption {
        int[] newOperand = Operand(exp);
        String[] newOperator = Operator(exp);
        int result = getCalc(newOperand, newOperator);
        if (result <= 0) throw new InputExeption("Нет такого числа в Римском алфавите");
        return convertIntToRoma(result);
    }
}
