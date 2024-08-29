# Prototype

Il design pattern Prototype è un pattern creazionale per creare nuovi oggetti tramite la clonazione di un prototipo esistente, anziché crearli ex novo. È utile quando la creazione diretta di un oggetto è costosa (in termini di tempo o risorse) oppure quando si vuole evitare la complessità di una nuova istanza da zero, mantenendo però la possibilità di creare copie personalizzate di un oggetto.

## Componenti

- **Prototype**: un'interfaccia che definisce il metodo per clonare se stessa, comunemente chiamato _clone()_
- **Concrete Prototype**: Una classe concreta che implementa l'interfaccia del prototipo e fornisce l'implementazione del metodo clone(). Questa classe rappresenta l'oggetto che sarà clonato.