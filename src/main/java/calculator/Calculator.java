package calculator;

import java.util.Scanner;

public class Calculator {

    public static int addTwoIntegers (int a, int b){
        return a+b;
    }

    public static int multiplyTwoIntegers (int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("The result of addition: " + addTwoIntegers(a, b));
        System.out.println("The result of multiplication: " + multiplyTwoIntegers(a, b));

    }

}
