package ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase1 = new Suitcase(5);
        suitcase1.addThing(book);
        suitcase1.addThing(mobile);

        Suitcase suitcase2 = new Suitcase(5);
        suitcase2.addThing(brick);

        Container container = new Container(10);
        container.addSuitcase(suitcase1);
        container.addSuitcase(suitcase2);

        // Only print the summary of suitcases in the container
        System.out.println(container);
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

    public int totalWeight() {
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

class Container {
    private List<Suitcase> suitcases;
    private int weightLimit;

    public Container(int weightLimit) {
        this.suitcases = new ArrayList<Suitcase>();
        this.weightLimit = weightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= weightLimit) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}