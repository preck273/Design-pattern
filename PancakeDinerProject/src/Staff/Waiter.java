package Staff;

import Payment.Payment;
import Order.Order;

public class Waiter extends Workers {
    public Payment payment;
    public Waiter(int workID, String name) { super(workID, name); }
    @Override
    public void makePancake(){ System.out.println("I will ask the chef how the progress."); }
    @Override
    public void getTotalOrderAmount() { payment.getOrder().getTotalPrice(); }
    public void setUpPaymentOrder(Order order){ order.getTotalPrice(); }
}