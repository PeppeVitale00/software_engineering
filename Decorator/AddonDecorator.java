//Decorator
public abstract class AddonDecorator implements Beverage {
    protected Beverage beverage;
    
    public AddonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
    
    @Override
    public double cost() {
        return beverage.cost();
    }
}