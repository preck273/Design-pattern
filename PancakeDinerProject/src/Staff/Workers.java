package Staff;

import Order.Order;
import Pancake.Pancake;
import Customer.Customer;

public abstract class Workers {
    private int workID;
    private String name;
    private double paymentPerHour;
    public Workers(int workID, String name, double paymentPerHour){
        this.workID = workID;
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public int getWorkID() { return workID; }
    public String getName() { return name; }
    public double getPaymentPerHour() { return paymentPerHour; }
    public abstract double calculateCheck(Order order);
    public abstract Pancake makePancake(Pancake currentPancake);
    public abstract double calculateSalary();
    public abstract Order getOrder(Order order);
}