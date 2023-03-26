package Payment;

public class CashStrategy implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " in cash");
    }
}

