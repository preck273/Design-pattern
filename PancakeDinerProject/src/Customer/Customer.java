package Customer;

import Order.Order;

public class Customer {
    private int customerID;
    private String customerName;
    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }
    public int getCustomerID() { return customerID; }
    public String getCustomerName() { return customerName; }
    public Order placeOrder() { return new Order(); }
}