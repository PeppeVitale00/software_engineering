
public class CoinInsertedState implements State {
    private CoffeeMachine coffeeMachine;

    public CoinInsertedState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.Choose your product!");
    }

    @Override
    public void pressButton(String product) {
        System.out.println("Button pressed. Your choice: "+product);
        coffeeMachine.setState(new DispensingState(coffeeMachine));
    }

    @Override
    public void dispense() {
        System.out.println("Choose your product first.");
    }
}
