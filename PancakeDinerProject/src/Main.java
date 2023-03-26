import Customer.Customer;
import Order.Order;
import Pancake.Pancake;
import Pancake.SaltyPancake;
import Pancake.SweetPancake;
import Pancake.Nutella;
import Pancake.Cheese;
import Pancake.Egg;
import Pancake.Strawberry;
import Payment.Payment;
import Payment.CashStrategy;
import Payment.CardStrategy;
import Staff.Chef;
import Staff.Waiter;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "James Kay");
        Customer customer1 = new Customer(2, "Michael Bush");
        //Pancake pancake = new Pancake();
        SaltyPancake saltyPancake = new SaltyPancake();
        SweetPancake sweetPancake = new SweetPancake();

        Nutella nutella = new Nutella();
        Cheese cheese = new Cheese();
        Egg egg = new Egg();
        Strawberry strawberry = new Strawberry();

        Order order = new Order(customer);
        Order order1 = new Order(customer1);

        Payment payment = new Payment(order);
        Payment payment1 = new Payment(order1);
        CardStrategy cardStrategy = new CardStrategy(customer, "1234567", 123, "06/26");
        CashStrategy cashStrategy = new CashStrategy();

        Waiter waiter = new Waiter(01, "Merry");
        Chef chef = new Chef(02, "Pippin");

        order.addPancake(saltyPancake);
        //order.addPancake(sweetPancake);
        //saltyPancake.addNutella(nutella);
        saltyPancake.addCheese(cheese);
        saltyPancake.addEgg(egg);
        saltyPancake.addStrawberry(strawberry);
        System.out.println("Customer name: " + order.getCustomer().getCustomerName());
        System.out.println("Salty pancake price " + saltyPancake.price());
        System.out.println("Salty pancake price " + saltyPancake.price());


        System.out.println("Total price for SaltyPancake: " + order.getTotalPrice());

        payment.pay(cardStrategy);
        System.out.println();

        System.out.println("Another Customer");
        System.out.println();
        order1.addPancake(sweetPancake);
        sweetPancake.addEgg(egg);
//        sweetPancake.addStrawberry(strawberry);
//        order1.addPancake(saltyPancake);
//        saltyPancake.addCheese(cheese);
        System.out.println("Customer name: " + order1.getCustomer().getCustomerName());
        System.out.println("Total price for SweetPancake: " + order1.getTotalPrice());

        payment1.pay(cashStrategy);

//        chef.makePancake();
//        waiter.makePancake();
//        chef.getTotalOrderAmount();
//        waiter.getTotalOrderAmount();
        System.out.println("waiter get Total amount from a customer: " + waiter.getOrderAmount(order));

        System.out.println("Chef is making " + chef.makePancake(saltyPancake));
    }
}