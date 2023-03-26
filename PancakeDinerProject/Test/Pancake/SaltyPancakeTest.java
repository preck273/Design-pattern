package Pancake;

import Order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaltyPancakeTest {

    Strawberry strawberry = new Strawberry();
    Nutella nutella = new Nutella();
    Cheese cheese = new Cheese();
    Egg egg = new Egg();
    SaltyPancake saltyPancake = new SaltyPancake();


    @Test
    void getNutellaPrice() {
        assertEquals(0.4, nutella.price());

    }

    @Test
    void getCheesePrice() {
        assertEquals(0.6, cheese.price());
    }

    @Test
    void getStrawBerryPrice() {
        assertEquals(0.2,strawberry.price());
    }

    @Test
    void getEggPrice() {
        assertEquals(0.3, egg.price());
    }

    @Test
    void price() {
        assertEquals(8.0,saltyPancake.price());
    }
}