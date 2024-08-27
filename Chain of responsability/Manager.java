// Concrete Handler
public class Manager implements Approver {
    private Approver nextApprover;
    private final int APPROVAL_LIMIT = 1000;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveRequest(int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Manager: Ho approvato la richiesta di " + amount + "€.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
