package sda.training.system.erp.tools.calculator;

public class SimpleCalculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }


    public static void main(String[] args) {

        Double[] inputs = InputFormUser.getTwoNumberFromUser();
        double resultSum = sum(inputs[0], inputs[1]);
        double resultMultiply = multiply(inputs[0], inputs[1]);
        double resultDivision = division(inputs[0], inputs[1]);

        System.out.println("resultSum = " + resultSum);
        System.out.println("resultMultiply = " + resultMultiply);
        System.out.println("resultDivision = " + resultDivision);
    }
}

