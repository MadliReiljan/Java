package ex53;

import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a word: ");
        String word = sc.nextLine();

        System.out.println("Length of the first part: ");
        int wordLength = sc.nextInt();

        if (wordLength <= word.length()) {
            String result = word.substring(0, wordLength);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: The length exceeds the word length");
        }

        sc.close();

    }
}
