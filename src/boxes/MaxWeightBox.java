package boxes;

import java.util.HashSet;
import java.util.Set;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private Set<Thing> things = new HashSet<>();
    private int currentWeight = 0;

    // Constructor
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() <= maxWeight - currentWeight) {
            things.add(thing);
            currentWeight += thing.getWeight();
        } else {
            System.out.println("Thing is too heavy to add to this box.");
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
