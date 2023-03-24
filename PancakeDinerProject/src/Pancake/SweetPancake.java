package Pancake;

public class SweetPancake extends Pancake {
    @Override
    public Toppings createTopping() { return null; }
    @Override
    public Creams createCream() { return null; }
    @Override
    public double price() { return 5.0; }
}