public class ConcreteUser implements User {
    private String name;
    private String preferredGenre;

    public ConcreteUser(String name, String preferredGenre) {
        this.name = name;
        this.preferredGenre = preferredGenre;
    }

    @Override
    public void update(String movieTitle, String genre) {
        if (this.preferredGenre.equalsIgnoreCase(genre)) {
            System.out.println("Ciao " + name + "! Una nuova uscita che potrebbe interessarti: " + movieTitle + " (" + genre + ")");
        } else {
            System.out.println("Ciao " + name + ", nuovo contenuto disponibile: " + movieTitle + " (" + genre + ")");
        }
    }
}
