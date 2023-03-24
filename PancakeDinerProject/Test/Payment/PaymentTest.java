package Payment;

import Customer.Customer;
import Order.Order;
import Pancake.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    Customer customer = new Customer(1, "James Kay");
    Customer customer1 = new Customer(2, "Michael Bush");
    //Pancake pancake = new Pancake();
    SaltyPancake saltyPancake = new SaltyPancake();
    SweetPancake sweetPancake = new SweetPancake();

    Nutella nutella = new Nutella();
    Cheese cheese = new Cheese();
    Egg egg = new Egg();
    Strawberry strawberry = new Strawberry();

    Order order = new Order(customer);
    Order order1 = new Order(customer1);

    Payment payment = new Payment(order);
    Payment payment1 = new Payment(order1);
    CardStrategy cardStrategy = new CardStrategy(customer, "1234567", 123, "06/26");
    CashStrategy cashStrategy = new CashStrategy();

    @BeforeEach
        void setup() {
            order.addPancake(saltyPancake);
            saltyPancake.addCheese(cheese);
            saltyPancake.addEgg(egg);
            saltyPancake.addStrawberry(strawberry);
            System.out.println("Customer name: " + order.getCustomer().getCustomerName());

            System.out.println("Total price for SaltyPancake: " + order.getTotalPrice());

            payment.pay(cardStrategy);
        }

    @Test
    void getTotalPayment() {
        assertEquals(9.1, payment.getTotalPayment());
    }


}