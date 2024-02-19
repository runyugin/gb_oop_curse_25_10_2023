package org.example;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> numbers) {
        Double result = 0.;

        for (Number number : numbers) {
            result += number.doubleValue();
        }

        return result;
    }

    public Double multiplication(List<? extends Number> numbers) {
        Double result = 1.;

        for (Number number : numbers) {
            result *= number.doubleValue();
        }

        return result;
    }

    public Double division(List<? extends Number> numbers) {
        if (numbers.isEmpty()) {
            return 0.;
        }

        Double result = numbers.get(0).doubleValue();

        for (int i = 1; i < numbers.size(); i++) {
            result /= numbers.get(i).doubleValue();
        }

        return result;
    }

    public String binaryTransform(Number number) {
        if (number instanceof Double || number instanceof Float) {
            Double value = number.doubleValue();

            String positiveNumBit = value < 0 ? "1" : "0";
            String num = Long.toBinaryString(Double.doubleToLongBits(Math.abs(value)));

            return positiveNumBit + num;
        } else {
            return Long.toBinaryString(number.intValue());
        }
    }
}
