package Tests;

import Staff.Chef;
import Staff.Waiter;

import static org.junit.jupiter.api.Assertions.*;

class WorkersTest {
    Chef chef = new Chef(001, "Daniel");
    Waiter waiter = new Waiter(010, "Regina");
    @org.junit.jupiter.api.Test
    void getWorkID() {
        assertEquals(001, chef.getWorkID());
        assertEquals(010, waiter.getWorkID());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Daniel", chef.getName());
        assertEquals("Regina", waiter.getName());
    }
}