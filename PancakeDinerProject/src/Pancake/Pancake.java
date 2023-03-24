package Pancake;

public abstract class Pancake implements PancakeFactory {
    private PancakeFactory factory;


    public Pancake(PancakeFactory factory) { this.factory = factory; }

    public Pancake() {

    }

    public void addCream(){
    }

    public void addToppings(){

    }

//
//    public void createPancake() {
//        this.cream = factory.createCream();
//        this.topping = factory.createTopping();
//    }
//    public void add(){
//        cream.add();
//        topping.add();
//    }
//
    public double getPrice(){
        return this.price();
    }
}