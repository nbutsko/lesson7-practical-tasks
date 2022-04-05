package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("The result of addition: " + calculator.addTwoIntegers(a, b));
        System.out.println("The result of multiplication: " + calculator.multiplyTwoIntegers(a, b));

    }
}
