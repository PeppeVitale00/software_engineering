public class Posizioni extends GnrPosizioni {

    
    @Override    
    public Posto getPosto(int tipo){
        if(tipo==1) {
            System.out.println("Ho creato un Palco");
            return new Palco();
        }
        System.out.println("Ho creato un tipo Platea");
        return new Platea();
    }
}
