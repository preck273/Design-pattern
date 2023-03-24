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

    public String getCardNumber() {
        return this.CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with credit/debit card");
    }
//
//    public void getCardDetails(){
//        System.out.println("Card Name: " + this.getCustomer() + "Card Number: " + this.getCardNumber() + "Cvv: " + this.getCvv() + "Expiry Date: " + this.getExpiryDate() + ".");
//    }
}
