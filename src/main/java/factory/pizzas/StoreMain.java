package factory.pizzas;

import factory.stores.ChicagoPizzaStore;
import factory.stores.NYPizzaStore;
import factory.stores.PizzaStore;

public class StoreMain {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("veggie");

        PizzaStore chStore = new ChicagoPizzaStore();
        chStore.orderPizza("veggie");
    }
}
