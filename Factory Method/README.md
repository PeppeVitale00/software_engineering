# Factory Method

Il Factory Method è un design pattern creazionale che permette alla classi di rimandare l'istanzazione alle sottoclassi. Questo pattern è utile quando una classe non sa esattamente quale tipo di oggetto creare. 

## Componenti
* **Product**: definisce l'interfaccia che tutti gli oggetti creati dal _factoryMethod()_. Nel nostro caso, il product è l'interfaccia è "Posto".
* **ConcreteProduct**: sono le implementazione concrete dell'interfaccia 'Posto'. Sono i "prodotti concreti" che il _factoryMethod()_ istazierà. Nel nostro caso sono "Palco" e "Platea". All'interno di essi, troviamo le implementazioni dei metodi dell'interfaccia, che forniscono specifiche implementazione relative alla posizione, costo e settore.
* **Creator**: è una classe che definisce, ma non implementa, il factoryMethod(). Nel nostro caso, il factoryMethod() è _Posto getPosto(int)_;
* **Concrete Creator**: è una sottoclasse del creator che implementa il factoryMethod(). Su questa classe, cade la resposabilità di decidere quale tipo di concrete product istanziare. Nel nostro caso, abbiamo l'implementazione del metodo  _Posto getPosto(int)_ per creare e restituire un oggetto di tipo _Palco_ o _Platea_ in base al valore del parametro.
* **Client**: è il cliente che utilizzerà successivamente le istanze dei concrete produtct. Nel nostro caso, possiamo individuare due client: _Biglietto_ che contiene le info riguardanti un _Posto_ che puo essere _Platea_ o _Palco_. L'altro cliente è _MainBiglietti_ che rappresenta il punto di ingresso dell'applicazione.

## Flusso di esecuzione
Il client _MainBiglietti_ richiede un _Posto_ al creator _GnrPosizioni_ tramite il metodo _prendiNumero(int x)_. _GnrPosizioni_ delega l'istanziazione al metodo factory _getPosto(int tipo)_ della sottoclasse concreta _Posizioni_ che decide, in base al valore di tipo, de creare un _Palco_ o una _Platea_. Una volta creato, l'oggetto _Posto_ viene utilizzato dal _Biglietto_.