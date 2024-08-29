# Command
Il design pattern Command è un pattern comportamentale che permette di incapsulare una richiesta come un oggetto, separando l'oggetto che emette la richiesta dall'oggetto che la esegue. Questo permette di parametrizzare gli oggetti con operazioni, ritardare l'esecuzione di un'operazione, o supportare operazioni annullabili.

## Componenti

- **Coomand**:è un'interfaccia che dichiara il metodo execute(). Ogni comando concreto implementerà questa interfaccia.
- **Concrete Command**: è la classe che implementa l'interfaccia Command. Al suo interno, contiene una referenza al ricevitore (Receiver) e implementa il metodo execute() chiamando i metodi appropriati del ricevitore

- **Receiver**: è la classe che effettua l'azione reale. Questa classe contiene la logica di business associata all'operazione che il comando deve eseguire
- **Invoker**: è la classe che chiede al comando di eseguire l'operazione. L'invoker mantiene un riferimento al comando e può chiamare il metodo execute() del comando in un momento opportuno