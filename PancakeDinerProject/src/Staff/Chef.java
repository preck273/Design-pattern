package Staff;

import Order.Order;
import Pancake.Pancake;
import Customer.Customer;

public class Chef extends Workers {
    public Chef(int workID, String name, double paymentPerHour) {
        super(workID, name, paymentPerHour);
    }
    @Override
    public double calculateCheck(Order order) { return 0; }
    @Override
    public Pancake makePancake(Pancake currentPancake) { return currentPancake; }
    @Override
    public double calculateSalary() { return getPaymentPerHour() * 5; }

    @Override
    public Order getOrder(Order order) { return order; }
}