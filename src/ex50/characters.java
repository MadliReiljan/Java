package ex50;

import java.util.Scanner;

public class characters {
    public static void main(String[] args) {
        System.out.println("Type a name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (name.length() >= 3) {
            System.out.println("1st character: " + name.charAt(0));
            System.out.println("2nd character: " + name.charAt(1));
            System.out.println("3rd character: " + name.charAt(2));
        } else {
            System.out.println("The input is too short. Please enter at least 3 characters.");
        }
        sc.close();
    }
}