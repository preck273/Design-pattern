package Pancake;

public interface PancakeFactory {
     Toppings createTopping();
     Creams createCream();
     double price();
}