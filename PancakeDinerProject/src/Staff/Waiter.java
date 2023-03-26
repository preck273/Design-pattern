package Staff;

import Order.Order;
import Payment.Payment;

public class Waiter extends Workers {
    private Order order;
    public Waiter(int workID, String name) { super(workID, name); }


    //method for waiter to get total order amount from a customer
    public double getOrderAmount(Order order){
       return order.getTotalPrice();
    }

    //method for waiter to get list of a customer name and total order amount

}