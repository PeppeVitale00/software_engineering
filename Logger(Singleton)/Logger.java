
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger log;
    private String file= "log.txt"; //File di log

    private Logger(){

    }

    public static Logger getIstance(){
        if (log==null) log = new Logger();

        return log;   
    }
    
    public void log(String message) {
        try {
            FileWriter fw= new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw);
            
            String time = new SimpleDateFormat("dd-MM-yyyy:mm:ss").format(new Date());
            pw.println(time + " -> " + message);
           
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        

    }

}
