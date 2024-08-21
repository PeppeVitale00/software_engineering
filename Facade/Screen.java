public class Screen {

    private boolean open;

    public Screen(){}

    public void open(){
        this.open=true;
        System.out.println("Telo abbasato");
    }

    public void close(){
        this.open=false;
        System.out.println("Telo chiuso");
    }
    

}
