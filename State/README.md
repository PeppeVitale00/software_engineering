# State

State è un design pattern di tipo comportamentale che consente ad un oggetto di cambiare il proprio comportamente quando il suo stato interno cambia. Utilizziamo questo pattern quando è necessario che un oggetto si comporti in maniera diversa a seconda del suo stato.

## Componenti

1. **Context**: è la classe dell'oggetto che muta il suo stato
2. **State**: l'interfaccia che definisce le operazioni dei vari stati
3. **Concrete State**: rappresentano un comportamento specifico che corrisponde ad un particolare stato del context. Ogni concrete state implemente l'interfaccia.

## Flusso di esecuzione
Immaginiamo di avere una macchina del caffè che può trovarsi in diversi stati che, a seconda dello stato in cui si trova, risponde in maniera diversa all'input dell'utente. Quando viene istanzia l'oggetto _CoffeeMachine_ questo viene inizializzato allo stato _NoCoinState_. In questo stato, le operazioni di _insertCoin()_, _pressButton()_ e _dispense()_ assumono un certo tipo di comportamento. Se pensiamo di essere davanti ad una macchina del caffè, possiamo pensare quali sono gli output attesi. Se premiamo un tasto quando non abbiamo ancora inserito nessuna moneta, ci verrà chiesto di inserire una moneta per fare in modo che il prodotto scelto venga erogato. Una volta inserita la moneta avremo la possibilità di scegliere il prodotto e farlo erogare. 
Ogni _ConcreteState_ ha implementato le funzioni dell'interfaccia _State_ in base appunto allo stato:
- se ci troviamo nello stato _NoCoinState_ possiamo solo inserire la moneta perchè non abbiamo la possibilità di ordinare e di conseguenza erogare nessun prodotto;
- inserita la moneta, passiamo allo stato _CoinInsertedState_ dalla quale possiamo solo ordinare un prodotto e quindi non possiamo erogarlo finché non scegliamo il prodotto;
- scelto il prodotto non ci resterà che erogarlo e godercelo! Finita l'erogazione passeremo allo stato _NoCoinState_