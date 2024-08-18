# Adapter

Adapter è un design pattern strutturale che permette a classi con interfacce diverse di poter comunque comunicare tra di loro. L'adapter fungerà da traduttore che convertirà l'interfaccia di una classse in un'altra interfaccia attesa dal cliente.

## Componenti
1. **Client**: l'entità che richiede un'operazione attraverso una certa *interfaccia.
2. **Target**: l'interfaccia che il client si aspetta
3. **Adaptee**: La classe esistente che ha un'interfaccia incompatibile con quella che il Client si aspetta.
4. **Adapter**: la classse che implementa l'interfaccia Target e traduce le chiamate del Client all'Adaptee, facendo in modo che queste due parti possano lavorare insieme.

*Intediamo "interfaccia" come il punto di contatto tra chi richiede l'operazione e l'operazione stessa

## Flusso di esecuzione

Supponiamo che un sistema di pagamento deve intergrare una nuova libreria di pagamento di terze parti. Abbiamo il problema che la nuova libreria utilizza un'interfaccia diversa rispetto a quella che il sistema esistente si aspetta, avendo quindi incompatibilità tra le intefacce.

Il sistem esistente ha sempre chiamato l'interfaccia Target _PaymentProcessor_ per elaborare un pagamento tramite il metodo _processPayment (double amount)_. Vien da sè che il Client utilizzerà l'interfaccia _PaymentProcessor_ per eseguire i pagamenti.

Il team di sviluppo del sistema decide di integrare una nuova libreria di pagamento di terze parti, che però utilizza una classe _ThirdPartyPayment_ con un metodo diverso chiamato _makePayment(double amount)_ per effettuare i pagamenti. Qui arriva l'incompatibilità tra le interfacce di cui sopra: la classe _ThirdPartyPayment_ non implementa l'interfaccia _PaymentProcessor_, quindo non può essere usata direttamente dal sistema esistente, dato che si aspetta una _PaymentProcessor_.

Il problema è presto risolto con l'utilizzo di una classe Adapter chiamata _PaymentAdapter_ che implementa l'interfaccia _PaymentProcessor_. Questa classe ha al suo interno un'istanza di _ThirdPartyPayment_ e nel metodo _processPayment (double amount)_, chiama il metodo _makePayment (double amount)_ dell'oggetto _thirdPartyPayment_.

Ora il client può usare il nuovo metodo di pagamento di terze parte come faceva prima senza bisogno di sapere nulla della modifica apportata dal team al sistema.