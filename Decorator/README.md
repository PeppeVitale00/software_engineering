# Decorator

Decorator è un design pattern di tipo strutturale che consente di aggiungere dinamicamente funzionalità o comportamenti a un oggetto esistente, senza alterarne la struttura originale. Consente di avvolgere un oggetto di base con uno o più oggetti "decoratori". Ogni decoratore può aggiungere o modificare il comportamento dell'oggetto decorato, mantenendo la stessa interfaccia.

## Componenti
- **Component**: è l'interfaccia che definisce le operazione che possono essre eseguite sugli oggetti
- **Concrete Component**: è una classe concreta che implementa l'interfaccia _Component_. Questo è l'oggetto di bas a cui vogliamo aggiungere nuove funzionalità.
- **Decorator**: è una classe astratta che implementa l'interfaccia _Component_ e ha un riferimento sempre ad un oggetto _Component_. QUesta classe funge da base per tutti i _Concrete Decorator_

- **Concrete Decorator**: estende la classe Decorator e aggiunge nuove funzionalità o comportamenti all'oggetto decorato.

## Flusso di esecuzione
Nel _Main_ intanto creaiamo un nuovo _Beverage_ contentente un'istanza di _Espresso_. Successivamente, con _beverage = new Milk(beverage)_ decoriamo l'oggetto _Espresso_ con l'oggetto _Milk_. Il costruttore della classe _Milk_ prende un oggetto _Beverage_ come argomento, ottenendo di conseguenza un Espresso con latte. 

Quando chiamiamo _beverage.getDescription()_, il metodo _getDescription()_ di _Milk_ viene eseguito. Questo metodo a sua volta chiama _getDescription()_ dell'oggetto _beverage_ che sta decorando (cioè Espresso), aggiungendo la stringa ", Milk".
Lo stesso vale per la decorazione successiva con _Sugar_, dove decoriamo l'espresso con latte aggiungendo dello zucchero.
