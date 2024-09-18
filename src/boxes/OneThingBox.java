package boxes;

import java.util.HashSet;
import java.util.Set;

public class OneThingBox extends Box {
    private Thing thing;

    // Constructor
    public OneThingBox() {
    }

    @Override
    public void add(Thing thing) {
        if (this.thing == null) {
            this.thing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thing != null && this.thing.equals(thing);
    }
}
