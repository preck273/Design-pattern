package Staff;

import Pancake.Pancake;
import Order.Order;

public class Chef extends Workers {
    private Pancake currentPancake;
    public Chef(int workID, String name) { super(workID, name); }
    public void makePancake() { System.out.println("The " + this.currentPancake + " is in progress."); }
    @Override
    public void getTotalOrderAmount() { System.out.println("You should ask the waiter."); }
}