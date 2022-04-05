// Garret Wong
// wong6@umbc.edu

import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {
        print();

        System.out.println();

        Book object_1 = new Book();
        int int_1 = object_1.action(24);
        String string_1 = object_1.action("Stephen King");
        boolean boolean_1 = object_1.action(true);
        double double_1 = object_1.action(11.80);

        System.out.println(int_1);
        System.out.println(string_1);
        System.out.println(boolean_1);
        System.out.println(double_1);

        System.out.println();

        Book object_2 = new Book();
        int int_2 = object_2.action(40);
        String string_2 = object_2.action("Mark Twain");
        boolean boolean_2 = object_2.action(false);
        double double_2 = object_2.action(40.75);

        System.out.println(int_2);
        System.out.println(string_2);
        System.out.println(boolean_2);
        System.out.println(double_2);
    }

    public static void print() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println(name);
    }
}
