package Pancake;
public class Pancake {
    private PancakeFactory factory;
    private Creams cream;
    private Toppings topping;
    public Pancake(PancakeFactory factory) { this.factory = factory; }
    void createPancake() {
        this.cream = factory.createCream();
        this.topping = factory.createTopping();
    }
    void add(){
        cream.add();
        topping.add();
    }
}