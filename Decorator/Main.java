public class Main {
    public static void main(String[] args) {
        // Creiamo un Espresso semplice
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Aggiungiamo il latte come decoratore
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // Aggiungiamo lo zucchero come decoratore
        beverage = new Sugar(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}