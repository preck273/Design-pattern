package Staff;

import Customer.Customer;
import Order.Order;
import Pancake.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaiterTest {

    Customer customer = new Customer(1, "James Kay");
    Waiter waiter = new Waiter(01, "Merry");
    Order order = new Order(customer);
    SaltyPancake saltyPancake = new SaltyPancake();
    SweetPancake sweetPancake = new SweetPancake();

    Nutella nutella = new Nutella();
    Cheese cheese = new Cheese();
    Egg egg = new Egg();
    Strawberry strawberry = new Strawberry();

    @BeforeEach
            void setup(){
        order.addPancake(saltyPancake);
        saltyPancake.addCheese(cheese);
        saltyPancake.addEgg(egg);
        saltyPancake.addStrawberry(strawberry);
    }


    @Test
    void getOrderAmount() {
        assertEquals(9.1, waiter.getOrderAmount(order));
    }
}