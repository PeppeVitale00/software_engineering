public class Main {
    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        SurroundSystem surroundSystem = new SurroundSystem();
        HomeTheatreFacade homeTheater = new HomeTheatreFacade(dvdPlayer, projector, screen, surroundSystem);

        homeTheater.watchMovie("La grande bellezza");

        homeTheater.endMovie();
    }
}
