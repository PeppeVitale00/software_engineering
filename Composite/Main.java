public class Main {
    public static void main(String[] args) {
        // Creazione di prodotti singoli
        Product book = new Product("Book", 29.99);
        Product phone = new Product("Phone", 699.99);
        Product charger = new Product("Charger", 19.99);

        // Creazione di un pacchetto di prodotti
        ProductBundle techBundle = new ProductBundle("Tech Bundle");
        techBundle.addItem(phone);
        techBundle.addItem(charger);

        // Creazione del carrello
        ProductBundle cart = new ProductBundle("Shopping Cart");
        cart.addItem(book);
        cart.addItem(techBundle);

        // Visualizzazione dei dettagli del carrello
        cart.showDetails();
        System.out.println("Total Price: " + cart.getPrice());
    }
}

