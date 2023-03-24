package Pancake;

public abstract class Pancake implements PancakeFactory {

    public Pancake() {

    }


    //method to return the price of the 2 different type of pancake from the pancakeFactory interface price

    public void addCream(){
    }

    public void addToppings(){

    }


//    public void createPancake() {
//        this.cream = factory.createCream();
//        this.topping = factory.createTopping();
//    }
//    public void add(){
//        cream.add();
//        topping.add();
//    }


    public double getPrice(){
        return this.price();
    }



    public abstract void addNutella(Nutella nutella);
    public abstract void addCheese(Cheese cheese);
    public abstract void addEgg(Egg egg);
    public abstract void addStrawberry(Strawberry strawberry);
}