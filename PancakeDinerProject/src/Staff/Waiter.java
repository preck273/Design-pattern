package Staff;

import Payment.Payment;
import Order.Order;

public class Waiter extends Workers {
    public Payment payment;
    public Waiter(int workID, String name) { super(workID, name); }
    public double getTotalOrderAmount(Order order) { return payment.getOrder().getTotalPrice(); }
}