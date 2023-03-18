package Pancake;

public class SweetPancake implements PancakeFactory{
    @Override
    public Toppings createTopping() { return null; }
    @Override
    public Creams createCream() { return null; }
    @Override
    public double price() { return 0; }
}