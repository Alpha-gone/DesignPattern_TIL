package factory.ingredients.factorys;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.cheese.MozzarellaCheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.clams.FreshClams;
import factory.ingredients.dough.Dough;
import factory.ingredients.dough.ThickCrustDough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.pepperoni.SlicedPepperoni;
import factory.ingredients.sauce.PlumTomatoSauce;
import factory.ingredients.sauce.Sauce;
import factory.ingredients.veggies.BlackOlives;
import factory.ingredients.veggies.Eggplant;
import factory.ingredients.veggies.Spinach;
import factory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
