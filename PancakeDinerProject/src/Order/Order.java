package Order;

import java.util.ArrayList;

import Customer.Customer;
import Pancake.Pancake;

public class Order {
    private final ArrayList<OrderCommand> commandList;
    private ArrayList<Pancake> pancakes;
    private Customer customer;

    public Order(Customer customer) {
        commandList = new ArrayList<>();
        pancakes = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderCommand> getCommandList() { return commandList; }

    public ArrayList<Pancake> getPancakes() { return pancakes; }

    public void setPancakes(ArrayList<Pancake> pancakes) {
        this.pancakes = pancakes;
    }

    public void addPancake(Pancake pancake){
        this.pancakes.add(pancake);
    }
    public void execute(){}
    public void removePancake(Pancake pancake){
        this.pancakes.remove(pancake);
    }

    public void updateItem(Pancake pancake, int quantity){
        //Find the pancake in the list and update its quantity
        for (Pancake p: this.pancakes){
            if(p.equals(pancake)) {
                //p.pancakes.add(pancake);
            }
        }
    }


    //method to get the total price of the pancake ordered
    public double getTotalPrice()
    {
        double total = 0.0;
        for(Pancake pancake: this.pancakes){
            total += pancake.getPrice();
        }
        return total;
    }
}
