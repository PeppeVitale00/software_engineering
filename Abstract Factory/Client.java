
public class Client {

    private Letto letto;
    private Lampada lampada;
    private Sedia sedia;

    public Client(ArredamentoFactory factory){
        letto = factory.creaLetto();
        lampada = factory.creaLampada();
        sedia = factory.creaSedia();
    }
    
    public void mostraArredamento(){
        letto.descrizione();
        sedia.descrizione();
        lampada.descrizione();
    }

    public static void main(String[] args) {
        Client clientModeno = new Client(new ArredamentoModerno());
        Client clientVintage = new Client(new ArredamentoVintage());

        System.out.println("ARREDAMENTO MODERNO");
        clientModeno.mostraArredamento();
        System.out.println();
        System.out.println("ARREDAMENTO VINTAGE");

        clientVintage.mostraArredamento();
    }


}

