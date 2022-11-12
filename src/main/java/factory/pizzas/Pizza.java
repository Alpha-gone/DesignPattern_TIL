package factory.pizzas;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.dough.Dough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauce.Sauce;
import factory.ingredients.veggies.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("175도에서 25분간 굽기");
    }

    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    }

    public void box(){
        System.out.println("상자에 피자 담기");
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");

        for (Veggies veggy : veggies) {
            display.append(veggy + " ");
        }

        return display.toString();
    }
}
