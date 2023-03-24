package Payment;

import Order.Order;
import Staff.Waiter;

public class Payment{

    private PaymentStrategy paymentStrategy;
    private Order order;

    public Payment(Order order){
       // this.paymentStrategy = null;
        this.order = order;
    }
    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    //method to make payment
    public void pay(PaymentStrategy paymentStrategy){
        double amount = this.order.getTotalPrice();
        paymentStrategy.pay(amount);
    }
}
