# Obeserver
Observer è un design pattern di tipo comportamentela che definisce una relazione di dipendenza 1-a-molti tra oggetti, in modo tale che quando un oggetto cambia il suo stato, tutti gli oggetti dipendeti da esso vengono automaticamente notificati e aggiornati. Si basa sul comportamento di "Publish-Subscribe":
- **Publisher (Subject)**: è l'oggeto che ha un certo stato e che viene osservato dagli osservatori, o subscriber, e fornisce i metodi per aggiungere, rimuovere e notificare gli osservatori;
- **Subscriber (Obeserver)**: l'interfaccia che devono implementare tutti i subscriber e include un metoto per aggiornare l'osservatore quando il soggetto cambia stato.
- **ConcretePublisher**:  una classe concreta che implementa il Publisher. Memorizza lo stato e notifica gli osservatori quando c'è un cambiamento.
- **ConcreteSubscriber**: una classe concreta che implementa l'interfaccia Subscriber. Questo oggetto viene aggiornato con il nuovo stato del soggetto.

# Flusso di esecuzione
Immaginiamo il funzionamento di Netflix. Gli utenti (subscriber) si registrano alla piattaforma specificando quelli che sono i propri interessi nel genere dei film e delle serie tv. Netflix (Publisher) invece si occuperà di notificare tutti gli utenti iscritti quando verrà caricato un nuovo contenuto.
Le classi _NetflixConcrete_ implementa i metodi per aggiungere, rimovere e notificare i _ConcreteUser_ registrati. Implementa inoltre il metodo _addNewContent(title,genre)_ che oltre ad aggiungere i titoli nel proprio catalogo, si occupa di notificare agli utenti.
I _ConcreteUser_ sarranno notificati con un messaggio diverso se viene aggiunto un titolo di un genere a cui sono interessati.