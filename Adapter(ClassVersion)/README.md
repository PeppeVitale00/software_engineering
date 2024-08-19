# Adapter (Class Version)
Oltre alla variante Object, descritta nella cartella https://github.com/PeppeVitale00/software_engineering/tree/main/Adapter, esiste la variante 'Class' del design pattern Adapter. Diverso nella sua implementazione, ma non nella sua funzionalità. Anche nella versione classe troviamo l'Adapter, l'Adaptee e il Target.
La differenza tra la versione classe e la versione object sta nell'utilizzo dell'ereditarietà anzichè della composizione. 
Nel caso della versione classe, l'Adapter _PaymentAdapter_ estende direttamente la classe Adaptee _ThirdPartyPayment_. In questo caso ovviamente andiamo incontro a quelli che sono i limiti di Java per quanto riguarda l'ereditarietà multipla, di fatti se dovessimo adattare non ci sarà possibile.
Vien da sè che conviene utilizzare l'adapter di classe quando l'ereditarietà è sufficiente per lo scopo e non si ha la necessità di estendere più classi.

