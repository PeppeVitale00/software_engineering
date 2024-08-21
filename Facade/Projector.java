public class Projector {
    private boolean on;
    
    public Projector(){}

    public void on(){
        this.on=true;
        System.out.println("Proiettore acceso");
    }

    public void off(){
        this.on=false;
        System.out.println("Proiettore spento");
    }


}
