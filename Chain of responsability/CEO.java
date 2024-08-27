// Concrete Handler
public class CEO implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= 10000) {
            System.out.println("CEO: Ho approvato la richiesta di " + amount + "€.");
        } else {
            System.out.println("CEO: La richiesta di " + amount + "€ è stata rifiutata.");
        }
    }
}