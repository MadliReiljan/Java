package ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
}

class Thing {
    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}

class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        int currentWeight = this.totalWeight();

        // Only add the thing if it doesn't exceed the max weight
        if (currentWeight + thing.getWeight() <= this.maxWeight) {
            this.things.add(thing);
        }
    }

    private int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : this.things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        int totalWeight = this.totalWeight();
        int thingCount = this.things.size();

        if (thingCount == 0) {
            return "0 things (0 kg)";
        } else if (thingCount == 1) {
            return "1 thing (" + totalWeight + " kg)";
        } else {
            return thingCount + " things (" + totalWeight + " kg)";
        }
    }
}


