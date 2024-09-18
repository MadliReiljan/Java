package boxes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Thing objects
        Thing saludo = new Thing("Saludo", 5);
        Thing pirkka = new Thing("Pirkka", 5);
        Thing kopiLuwak = new Thing("Kopi Luwak", 5);

        // Test MaxWeightBox
        System.out.println("Testing MaxWeightBox:");
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(saludo);
        coffeeBox.add(pirkka);
        coffeeBox.add(kopiLuwak);
        System.out.println("Saludo in coffeeBox: " + coffeeBox.isInTheBox(saludo));
        System.out.println("Pirkka in coffeeBox: " + coffeeBox.isInTheBox(pirkka));
        System.out.println("Kopi Luwak in coffeeBox: " + coffeeBox.isInTheBox(kopiLuwak));

        // Test OneThingBox
        System.out.println("\nTesting OneThingBox:");
        OneThingBox oneThingBox = new OneThingBox();
        oneThingBox.add(saludo);
        oneThingBox.add(pirkka);
        System.out.println("Saludo in oneThingBox: " + oneThingBox.isInTheBox(saludo));
        System.out.println("Pirkka in oneThingBox: " + oneThingBox.isInTheBox(pirkka));

        // Test BlackHoleBox
        System.out.println("\nTesting BlackHoleBox:");
        BlackHoleBox blackHoleBox = new BlackHoleBox();
        blackHoleBox.add(saludo);
        blackHoleBox.add(pirkka);
        System.out.println("Saludo in blackHoleBox: " + blackHoleBox.isInTheBox(saludo));
        System.out.println("Pirkka in blackHoleBox: " + blackHoleBox.isInTheBox(pirkka));
    }
}
