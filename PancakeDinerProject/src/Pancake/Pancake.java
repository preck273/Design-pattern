package Pancake;

import java.util.HashSet;

public abstract class Pancake implements PancakeFactory {


    public Pancake() {
    }

    public double getPrice(){
        return this.price();
    }



    public abstract void addNutella(Nutella nutella);
    public abstract void addCheese(Cheese cheese);
    public abstract void addEgg(Egg egg);
    public abstract void addStrawberry(Strawberry strawberry);
}