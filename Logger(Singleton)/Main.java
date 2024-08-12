
public class Main {

    public static void main(String[] args) {
        Logger l1=Logger.getIstance();
        Logger l2=Logger.getIstance();

        l1.log("Log da L1");
        l2.log("Loga da L2");

        if (l1 == l2) System.out.println("Siamo la stessa istanza");
        
    }

    



    
}
