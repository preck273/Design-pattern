package Pancake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SaltyPancake extends Pancake{

    private HashSet<Nutella> nutella;
    private HashSet<Cheese> cheese;
    private HashSet<Egg> eggs;
    private HashSet<Strawberry> strawberries;

    public SaltyPancake(){
        nutella = new HashSet<Nutella>();
        cheese = new HashSet<Cheese>();
        strawberries = new HashSet<Strawberry>();
        eggs = new HashSet<Egg>();

    }

    public HashSet<Nutella> getNutella() {
        return this.nutella;
    }

    public HashSet<Cheese> getCheese() {
        return this.cheese;
    }

    public HashSet<Egg> getEggs() {
        return eggs;
    }

    public HashSet<Strawberry> getStrawberries() {
        return strawberries;
    }

    //method to add nutella to sweet pancake
    @Override
    public void addNutella(Nutella nutella) {
        this.nutella.add(nutella);
    }

    //method to add cheesse to saltyPancake
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

    @Override
    public double price() {
        //double originalPrice = 8.0;
        return 8.0 + this.getCheesePrice() + this.getNutellaPrice() + this.getEggPrice() + this.getStrawBerryPrice();
    }

}