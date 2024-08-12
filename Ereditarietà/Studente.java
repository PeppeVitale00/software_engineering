public class Studente extends Persona{

    private String matricola;

    public Studente (String nome, String cognome,String matricola){
        super(nome,cognome); //richiama il costruttore della super classe
        this.matricola=matricola;
    }


    public void setMatricola(String matricola){
        this.matricola=matricola;
    }

    public String getMatricola(){
        return matricola;
    }

    
    
}
