// Garret Wong
// wong6@umbc.edu

import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.println("");

        Add(firstNumber, secondNumber);
        Subtraction(firstNumber, secondNumber);
        Multiplication(firstNumber, secondNumber);
        Division(firstNumber, secondNumber);
    }

    public static void Add(int value_1, int value_2) {
        System.out.println(value_1 + " + " + value_2 + " = " + (value_1 + value_2));
    }

    public static void Subtraction(int value_1, int value_2) {
        System.out.println(value_1 + " - " + value_2 + " = " + (value_1 - value_2));
    }

    public static void Multiplication(int value_1, int value_2) {
        System.out.println(value_1 + " * " + value_2 + " = " + (value_1 * value_2));
    }

    public static void Division(int value_1, int value_2) {
        System.out.println(value_1 + " / " + value_2 + " = " + (value_1 / value_2));
    }
}
