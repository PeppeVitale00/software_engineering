# Composite

Il design patterni Composite è un pattern strutturali utilizzato per trattare oggetti singoli e oggetti composti allo steesso modo.
Permette la creazione di una gerarchia di oggetti, sotto forma di albero, che possono essere di due tipi:
- **Foglie (Leaf)**: sono oggetti che rappresentano entità individuali
- **Composite**: oggetti che posssono contenere altri oggett, siano essi foglie o altri composite.

L'idea, come detto prima, è quella di trattare sia le foglie che i composite nello stesso modo.

## Componenti

- **Component**: definisce l'interfaccia comune per tutti gli oggetti della gerarchia.
- **Leaf** Implementa l'interfaccia _Component_. Rappresentano gli oggetti singoli.
- **Composite**: implementa l'interfaccia _Component_ e contiene una lista di componenti che possono essere leaf o altri composite.


## Flusso di esecuzione

Immaginiamo di avere un sistema di gestione di un carrello della spesa in cui è possibile avere prodotti singoli e pacchetti di prodotti.
I _Product_ sono i prodotti singoli (es. libro, telefono) mentre i _ProductBundle_ rappresentano invece i un seti di prodotti (es. una trilogia di libri, una promozione dove oltre al telefono abbiamo anche le cuffie). _CartItem_ è l'interfaccia che descrive il comportamento che deve avere il prodotto, sia esso un _Product_ o un _ProductBundle_.

Il codice scritto nel Main crea una struttura ad albero siffatta:
- **Shopping Cart** (ProductBundle)
  - **Book** (Product)
  - **Tech Bundle** (ProductBundle)
    - **Phone** (Product)
    - **Charger** (Product)

Quando viene effettuata una chiamata al metodo _getPrice()_, la ricorsione agirà in questo modo.


- `cart.getPrice()` (Shopping Cart)
  - **Chiama:**
    - `book.getPrice()`
      - **Book**
        - **Price:** 29.99
    - `techBundle.getPrice()`
      - **Tech Bundle**
        - **Chiama:**
          - `phone.getPrice()`
            - **Phone**
              - **Price:** 699.99
          - `charger.getPrice()`
            - **Charger**
              - **Price:** 19.99
  - **Ritorna:** 29.99 + 719.98 = 749.97


