package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Optional;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Pick a number between 1 and 10");
            scanner.nextInt();
        } catch(InputMismatchException ime){
            System.out.println("You didn\'t type in a number, this is in our catch block");
        }

        System.out.println("This is after our try catch block");

        Main main = new Main();
        //main.aTestMethod();
        main.optionalsTest();
    }

    private void aTestMethod() throws ArithmeticException {

        System.out.println("What is the numerator you would like to divide? :");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the denominator you would like to divide? :");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(divide(num1, num2));
        System.out.println("after throws");

    }

    private int divide (int a , int b) {
        if (b == 0) {
            throw new ArithmeticException("You can\'t divide by zero!");
        } else {
            int c = (a / b);
            return c;
        }

    }

    private void optionalsTest() {
        Integer value1 = null;
        Integer value2 = 10;

        Optional<Integer> a = Optional.ofNullable(value1);

        Optional<Integer> b = Optional.of(value1);

        System.out.println(sum(a, b));
    }

    private int sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        Integer value1 = a.orElse(0);

        //System.out.println(value1);
        Integer value2 = b.get();

        

        return value1 + value2;
    }



}
