package sda.training.system.erp.tools.calculator;

import java.util.Scanner;

public class InputFormUser {

    int sum = 123;

    public static Double[] getTwoNumberFromUser() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please give first double  :");
        Double val1 = input.nextDouble();
        System.out.println("Please give second double :");
        Double val2 = input.nextDouble();
        System.out.println("val1 = " + val1);
        System.out.println("val2 = " + val2);
        return new Double[]{val1, val2};
    }

    public static int getNumberFromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please select number  :");
        int val1 = input.nextInt();
        return val1;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Take String ");
        String valString = input.next();
        System.out.println("Take int ");
        int valInt = input.nextInt();

        System.out.println("int " + valInt);
        System.out.println("String " + valString);
        System.out.println("Take String to Int");
        String valIntAsString = input.next();
        int valInt2 = Integer.parseInt(valIntAsString);

    }
}