public class prog {

    public static void main(String[] args) {
        Logs l = Logs.getIstance();

        l.record("Ciao");
        l.record("Pippo");
        System.out.println(l.dumpLast());
        System.out.println(l.dumpAll());
    

    
    }

    
}


/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
