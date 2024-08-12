# Classi Abstract

Le classi astratte in Java permetteo di implementare un modello parziale, in cui alcuni
dettagli sono già stati definit, ma altri sono lasciati aperti per essere completati
un secondo momento.
In questo caso abbiamo creato una classe astratta Persona che contiene tutte quelle che sono 
le caratteristiche generali di una persona (nome,cognome,eta, sesso e mestiere). Quando una sottoclasse
estenderà la superclasse persona, dovrà implementare i metodi che sono definiti come "abstract" nella 
superclasse. In questo modo, il metodo descriviMestiere(), in base alla classe che estende Persona (Insegnante nel nostro caso),
implementarà il metodo in modo coerente con ciò che la sottoclasse rappresenta.
