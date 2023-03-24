package Tests;

import Customer.Customer;
import org.junit.jupiter.api.Test;
import Order.Order;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer customer = new Customer(01, "Gandalf");
    Order order = new Order(customer);
    @Test
    void getCustomerID() { assertEquals(customer.getCustomerID(), 01); }
    @Test
    void setCustomerID() {
        customer.setCustomerID(02);
        assertEquals(customer.getCustomerID(), 02); }
    @Test
    void getCustomerName() { assertEquals(customer.getCustomerName(), "Gandalf"); }
    @Test
    void setCustomerName() {
        customer.setCustomerName("Aragon");
        assertEquals(customer.getCustomerName(), "Aragon"); }
    @Test
    void placeOrder() { assertEquals(order, customer.placeOrder(order)); }
}