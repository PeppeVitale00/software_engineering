public class Main {

    public static void main(String[] args) {
        Persona p1 = new Insegnante("Pippo", "Vitale", "uomo", 24,  "universitario", 50);
        Insegnante i1 = new Insegnante("Francesco", "Pira", "uomo", 45, "scuola superiore",5);
        

        
        
               
        System.out.println(p1.descriviMestiere());
        
        System.out.println(i1.getNomeCompleto()+i1.getAnniservizio());
    
        
    }

    
}
/*
 * Le classi astratte in Java permetteo di implementare un modello parziale, in cui alcuni
 * dettagli sono già stati definit, ma altri sono lasciati aperti per essere completati
 * in un secondo momento.
 * In questo caso abbiamo creato una classe astratta Persona che contiene tutte quelle che sono 
 * le caratteristiche generali di una persona (nome,cognome,eta, sesso e mestiere). Quando una sottoclasse
 * estenderà la superclasse persona, dovrà implementare i metodi che sono definiti come "abstract" nella 
 * superclasse. In questo modo, il metodo descriviMestiere(), in base alla classe che estende Persona (Insegnante nel nostro caso),
 * implementarà il metodo in modo coerente con ciò che la sottoclasse rappresenta.
 * 
 * 
 * 
 * 
 */