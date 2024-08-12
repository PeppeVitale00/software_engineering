import java.util.ArrayList;
import java.util.List;

public class Logs{

    private static Logs obj;
    private List<String> l;

    private Logs() {
        empty();
    }

    public static Logs getIstance(){
        if(obj==null) obj = new Logs();
        return obj;
    }

    public void record(String s){
        l.add(s);
    }

    public String dumpLast(){
        int i= l.size();
        return l.get(i-1);
    }

    public String dumpAll(){
        String acc="";
        for (String s:l)
            acc = acc.concat(s);
        return acc;
    }

    public void empty(){
        l=new ArrayList<String>();
    }




}