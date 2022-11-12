package factory;

import factory.ingredients.factorys.PizzaIngredientFactory;
import factory.pizzas.*;

public class SimplePizzaFactory {
    private PizzaIngredientFactory factory;

    public SimplePizzaFactory(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    public Pizza createPizza(String type){
        return switch (type){
            case "cheese" -> new CheesePizza(factory);
            case "pepperoni" -> new PepperoniPizza(factory);
            case "clam" -> new ClamPizza(factory);
            case "veggie" -> new VeggiePizza(factory);
            default -> null;
        };
    }
}
