
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.LineNumberReader;
import java.io.FileReader;


public class Pagamenti {
    private List<String> importi = new ArrayList<>();
    private float totale;
    private float massimo;


    public void leggifile(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader (new FileReader (new File(c,n)));
        String riga;
        while(true){
            riga=f.readLine();
            if(riga==null) break;
            inserisci(riga);
        }
        f.close();
    }

    public void inserisci(String riga){
        if(!importi.contains(riga)) importi.add(riga);
    }

    public void calcolaTotale(){
        totale=0;
        for(String v: importi){
            totale+=Float.parseFloat(v);
        }
    }

    public void calcolaMassimo(){
        massimo=0;
        for(String v:importi){
            if(massimo<Float.parseFloat(v)) massimo=Float.parseFloat(v);
        }
    }

    public void svuota(){
        importi=new ArrayList<>();
        totale=massimo=0;
    }

    public float getMassimo(){
       return massimo;

    }

    public float getTotale(){
        return totale;
    }

    public void printAll(){
        for(String v: importi){
            System.out.println(v);
        }
    }
    
}
