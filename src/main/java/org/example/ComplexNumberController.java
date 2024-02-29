package org.example;

// Controller

class ComplexNumberController {
    private ComplexNumberView view;

    public ComplexNumberController(ComplexNumberView view) {
        this.view = view;
    }

    public void execute() {
        double real1 = view.getRealInput("first");
        double imaginary1 = view.getImaginaryInput("first");

        double real2 = view.getRealInput("second");
        double imaginary2 = view.getImaginaryInput("second");

        ComplexNumber number1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber number2 = new ComplexNumber(real2, imaginary2);

        ComplexNumberInterface number1Logged = new LoggingComplexNumberDecorator(number1);

        int choice = view.getChoice();

        ComplexNumber result;

        if (choice == 1) {
            result = number1Logged.add(number2);
            view.displayResult("The sum of " + number1 + " and " + number2 + " is: " + result);
        } else if (choice == 2) {
            result = number1Logged.subtract(number2);
            view.displayResult("The result of " + number1 + " minus " + number2 + " is: " + result);
        } else if (choice == 3) {
            result = number1Logged.multiply(number2);
            view.displayResult("The product of " + number1 + " and " + number2 + " is: " + result);
        } else if (choice == 4) {
            result = number1Logged.divide(number2);
            view.displayResult("The result of " + number1 + " divided by " + number2 + " is: " + result);
        } else {
            view.displayResult("Invalid choice.");
        }
        view.closeScanner();
    }
}
