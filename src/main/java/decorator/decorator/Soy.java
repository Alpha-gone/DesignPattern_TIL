package decorator.decorator;

import decorator.coffee.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + switch (beverage.getSize()){
            case TALL -> .1;
            case GRANDE -> .15;
            case VENTI -> .2;
        };
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
