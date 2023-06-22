package Pancake;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SweetPancake extends Pancake {
    private HashSet<Egg> egg;
    private HashSet<Strawberry> strawberry;
    private HashSet<Nutella> nutella;
    private HashSet<Cheese> cheese;

    public SweetPancake(double basePrice, int quantity) {
        super(basePrice, quantity);
        egg = new HashSet<>();
        strawberry = new HashSet<>();
        nutella = new HashSet<>();
        cheese = new HashSet<>();
    }

    @Override
    public void addTopping(Toppings topping) {
        if (topping instanceof Egg) {
            egg.add((Egg) topping);
        } else if (topping instanceof Strawberry) {
            strawberry.add((Strawberry) topping);
        }
    }

    @Override
    public void addCream(Creams cream) {
        if (cream instanceof Nutella) {
            nutella.add((Nutella) cream);
        }else if (cream instanceof Cheese){
            cheese.add((Cheese) cream);
        }
    }
    //method to get the list of toppings
    @Override
    public List<Toppings> getToppings() {
        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.addAll(egg);
        toppingsList.addAll(strawberry);
        return toppingsList;
    }

    //method to get the list of creams
    @Override
    public List<Creams> getCreams() {
        List<Creams> creamsList = new ArrayList<>();
        creamsList.addAll(nutella);
        creamsList.addAll(cheese);
        return creamsList;
    }

    //method to get cream price for nutella and cheese
    protected double getCreamPrice() {
        double creamPrice = 0.0;
        for (Nutella nutella : nutella) {
            creamPrice += nutella.price();
        }
        for (Cheese cheese : cheese) {
            creamPrice += cheese.price();
        }
        return creamPrice;
    }

    //method to get toppings price for egg and strawberries
    protected double getToppingPrice() {
        double toppingPrice = 0.0;
        for (Egg egg : egg) {
            toppingPrice += egg.price();
        }
        for (Strawberry strawberry : strawberry) {
            toppingPrice += strawberry.price();
        }
        return toppingPrice;
    }

    //method to create sweet pancake
    @Override
    public Pancake createPancake() {
        return new SaltyPancake(getBasePrice(), getQuantity());
    }
}