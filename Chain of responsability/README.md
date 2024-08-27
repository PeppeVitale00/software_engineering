# Chain of responsability
Chain of responsability è un design pattern comportamentale che consente di gestire una richiesta attraverso una catena di oggetti, ognuno dei quali ha la possobilità di trattare la richiesta o passarla al successivo elemento della catena. È utile per situazioni in cui diverse classi potrebbero gestire una richiesta, e non si vuole accoppiare il codice del client con una specifica implementazione.

## Componenti
- **Handler**: è un'interfaccia o una classe astratta che deinisce un metodo per gestire la richiesta e per impostare il successivo gestore nella catena.
- **Concrete Handler**: sono le classi concrete che implementano l'interfaccia o la classe astratta Handler. Ogni ConcreteHandler può gestire la richiesta (se è in grado di farlo) o passarla al successivo gestore nella catena.Questo è possibile perchè ogni gestore concreto è collegato al successivo creando una catena e il client invia la richiesta al primo gestore della catena.

## Flusso di esecuzione
Nel _Main_ configuriamo intanto la catena di gestori: viene creato un oggetto _Manager_ che viene  collegato a un oggetto _Director_, collegato a sua volta a un oggetto _CEO_. Scrivendo in questo modo, il _Manager_ sarà il primo elemento della catena, _Director_ il secondo e _CEO_ il terzo.
Il client invia una richiesta di approvazione al primo gestore della catena, ovvero il _Manager_. Questo verifica se l'importo della richiesta rientra nei suoi limiti di approvazione: se la richiesta non supera la soglia allora viene approvata, altrimenti viene passata al prossimo elemento della catena, e così via fino alla fine