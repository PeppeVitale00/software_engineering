package Observer;

public class Main {
    public static void main(String[] args) {
        NetflixConcrete netflix = new NetflixConcrete();

        User user1 = new ConcreteUser("Alice", "Fantasy");
        User user2 = new ConcreteUser("Bob", "Azione");
        User user3 = new ConcreteUser("Charlie", "Dramma");

        netflix.registerUser(user1);
        netflix.registerUser(user2);
        netflix.registerUser(user3);

        netflix.addNewContent("Il Signore degli Anelli", "Fantasy");
        // Output:
        // Ciao Alice! Una nuova uscita che potrebbe interessarti: Il Signore degli Anelli (Fantasy)
        // Ciao Bob, nuovo contenuto disponibile: Il Signore degli Anelli (Fantasy)
        // Ciao Charlie, nuovo contenuto disponibile: Il Signore degli Anelli (Fantasy)

        netflix.addNewContent("Mad Max: Fury Road", "Azione");
        // Output:
        // Ciao Alice, nuovo contenuto disponibile: Mad Max: Fury Road (Azione)
        // Ciao Bob! Una nuova uscita che potrebbe interessarti: Mad Max: Fury Road (Azione)
        // Ciao Charlie, nuovo contenuto disponibile: Mad Max: Fury Road (Azione)
    }
    
}
