# Abstract Factory
Abstract Factory è un pattern creazionale e viene utilizzato per creare famiglie di oggetti correlati senza specificare le loro classi concrete. 
## Componenti
- **Abstract Factory**: Un'interfaccia o una classe astratta che dichiara i metodi per creare gli oggetti correlati.
- **Concrete Factory**: Implementazioni concrete della Abstract Factory che creano oggetti specifici.
- **Abstract Product**: Interfaccia o classe astratta per un tipo di prodotto.
- **Concrete Product**: Implementazioni concrete degli Abstract Product
## Flusso di esecuzione
Immaginiamo che un architetto progetta stanze di hotel in stele moderno o vintage. Ha ovviamente bisongo di mobili (prodotti) per arredare ogni stanza: un letto, una sedia e una lampada. Ogni stile ha i propri mobili coordinati, quindi un letto moderno andrebbe bene in una stanza moderna, ma sarebbe fuori posto in una stanza vintage.
Ora, anziché scegliere ogni mobile singolarmente, decidi di delegare la creazione degli arredi a due "fabbriche di arredamento": una fabbrica per lo stile moderno e una per lo stile vintage. Ogni fabbrica sa esattamente quali mobili coordinati creare in base allo stile.

- **Abstract Factory**: È come la tua "guida" su come richiedere i mobili. Dice semplicemente che, in generale, una fabbrica di arredi deve sapere come creare un letto, una sedia e una lampada, ma non specifica in che stile.

- **Concrete Factory**: Qui entrano in gioco le fabbriche reali, specifiche per ciascuno stile, ad esempio una Fabbrica Moderna e una Fabbrica Vintage. Ciascuna di queste concrete factory sa esattamente come creare un letto, una sedia e una lampada, ma seguendo il proprio stile.

- **Abstract Product**: È come dire "letto", "sedia" e "lampada" senza entrare nei dettagli sullo stile. Interessa solo il tipo di mobile, non come appare o come è fatto.

- **Concrete Product**: Questo è il mobile concreto in uno stile specifico, come il "letto moderno" o la "lampada vintage". Sono le implementazioni specifiche del tipo di mobile.

- **Client**: è l'architetto! Usa una delle fabbriche concrete per arredare la stanza, chiedendo un set coordinato di mobili senza preoccuparsi dei dettagli su come vengono effettivamente prodotti. La fabbrica selezionata (ad esempio, quella moderna o quella vintage) si occupa di fornire i mobili che si abbinano perfettamente.