package Payment;

public class CashStrategy implements PaymentStrategy{

    @Override
    public void pay(double value) {
        System.out.println("Paying $" + value + " in cash");

    }
}

