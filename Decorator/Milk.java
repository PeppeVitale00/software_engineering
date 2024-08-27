// Concrete Decorator
public class Milk extends AddonDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
    
    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}