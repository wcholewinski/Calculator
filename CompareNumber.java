package sda.training.system.erp.tools.calculator;

public class CompareNumber {

    public static void compare(double a, double b) {

        if (a > b) {
            System.out.println(a + " jest wieksze od " + b);
        } else if (a < b) {
            System.out.println(a + " jest mniejsze od " + b);
        } else {
            System.out.println(a + " jest rowne " + b);
        }

    }

    public static void main(String[] args) {

        Double[] inputs = InputFormUser.getTwoNumberFromUser();
        compare(inputs[0], inputs[1]);
    }
}
