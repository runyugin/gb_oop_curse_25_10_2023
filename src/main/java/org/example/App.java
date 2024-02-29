package org.example;

public class App {
    public static void main(String[] args) {
        ComplexNumberView view = new ComplexNumberView();
        ComplexNumberController controller = new ComplexNumberController(view);
        controller.execute();
    }
}