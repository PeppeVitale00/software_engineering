public class Main {

    public static void main(String[] args) {
        Persona p1 = new Insegnante("Pippo", "Vitale", "uomo", 24,  "universitario", 50);
        Insegnante i1 = new Insegnante("Francesco", "Pira", "uomo", 45, "scuola superiore",5);
        

        
        
               
        System.out.println(p1.descriviMestiere());
        
        System.out.println(i1.getNomeCompleto()+i1.getAnniservizio());
    
        
    }

    
}
