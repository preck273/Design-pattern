package Order;

import java.util.ArrayList;

import Customer.Customer;
import Pancake.Pancake;
import Pancake.Creams;
import Pancake.Toppings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Customer.Customer;
import Pancake.Pancake;

public class Order {
    private final ArrayList<OrderCommand> commandList;
    private ArrayList<Pancake> pancakes;
    private Customer customer;

    public Order(Customer customer) {
        commandList = new ArrayList<>();
        pancakes = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Pancake pancake : this.pancakes) {
            total += pancake.getTotalPrice();
        }
        return total;
    }

    public void executeCommands() {
        for (OrderCommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

    public void addCommand(OrderCommand command) {
        commandList.add(command);
    }

    public void addPancake(Pancake pancake) {
        pancakes.add(pancake);
    }

    public void removePancake(Pancake pancake) {
        Iterator<Pancake> iterator = pancakes.iterator();
        while (iterator.hasNext()) {
            Pancake p = iterator.next();
            if (p.equals(pancake)) {
                iterator.remove();
                break;
            }
        }
    }

    public void updatePancake(Pancake pancake, int newQuantity) {
        for (Pancake p : pancakes) {
            if (p.equals(pancake)) {
                p.setQuantity(newQuantity);
                break;
            }
        }
    }

    //method to get order details
    public String getOrderDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Order Details:\n");
        details.append("--------------------------------------------------------\n");
        details.append(String.format("Customer: %-30s\n", customer.getCustomerName()));
        details.append("--------------------------------------------------------\n");
        details.append(String.format("%-20s %-21s %-10s\n", "Item", "Quantity", "Price"));
        details.append("--------------------------------------------------------\n");

        double totalPrice = 0.0;

        for (Pancake pancake : pancakes) {
            details.append(String.format("%-32s %-10d $%-9.2f\n",
                    pancake.getClass().getSimpleName(),
                    pancake.getQuantity(),
                    pancake.getBasePrice()));

            List<Creams> creamsList = pancake.getCreams();
            if (!creamsList.isEmpty()) {
                for (Creams cream : creamsList) {
                    details.append(String.format("Cream -%-26s %9s $%-9.2f\n",
                            cream.getClass().getSimpleName(),
                            "",
                            cream.price()));
                }
            }

            List<Toppings> toppingsList = pancake.getToppings();
            if (!toppingsList.isEmpty()) {
                for (Toppings topping : toppingsList) {
                    details.append(String.format("Toppings -%-23s %9s $%-9.2f\n",
                            topping.getClass().getSimpleName(),
                            "",
                            topping.price()));
                }
            }

            details.append("--------------------------------------------------------\n");

            totalPrice += pancake.getTotalPrice();
        }

        details.append(String.format("%-32s %-10s $%-9.2f\n", "Total Price:", "", totalPrice));
        return details.toString();
    }






}
