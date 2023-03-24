package Staff;

import Payment.Payment;

public class Waiter extends Workers {
    private Payment payment;
    public Waiter(int workID, String name) { super(workID, name); }
    public double getTotalOrderAmount() { return 0.0; }

    public void getOrder(){
        this.payment.getOrder();
    }
}