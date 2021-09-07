package com.procamp.caculator;

import com.procamp.caculator.CalculatorImplementation.CalculatorBasicImpl;
import com.procamp.caculator.CalculatorImplementation.CalculatorExtendedImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CaculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CaculatorApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runDemo() {
        CalculatorBasicImpl calc = new CalculatorBasicImpl();
        CalculatorExtendedImpl calcAdvanced = new CalculatorExtendedImpl();


        var c1 = calc.add( 1, 1);
        var c2 = calc.subtract(2, 1);
        var c3 = calc.multiply(2, 2);
        var c4 = calc.divide(2, 1);

        var cc1 = calcAdvanced.add(2, 2);
        var cc2 = calcAdvanced.subtract(2, 2);
        var cc3 = calcAdvanced.multiply(2, 2);
        var cc4 = calcAdvanced.divide(2, 1);
        var cc5 = calcAdvanced.power(2, 2);
        var cc6 = calcAdvanced.squareRoot(4);

        List<?> list = Arrays.asList(c1, c2, c3, c4, cc1, cc2, cc3, cc4, cc5, cc6);

        list.forEach(System.out::println);
    }
}
