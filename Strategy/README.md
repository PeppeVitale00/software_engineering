# Strategy
Il design pattern Strategy è un modello comportamentale che permette di definire una famiglia di algoritmi, incapsularli e renderli intercambiabili. Il pattern separa l’algoritmo dal contesto in cui viene utilizzato, consentendo di cambiare il comportamento di un oggetto in fase di esecuzione senza modificare il suo codice.
## Componenti
- **Strategy**: È l’interfaccia comune che definisce il metodo che tutte le strategie concrete dovranno implementare. Questo metodo rappresenta l’algoritmo che sarà intercambiabile.
- **Concrete Strategy**: Sono le implementazioni specifiche dell’interfaccia Strategy, ognuna con una diversa logica. Ciascuna classe concreta rappresenta una variante dell’algoritmo.
- **Context**: È la classe che utilizza il pattern Strategy. Il Context ha un riferimento alla strategia corrente e delega l’esecuzione dell’algoritmo a essa. Può cambiare strategia in fase di esecuzione.
## Flusso di esecuzione
Nel main, iniziamo creando un’istanza della classe _Pizzeria_, che è il nostro contesto. All'inizio, l’oggetto _Pizzeria_ non ha ancora una strategia di consegna impostata.
Successivamente, vogliamo consegnare una pizza in Viale XX Settembre in Scooter. Per farlo, impostiamo la strategia di consegna su _BikeDelivery_, che è una _Concrete Strategy_. Questo assegna una nuova istanza di _BikeDelivery_ alla variabile _deliveryStrategy_ all'interno della classe Pizzeria. Ora, ogni volta che Pizzeria eseguirà una consegna, utilizzerà la strategia _BikeDelivery_.
A questo punto, chiamiamo il meotodo deliverPizza per consegnare la pizza. 
Supponendo di voler consenare la prossima pizza con uno scooter o con una macchina, ci basterà chiamare il metodo _setStrategy_ e assegnare una nuova istanza alla variabile _deliveryStrategy_. 