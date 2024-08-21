public class DvdPlayer {
    private boolean on;

    public DvdPlayer(){}

    public void on(){
        this.on=true;
        System.out.println("Lettore DVD acceso");
    }

    public void off(){
        this.on=false;
        System.out.println("Lettore DVD spento");
    }

    public void stop(){
        System.out.println("Film fermato");
    }

    public void play(String film){
        System.out.println("Film in riproduzione: "+film);
    }




}
