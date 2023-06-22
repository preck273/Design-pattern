import Customer.Customer;
import Order.Order;
import Pancake.*;
import Payment.Payment;
import Payment.PaymentStrategy;
import Payment.CashStrategy;
import Payment.CardStrategy;
import Staff.Chef;
import Staff.Waiter;
import Order.OrderCommand;
import Order.AddItemCommand;
import Order.UpdateItemCommand;
import Order.RemoveItemCommand;

public class Main {
    public static void main(String[] args) {
        //customer
        Customer customer = new Customer(1, "James Kay");
        Customer customer1 = new Customer(2, "Michael Bush");

        Waiter waiter = new Waiter(1, "Paul", 12, 8);
        Chef chef = new Chef(2, "Christ", 18);

        //create salty pancake
        PancakeFactory pancakeFactory = new SaltyPancake(2.5, 1);
        Pancake saltyPancake = pancakeFactory.createPancake();
        Pancake saltyPancake2 = pancakeFactory.createPancake();

        //create sweet pancake
        PancakeFactory pancakeFactory2 = new SweetPancake(3.5, 1);
        Pancake sweetPancake = pancakeFactory2.createPancake();


        //create Cream
        Nutella nutella = new Nutella();
        Cheese cheese = new Cheese();

        //create toppings
        Egg egg = new Egg();
        Strawberry strawberry = new Strawberry();

        //order
        Order order = new Order(customer);
        Order order1 = new Order(customer1);

        // Create commands and add them to the order
        OrderCommand addItemCommand = new AddItemCommand(saltyPancake, order);
        OrderCommand addItemCommand2 = new AddItemCommand(sweetPancake, order1);
        OrderCommand addItemCommand3 = new AddItemCommand(saltyPancake2, order1);

        //add cream/toppings to saltyPancake
        saltyPancake.addCream(nutella);
        saltyPancake.addCream(cheese);
        saltyPancake.addTopping(egg);
        saltyPancake.addTopping(strawberry);

        //add cream/toppings to sweetPancake
        sweetPancake.addTopping(strawberry);
        sweetPancake.addCream(cheese);

        saltyPancake2.addTopping(egg);

        //update items
        OrderCommand updateItem = new UpdateItemCommand(saltyPancake, 5, order);
        OrderCommand updateItem2 = new UpdateItemCommand(sweetPancake, 2, order1 );

        //remove item
        //OrderCommand removeItem = new RemoveItemCommand(saltyPancake, order);

        //add itemCommand to the list of commands
        order.addCommand(addItemCommand);
        order1.addCommand(addItemCommand2);
        order1.addCommand(addItemCommand3);

        //update order quantity
        order.addCommand(updateItem);
        order1.addCommand(updateItem2);

       // order.addCommand(removeItem);

        // Execute the commands
        order.executeCommands();
        order1.executeCommands();

        //for cash payment strategy
        PaymentStrategy cashStrategy = new CashStrategy(customer);
        Payment payment = new Payment(order);
        payment.setPaymentStrategy(cashStrategy);

        //for card payment strategy
        PaymentStrategy cardStrategy = new CardStrategy(customer1, "1234567", 123, "06/26");
        Payment payment2 = new Payment(order1);
        payment2.setPaymentStrategy(cardStrategy);

//        Waiter waiter = new Waiter(01, "Merry", 500.0, 8);
//        Chef chef = new Chef(02, "Pippin", 5000);*/


        System.out.println(order1.getOrderDetails());
        payment2.pay();
        System.out.println();
        System.out.println("Second order");
        System.out.println(order.getOrderDetails());
        payment.pay();


        System.out.println();
        System.out.println("Another Customer");
        System.out.println();


        System.out.println("Waiter gets the total amount from a customer: " + waiter.calculateCheck(order));
        System.out.println("Chef is making " + chef.makePancake(saltyPancake));

        System.out.println();
        System.out.println("Other things to see");
        System.out.println();

        System.out.println("Waiter's salary for a day: " + waiter.calculateSalary());
        System.out.println("Chef's salary for a day: " + chef.calculateSalary());
        System.out.println("Waiter gets the " + waiter.getOrder(order));
        System.out.println("Chef is making the " + chef.makePancake(sweetPancake));
    }
}
