package factory.stores;

import factory.ingredients.factorys.NYPizzaIngredientFactory;
import factory.ingredients.factorys.PizzaIngredientFactory;
import factory.pizzas.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        switch (type){
            case "cheese" -> {
                pizza = new CheesePizza(factory);
                pizza.setName("뉴욕 스타일 치즈 피자");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(factory);
                pizza.setName("뉴욕 스타일 야채 피자");
            }
            case "clam" -> {
                pizza = new ClamPizza(factory);
                pizza.setName("뉴욕 스타일 조개 피자");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(factory);
                pizza.setName("뉴욕 스타일 페퍼로니 피자");
            }
            default -> pizza = null;
        }

        return pizza;
    }
}
