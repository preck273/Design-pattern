package Customer;

import Order.Order;

public class Customer {
    private int customerID;
    private String customerName;

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //method for the customer to place an order
    public Order placeOrder(Order newOrder){
        System.out.println("I would like to make an order.");
        return newOrder;
    }
}