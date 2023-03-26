package Staff;

import Pancake.Pancake;
import Order.Order;

public class Chef extends Workers {
    private Pancake currentPancake;
    public Chef(int workID, String name) { super(workID, name); }



    public Pancake makePancake(Pancake currentPancake) {
        return this.currentPancake = currentPancake;
    }

}