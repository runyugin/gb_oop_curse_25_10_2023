package org.example;

public class LoggingComplexNumberDecorator implements ComplexNumberInterface {
    
    private ComplexNumber complexNumber;

    public LoggingComplexNumberDecorator(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        ComplexNumber result = complexNumber.add(other);
        System.out.println("[LOG] Adding " + complexNumber + " to " + other + ". Result: " + result);
        return result;
    }

    @Override
    public String toString() {
        return complexNumber.toString();
    }

    @Override
    public ComplexNumber subtract(ComplexNumber other) {
        ComplexNumber result = complexNumber.subtract(other);
        System.out.println("[LOG] Subtracting " + complexNumber + " from " + other + ". Result: " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        ComplexNumber result = complexNumber.multiply(other);
        System.out.println("[LOG] Multiplying " + complexNumber + " by " + other + ". Result: " + result);
        return result;
    }
    @Override
    public ComplexNumber divide(ComplexNumber other) {
        ComplexNumber result = complexNumber.divide(other);
        System.out.println("[LOG] Dividing " + complexNumber + " by " + other + ". Result: " + result);
        return result;
    }

}
