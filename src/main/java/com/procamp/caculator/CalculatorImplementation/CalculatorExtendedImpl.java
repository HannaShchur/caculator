package com.procamp.caculator.CalculatorImplementation;

import com.procamp.caculator.CalculatorImplementation.CalculatorBasicImpl;
import com.procamp.caculator.Repoes.CalculatorExtended;

public class CalculatorExtendedImpl extends CalculatorBasicImpl implements CalculatorExtended {

    @Override
    public double power(double num, double power) {
        return Math.pow(num, power);
    }

    @Override
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
