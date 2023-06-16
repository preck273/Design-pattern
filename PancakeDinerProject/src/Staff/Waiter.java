package Staff;

import Pancake.Pancake;
import Order.Order;
import Customer.Customer;

public class Waiter extends Workers {
    private double workingHours;
    public Waiter(int workID, String name, double paymentPerHour, double workingHours) {
        super(workID, name, paymentPerHour);
        this.workingHours = workingHours;
    }
    @Override
    public double calculateCheck(Order order) { return order.getTotalPrice(); }
    @Override
    public Pancake makePancake(Pancake currentPancake) { return null; }
    @Override
    public double calculateSalary() { return getPaymentPerHour() * workingHours; }
    @Override
    public Order getOrder(Order order) { return order; }
}