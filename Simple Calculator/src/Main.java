import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = inputScanner.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = inputScanner.nextInt();

        System.out.print("What operation to do (+,-,/,*,%): ");
        String operation = inputScanner.next("(\\+|\\-|\\/|\\*|\\%)");

        System.out.println("Operation is: " + operation);

        int result = 0;
        if (operation.equals("+")) {
            result = add(number1, number2);
        }
        if (operation.equals("-")) {
            result = minus(number1, number2);
        }
        if (operation.equals("/")) {
            result = divide(number1, number2);
        }
        if (operation.equals("*")) {
            result = multiply(number1, number2);
        }
        if (operation.equals("%")) {
            result = percent(number1, number2);
        }

        System.out.println("The result of operation " + operation + " is: " + result);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }
    public static int divide (int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("You are not allowed to divide by zero");
        }
        return a / b;
    }
    static int multiply (int a, int b) {
        return a * b;
    }
    static int percent(int a, int b) {
        return a * b / 100;
    }
}