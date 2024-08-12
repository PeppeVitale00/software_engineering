import java.io.IOException;

public class MainPagamenti {
    public static void main(String[] args) {
        Pagamenti p = new Pagamenti();
        try {
            p.leggifile("./", "importi.txt");
            
        } catch (IOException e) {}
        
        p.calcolaMassimo();
        p.calcolaTotale();

        p.printAll();
        System.out.println("Totale: "+p.getTotale());
        System.out.println("Massimo: "+p.getMassimo());


    }

    
}
