# Singleton
Il Singleton è un design pattern di tipo creazionale il cui obiettivo è garantire che una classe abbia una sola istanza e fornisca un punto di accesso globale a tale istanza, assicurando quindi che una particolare classe venga istanzia una sola volta durante l'esecuzione di un programma.
La singola istanza singleton è accessibile globalmente attracerso un metodo statico, getIstance(), che restitiusce l'unica istanza della classe.
Il costruttore è privato, il che impedisce la creazione di altre istanze della classe come si è soliti fare.
Questo pattern viene in nostro aiuto nei seguenti casi:
- L'accesso ad una risorsa condivisa deve essere controllata;
- Garanzia che un determinato oggetto venga istanziato una sola volta;
- Abbiamo necessità di mantenere uno stato globale coerente che deve essere accessibile, e modificalbile, da diverse parti dell'applicazione.
