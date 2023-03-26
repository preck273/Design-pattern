package Staff;

import Pancake.SaltyPancake;
import Pancake.SweetPancake;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefTest {

    Chef chef = new Chef(02, "Pippin");
    SaltyPancake saltyPancake = new SaltyPancake();
    SweetPancake sweetPancake = new SweetPancake();

    @Test
    void makePancake() {
        assertEquals(sweetPancake, chef.makePancake(sweetPancake));
    }
}