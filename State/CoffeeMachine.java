

public class CoffeeMachine {
    private State currentState;
    private String product;

    

    public CoffeeMachine(){
        currentState=new NoCoinState(this);
    }
    
    public void setState(State state){
        currentState=state;
    }

    public void insertCoin(){
        currentState.insertCoin();
    }

    public void pressButton(String product){
        currentState.pressButton(product);
        this.product=product;
    }

    public void dispense(){
        currentState.dispense();
    }

    public String getProduct() {
        return product;
    }
   

}
