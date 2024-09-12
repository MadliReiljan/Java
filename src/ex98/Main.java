package ex98;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        copied[0] = 99;

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }

    public static int[] copy(int[] array) {

        int[] copyArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }

        return copyArray;
    }
}
