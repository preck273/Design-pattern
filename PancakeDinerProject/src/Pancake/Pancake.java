package Pancake;

import java.util.ArrayList;
import java.util.List;

public abstract class Pancake implements PancakeFactory {
    protected double basePrice;
    public int quantity;

    public Pancake(double basePrice, int quantity) {
        this.basePrice = basePrice;
        this.quantity = quantity;
    }

    public abstract void addCream(Creams cream);
    public abstract void addTopping(Toppings topping);

    public abstract List<Creams> getCreams();
    public abstract List<Toppings> getToppings();

    public double getTotalPrice() {
        return basePrice * quantity + getCreamPrice() + getToppingPrice() ;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected abstract double getCreamPrice();
    protected abstract double getToppingPrice();
}