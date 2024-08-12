public class Insegnante extends Persona {

    private int anni_servizio;
    private String tipo;

    public Insegnante(String nome, String cognome,String sesso, int eta,String tipo,int anni_servizio ){
        super(nome,cognome,sesso,eta,"Insegnante");
        this.tipo=tipo;
        this.anni_servizio=anni_servizio;
    }

    public String descriviMestiere(){
        return "Sono un insegnante "+ tipo;    
    }

    public String getAnniservizio(){
        return "Insegno da "+ anni_servizio;
    }


    
}
