package Pancake;

public class SaltyPancake extends Pancake  {


    @Override
    public Toppings createTopping() { return null; }
    @Override
    public Creams createCream() { return null; }
    @Override
    public double price() { return 8.0; }
}