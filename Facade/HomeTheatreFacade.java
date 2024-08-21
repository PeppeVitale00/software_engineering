public class HomeTheatreFacade {

    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private SurroundSystem surroundSystem;
    
    public HomeTheatreFacade(DvdPlayer dvdPlayer, Projector projector, Screen screen, SurroundSystem surroundSystem ){
        this.dvdPlayer=dvdPlayer;
        this.projector=projector;
        this.screen=screen;
        this.surroundSystem=surroundSystem;
    }

    public void watchMovie(String film){
        System.out.println("Preparazione dei dispositivi...");
        screen.open();
        projector.on();
        surroundSystem.on();
        surroundSystem.setVolume(10);
        dvdPlayer.on();
        dvdPlayer.play(film);
        System.out.println("Buona visione!");
    }

    public void endMovie(){
        System.out.println("Arresto dei dispositivi...");
        dvdPlayer.off();
        surroundSystem.off();
        projector.off();
        screen.close();
        System.out.println("Film terminato, alla prossima!");
    }


}
