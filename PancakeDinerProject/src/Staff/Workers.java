package Staff;

import Order.Order;
import Pancake.Pancake;

public abstract class Workers {
    private int workID;
    private String name;
    public Workers(int workID, String name){
        this.workID = workID;
        this.name = name;
    }
    public int getWorkID() { return workID; }
    public String getName() { return name; }
    //public abstract void makePancake();
   // public abstract void getTotalOrderAmount();
}