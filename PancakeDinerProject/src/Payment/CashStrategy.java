package Payment;

import Customer.Customer;

public class CashStrategy implements PaymentStrategy {
    private Customer customer;

    public CashStrategy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " in cash");
    }
}
