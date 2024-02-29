package org.example;

// Model
class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public ComplexNumber divide(ComplexNumber other) {
        double realPart = ((this.real * other.real) + (this.imaginary * other.imaginary)) / ((other.real * other.real) + (other.imaginary * other.imaginary));
        double imaginaryPart = ((this.imaginary * other.real) - (this.real * other.imaginary)) / ((other.real * other.real) + (other.imaginary * other.imaginary));
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}