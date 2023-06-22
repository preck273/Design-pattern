package Payment;

import Customer.Customer;

public class CardStrategy implements PaymentStrategy{

    private Customer customer;
    private String CardNumber;
    private int cvv;
    private String expiryDate;

    public CardStrategy(Customer customer, String cardNumber, int cvv, String expiryDate) {
        this.customer = customer;
        CardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " with credit/debit card");
    }
}
