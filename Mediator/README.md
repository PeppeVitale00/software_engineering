# Mediator

Il design patgtern Mediator è uno dei design pattern comportamentali il cui scopo è quello di riuddre le dipendenze diretta tra oggetti.
In un sistema senza Mediator, gli oggetti interagiscono direttamente tra di loro, situazione che può portare ad una situazione di _tight coupling_, ossia una situazione in cui una classe è fortemente legata alle altre percgè dipende direttamente dalle loro implementazioni, metodi o stati interni. 
Utilizzando invece il pattern Mediator introduciamo un oggetto mediatore che gestisce tutta la comunicazione tra gli oggetti coinvolti. Gli oggetto non comunicano più direttamente tra di loro, ma lo fanno appunto attraverso il mediatore che conosce tutti gli oggetti e le loro interazioni. Questo riduce le dipendenze dirette e centralizza la logica di interazione.

## Componenti
- **Mediator**: l'interfaccia che i mediatori concreti devono implementrare. Dichiare il metodo per la comunicazione tra i colleghi

- **ConcreteMediator**: implementa l'interfaccia _Mediator_ e coordina le comunicazione tra gli oggetti collegati. Contiene inoltre i riferimenti agli oggetti colleghi e implementa la lofica per le loro interazioni

- **Colleague**: sono i colleghi, cioè gli oggetti che comunicano tramite il mediatore, senza però conoscere gli altri colleghi. È un'interfaccia.

- **ConcreteCollegue**: implementazioni specifiche dei colleghi.

## Flusso di esecuzione
Nella classe _Main_ viene creata una _ChatRoom_ che è il mediatore concreto che gestisce lo scambio di messaggi tra i _ConcreteUser_. I _ConcreteUser_ vengono aggiunti alla _ChatRoom_ tramite il metodo _addUser_ che li memorizza in una lista interna.
Quando un utente deve inviare un messaggio alla chat, utilizza il metodo _send_ che a sua volta richiama il metodo _sendMessage_ del _Mediator_. Il _Mediator_ ricevuto il messaggio, lo inoltra a tutti gli utente registrati, eccetto il mittente. 
Ciò che succede fondamentalmente è questo:

_ConcreteUser.send → ChatMediator.sendMessage_

_ChatRoom.sendMessage → ConcreteUser.receive_



