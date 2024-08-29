# Bridge
Il design pattern Bridge è un pattern strutturale che si usa per separare l'astrazione dall'implementazione, permettendo così di modificarle in modo indipendente. Il pattern Bridge separa queste due dimensioni (astrazione e implementazione) in due gerarchie separate.
Come similitudine, immaginiamo di voler costruire un ponte tra due città opposte. Per costruire il ponte dobbiamo considerare due aspetti:
1. **La struttura del ponte**: è l'idea generale d come il ponte sarà costruito (es. può essere un ponte sospeso, un ponte levatio, ecc.)
2. **Il materiale del ponte**: il materiale con cui costruisci il ponte: può essere acciaio, legno, cemento, o una combinazione di questi.
Ora, Bridge separa questi due aspetti offrendo la massima flessibilità: la struttura del ponte è come l'astrazione nel pattern Bridge. È il concetto generale, l'interfaccia o la classe astratta che definisce il tipo di ponte. Il materiale del ponte è l'implementazione. È la parte concreta, il modo in cui il ponte viene effettivamente costruito.
In questo modo, possiamo cambiare la struttura del ponte senza dover cambiare il materiale con cui è costruito e, allo stesso modo, possiamo cambiare il materiale senza dover cambiare la struttura del ponte.

## Componenti
- **Abstraction**: rappresenta l'interfaccia o l'astrazione principale e contiene un riferimento a un oggetto della gerarchia di implementazione
- **Redined Abstraction**: è una classe derivata che estende l'astrazione
- **Implementor**: definisce l'interfaccia per l'implementazione che può essere implementata in diverse varianti.
- **Concrete Implementor**: fornisce una specifica implementazione dell'implementatore.

## Flusso di esecuzione
Supponiamo un sistema di gestione delle notifiche dove possiamo invare notifiche, che possono essere normali o urgenti, attraverso diversi canali di cominicaizioni. Nel _Main_ creiamo due oggetti _Notification_: _urgentEmail_ viene creato invocando il costruttore _UrgentNotification_ passando come paramentro un oggetto _EmailSender_. In questo modo, l'oggetto _urgentEmail_ è ora pronto, con _messageSender_ configurato come _EmailSender_. Il processo per la creazione di _normalSMS_ è simile a quanto descritto finora.



