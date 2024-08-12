public abstract class Persona{

    private String nome;
    private String cognome;
    private String sesso;
    private int eta;
    private String mestiere;

    public Persona(String nome, String cognome,String sesso, int eta, String mestiere){
        this.nome=nome;
        this.cognome=cognome;
        this.sesso=sesso;
        this.eta=eta;
        this.mestiere=mestiere;
    }

    abstract String descriviMestiere();

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNomeCompleto(){
        return "Mi chiamo "+nome + " " + cognome ;
    }

    public void setCongnome(String cognome){
        this.cognome=cognome;
    }

    public void setMestiere(String mestiere){
        this.mestiere=mestiere;
    }

    public String getMestiere(){
        return mestiere;
    }

    public void setEta(int eta){
        this.eta=eta;
    }

    public String getEta(){
        return "Ho "+ eta +" anni.";
    }

    public String getSesso(){
        if (this.sesso == "uomo"){
            return "Sono un uomo.";
        }
        else{
            return "Sono una donna.";
        }
    }

}

    

    




