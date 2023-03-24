import Customer.Customer;
import Order.Order;
import Pancake.Pancake;
import Pancake.SaltyPancake;
import Pancake.SweetPancake;
import Payment.Payment;
import Payment.CashStrategy;
import Payment.CardStrategy;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "James Kay");
        //Pancake pancake = new Pancake();
        SaltyPancake saltyPancake = new SaltyPancake();
        saltyPancake.createCream();
        saltyPancake.createTopping();
        SweetPancake sweetPancake = new SweetPancake();
        Order order = new Order(customer);

        Payment payment = new Payment(order);
        CardStrategy cardStrategy = new CardStrategy(customer, "1234567", 123, "06/26");


        order.addPancake(saltyPancake);
        order.addPancake(saltyPancake);
        order.addPancake(sweetPancake);
        System.out.println("Customer name: " + order.getCustomer().getCustomerName());

        System.out.println("Total price: " + order.getTotalPrice());

        payment.pay(cardStrategy);

        //System.out.println("Card Name: " + cardStrategy.getCustomer().getCustomerName() + "Card Number: " + cardStrategy.getCardNumber() + "Cvv: " + cardStrategy.getCvv() + "Expiry Date: " + cardStrategy.getExpiryDate() + ".");
    }




    }
