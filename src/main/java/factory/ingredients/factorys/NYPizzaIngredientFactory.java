package factory.ingredients.factorys;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.cheese.ReggianoCheese;
import factory.ingredients.clams.Clams;
import factory.ingredients.clams.FreshClams;
import factory.ingredients.dough.Dough;
import factory.ingredients.dough.ThinCrustDough;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.pepperoni.SlicedPepperoni;
import factory.ingredients.sauce.MarinaraSauce;
import factory.ingredients.sauce.Sauce;
import factory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
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
