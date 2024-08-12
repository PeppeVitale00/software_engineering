public class prog {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pippo", "Rampanti");
        Studente s1 = new Studente("Gian", "Claudio", "1012");

        Persona p2 = new Studente("Pino" ,"Lalavatrice","12");

        System.out.println("P1: "+ p1.getCognome()+ " " + p1.getNome());
        System.out.println("S1: "+ s1.getCognome()+ " " + s1.getNome());
        

    }
    
}
