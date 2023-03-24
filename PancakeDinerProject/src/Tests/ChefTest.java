package Tests;

import Pancake.Nutella;
import Pancake.Strawberry;
import Pancake.SweetPancake;
import Staff.Chef;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {
    Chef chef = new Chef(02, "Pippin");

    @Test
    void makePancake() {  chef.makePancake(); }
    @Test
    void getTotalOrderAmount() { chef.getTotalOrderAmount(); }
}