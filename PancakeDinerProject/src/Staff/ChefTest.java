package Staff;

import Customer.Customer;
import Order.Order;
import Pancake.SaltyPancake;
import Payment.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {
    Customer customer = new Customer(2, "Michael Bush");
    SaltyPancake saltyPancake = new SaltyPancake();
    Order order = new Order(customer);
    Payment payment = new Payment(order);
    Chef chef = new Chef(02, "Pippin", 5000);
    @Test
    void calculateCheck() {
        assertEquals(0.0, chef.calculateCheck(order));
    }
    @Test
    void makePancake() {
        assertEquals(saltyPancake, chef.makePancake(saltyPancake));
    }
    @Test
    void calculateSalary() {
        assertEquals(25000.0, chef.calculateSalary());
    }
    @Test
    void getOrder() {
        assertEquals(order, chef.getOrder(order));
    }
}