package Pancake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SaltyPancake extends Pancake {
    private ArrayList<Nutella> nutella;
    private HashSet<Cheese> cheese;
    private HashSet<Egg> egg;
    private HashSet<Strawberry> strawberry;

    public SaltyPancake(double basePrice, int quantity) {
        super(basePrice, quantity);
        nutella = new ArrayList<>();
        cheese = new HashSet<>();
        egg = new HashSet<>();
        strawberry = new HashSet<>();
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

    @Override
    public List<Toppings> getToppings() {
        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.addAll(egg);
        toppingsList.addAll(strawberry);
        return toppingsList;
    }

    @Override
    public List<Creams> getCreams() {
        List<Creams> creamsList = new ArrayList<>();
        creamsList.addAll(nutella);
        creamsList.addAll(cheese);
        return creamsList;
    }

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

    //method to create Salty pancake
    @Override
    public Pancake createPancake() {
        return new SaltyPancake(getBasePrice(), getQuantity());
    }

    public void increaseQuantity() {
        quantity++;
    }

}