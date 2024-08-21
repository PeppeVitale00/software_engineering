public class SurroundSystem {
    
    public SurroundSystem(){    }
    
    public void on(){
        System.out.println("Sistema audio acceso");
    }

    public void off(){
        System.out.println("Sistema audio spento");
    }

    public void setVolume(int level){
        System.out.println("Volume impostato a "+level);
    }

}
