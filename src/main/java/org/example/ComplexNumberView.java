package org.example;

import java.util.Scanner;

// View
class ComplexNumberView {
    private Scanner scanner = new Scanner(System.in);

    public double getRealInput(String number) {
        System.out.print("Enter the real part of the " + number + " complex number: ");
        return scanner.nextDouble();
    }

    public double getImaginaryInput(String number) {
        System.out.print("Enter the imaginary part of the " + number + " complex number: ");
        return scanner.nextDouble();
    }

    public void displayResult(String result) {
        System.out.println(result);
    }

    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
    public int getChoice() {
        System.out.print("Choose operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division): ");
        return scanner.nextInt();
    }
}
