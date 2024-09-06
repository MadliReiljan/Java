package ex9;
import java.util.Scanner;

public class klass2 {
    public static void main(String[] args) {
        System.out.println("Type a number:");
        Scanner sc = new Scanner(System.in);
        String nr1 = sc.nextLine();

        System.out.println("Type another number:");
        String nr2 = sc.nextLine();

        try {

            double num1 = Double.parseDouble(nr1);
            double num2 = Double.parseDouble(nr2);


            if (num2 != 0) {
                double quotient = num1 / num2;
                System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, please enter numeric values.");
        }

        sc.close();
    }
}
