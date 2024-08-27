// Concrete Handler
public class Director implements Approver {
    private Approver nextApprover;
    private final int APPROVAL_LIMIT = 5000;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Director: Ho approvato la richiesta di " + amount + "€.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}