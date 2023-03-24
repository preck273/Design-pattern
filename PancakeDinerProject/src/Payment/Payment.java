package Payment;

import Order.Order;

public class Payment{

    private PaymentStrategy paymentStrategy;
    private Order order;

    public Payment(Order order){
        this.order = order;
    }

    //method to get the total amount for order
    public double getTotalPayment(){
        return this.order.getTotalPrice();
    }

//method to get the order
    public Order getOrder() {
        return this.order;
    }

    //method to make payment
    public void pay(PaymentStrategy paymentStrategy){
        double amount = this.getTotalPayment();
        paymentStrategy.pay(amount);
    }
}
