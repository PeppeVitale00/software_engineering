

public class NoCoinState implements State {
    private CoffeeMachine coffeMachine;
    

    public NoCoinState(CoffeeMachine coffeMachine){
        this.coffeMachine=coffeMachine;        
    }

    @Override
    public void insertCoin(){
        System.out.println("Coin inserted. You can now press the button to order your product.");
        coffeMachine.setState(new CoinInsertedState(coffeMachine));
    }
    
    @Override
    public void pressButton(String product) {
        System.out.println("Insert coin before order your "+ product);
    }

    @Override
    public void dispense() {
        System.out.println("Impossible to dispense, insert coin first");
    }
}
