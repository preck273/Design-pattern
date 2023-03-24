package Tests;

import Customer.Customer;
import Pancake.Cheese;
import Pancake.SaltyPancake;
import Payment.Payment;
import Staff.Waiter;
import Order.Order;
import Payment.CashStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaiterTest {
    public Waiter waiter = new Waiter(01, "Merry");
    public Customer customer = new Customer(03, "Gandalf");
    public Order order = new Order(customer);
    public Cheese cheese = new Cheese();
    public CashStrategy cash = new CashStrategy();
    public SaltyPancake saltyPancake = new SaltyPancake();
    public Payment payment = new Payment(order);
    @Test
    void makePancake() { waiter.makePancake(); }
    @Test
    void getTotalOrderAmount() {
        order.addPancake(saltyPancake);
        saltyPancake.addCheese(cheese);
        cash.pay(saltyPancake.getPrice());
        payment.pay(cash);
        waiter.getTotalOrderAmount(); }
    @Test
    void setUpPaymentOrder(){
        order.addPancake(saltyPancake);
        saltyPancake.addCheese(cheese);
        waiter.setUpPaymentOrder(order);
    }
}