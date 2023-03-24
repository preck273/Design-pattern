package Pancake;

import java.util.ArrayList;
import java.util.HashSet;

public class SweetPancake extends Pancake{

    private HashSet<Egg> eggs;
    private HashSet<Strawberry> strawberries;
    private HashSet<Nutella> nutella;
    private HashSet<Cheese> cheese;

    public SweetPancake(){
        this.eggs = new HashSet<Egg>();
        this.strawberries = new HashSet<Strawberry>();
        this.nutella = new HashSet<Nutella>();
        this.cheese = new HashSet<Cheese>();
    }

//    @Override
//    public void add() {
//        this.add();
//    }

    //method to add nutella to sweet pancake
    @Override
    public void addNutella(Nutella nutella) {
        this.addNutella(nutella);
    }
    //method to add cheese to sweet pancake
    @Override
    public void addCheese(Cheese cheese) {
        this.cheese.add(cheese);
    }

        //method to add strawberry to sweet pancake
    @Override
    public void addStrawberry(Strawberry strawberry) {
        this.strawberries.add(strawberry);
    }
    //method to add egg to sweet pancake
    @Override
    public void addEgg(Egg egg) {
        this.eggs.add(egg);
    }

    //method to get StrawBerry price
    public double getStrawBerryPrice(){
        double strawBerryPrice =0.0;
        for(Strawberry s : this.strawberries){
            strawBerryPrice = s.price();
        }
        return strawBerryPrice;
    }

    //method to get egg price
    public double getEggPrice(){
        double eggPrice =0.0;
        for(Egg e : this.eggs){
            eggPrice = e.price();
        }
        return eggPrice;
    }

    //method to get the price of Nutella saltyPancake
    public double getNutellaPrice(){
        double nutPrice = 0.0;
        for(Nutella n : this.nutella){
            nutPrice = n.price();
        }
        return nutPrice;
    }

    //method to get cheese price
    public double getCheesePrice(){
        double cheesePrice =0.0;
        for(Cheese c : this.cheese){
            cheesePrice = c.price();
        }
        return cheesePrice;
    }

    //price for sweet pancake
    @Override
    public double price() { return 5.0 + this.getCheesePrice() + this.getNutellaPrice() + this.getEggPrice() + this.getStrawBerryPrice(); }
}