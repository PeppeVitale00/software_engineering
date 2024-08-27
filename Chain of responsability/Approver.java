//Handler
public interface Approver {
    void setNextApprover(Approver nextApprover);
    void approveRequest(int amount);
}