# Facade
Il pattern Facade è un pattern di strutturale chefornisce un'interfaccia semplificata a un complesso sottosistema di classi sottostanti. Funziona come una sorta di "facciata" ( da qui il nome appunto) che permette l'utilizzo di diverse componenti di un sistema complesso con molteplici classi in maniera semplificata, mettendo a disposizione un unico punto di accesso.

I client interagiscono, e dipendono, solo con la facciata, senza dover conoscere i dettagli interni del sistema. Peraltro, oltre le classi chiamate, la facciata è l'unico componente di questo pattern.

## Flusso d'esecuzione

Tramite la classe _HomeTheaterFacade_, il client può tranquillamente avviare e terminare visione di un film senza doversi preoccupare dei dettagli di funzionamento di ciascun componente. Quando si vuole vedere un film infatti, sarà necessario solo scegliere quest'ultimo e passarlo come paratro alla funzione _watchMovie()_. Sarà poi la funziona stessa a preparare i dispositivi nella maniera corretta per fare in modo che la visione del film sia quanto più convfortevole possibile. Anche la terminazione del film, effettuata tramita le funzione _endMovie()_, si occuperà di spegnere tutti i dispositivi utilizzati grazie alla semplice invocazione.