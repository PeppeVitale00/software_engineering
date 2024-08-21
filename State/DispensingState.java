

public class DispensingState implements State {
    private CoffeeMachine coffeeMachine;

    public DispensingState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing your "+coffeeMachine.getProduct());
    }

    @Override
    public void pressButton(String product) {
        System.out.println("Already processing. Please wait dispensing your "+coffeeMachine.getProduct());
    }

    @Override
    public void dispense() {
        System.out.println(coffeeMachine.getProduct()+" dispensed, enjoy it");
        coffeeMachine.setState(new NoCoinState(coffeeMachine));  // Torna allo stato iniziale
    }
}
