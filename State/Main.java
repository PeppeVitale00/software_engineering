public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();


        coffeeMachine.insertCoin();                      // Inserisce la moneta
        coffeeMachine.pressButton("Espresso");    // Premere il pulsante per ottenere il caffè
        coffeeMachine.dispense();                      // Distribuisce il caffè
        
        // Prova a premere di nuovo il pulsante senza inserire una moneta
        coffeeMachine.pressButton("Cappuccino");                    // Questo non dovrebbe funzionare perché non c'è una moneta inserita
              
        
    }
}
