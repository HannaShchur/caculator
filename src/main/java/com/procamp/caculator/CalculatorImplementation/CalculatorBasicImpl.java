package com.procamp.caculator.CalculatorImplementation;

import com.procamp.caculator.CalculatorAbstraction.CalculatorBasicAbstraction;
import com.procamp.caculator.CustomException.NeedToChangeSomeArgumentException;

public class CalculatorBasicImpl extends CalculatorBasicAbstraction {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
       double res;
        if (num2!=0) {
           res = (double) num1/num2;
       } else {
            throw new NeedToChangeSomeArgumentException();
        }
        return res;
    }
}
