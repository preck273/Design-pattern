package Order;

import java.util.ArrayList;
import Pancake.Pancake;

public class Order {
    private ArrayList<OrderCommand> commandList;
    private ArrayList<Pancake> pancakes;
    public Order() {
        commandList = new ArrayList<OrderCommand>();
        pancakes = new ArrayList<Pancake>();
    }
    public ArrayList<OrderCommand> getCommandList() { return commandList; }
    public ArrayList<Pancake> getPancakes() { return pancakes; }
    public void addPancakes(Pancake pancake) { pancakes.add(pancake); }
    public void addItem(){}
    public void execute(){}
    public void removeItem(){}
    public void updateItem(Pancake item, int quantity){}
    public double getPrice(){ return 0.0;}
}
