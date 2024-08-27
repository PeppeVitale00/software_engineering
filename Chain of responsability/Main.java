public class Main {
    public static void main(String[] args) {
        // Configurazione della catena
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // Test con varie richieste
        int[] requests = {500, 2000, 7000, 15000};

        for (int amount : requests) {
            System.out.println("Richiesta di approvazione per " + amount + "€.");
            manager.approveRequest(amount);
            System.out.println();
        }
    }
    
}
