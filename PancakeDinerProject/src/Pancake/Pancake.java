package Pancake;

public class Pancake {
    private Creams cream;
    private Toppings topping;
    public Pancake(Creams cream, Toppings topping){
        this.cream = cream;
        this.topping = topping;
    }
    public Creams getCream() { return cream; }
    public Toppings getTopping() { return topping; }
    public void setCream(Creams cream) { this.cream = cream; }
    public void setTopping(Toppings topping) { this.topping = topping; }
    @Override
    public String toString() {  return "Pancake with "+cream+" and "+topping; }
}