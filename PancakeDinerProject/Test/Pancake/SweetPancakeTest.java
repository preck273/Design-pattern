package Pancake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SweetPancakeTest {

    Strawberry strawberry = new Strawberry();
    Nutella nutella = new Nutella();
    Cheese cheese = new Cheese();
    Egg egg = new Egg();


    @Test
    void getStrawBerryPrice() {
        assertEquals(0.2,strawberry.price());
    }

    @Test
    void getEggPrice() {
        assertEquals(0.4, nutella.price());
    }

    @Test
    void getNutellaPrice() {
        assertEquals(0.3, egg.price());
    }

    @Test
    void getCheesePrice() {
        assertEquals(0.6, cheese.price());
    }
}