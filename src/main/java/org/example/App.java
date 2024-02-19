package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        List<Double> doubleList = new ArrayList<>(List.of(5., -4., 3.));
        List<Integer> integerList = new ArrayList<>(List.of(7, 3, 2));

        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
        System.out.println("calc.sum(integerList) = " + calc.sum(integerList));

        System.out.println("calc.multiplication(doubleList) = " + calc.multiplication(doubleList));
        System.out.println("calc.multiplication(integerList) = " + calc.multiplication(integerList));

        System.out.println("calc.division(doubleList) = " + calc.division(doubleList));
        System.out.println("calc.division(integerList) = " + calc.division(integerList));

        System.out.println("calc.binaryTransform(5) = " + calc.binaryTransform(5));
        System.out.println("calc.binaryTransform(5.4) = " + calc.binaryTransform(5.4));
        System.out.println("calc.binaryTransform(34L) = " + calc.binaryTransform(34L));
        System.out.println("calc.binaryTransform(7.9f) = " + calc.binaryTransform(7.9f));
    }
}
