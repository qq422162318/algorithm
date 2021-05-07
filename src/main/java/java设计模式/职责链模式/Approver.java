package java设计模式.职责链模式;

public abstract class Approver {
    Approver approver;
    String name;

    Approver(String name){
        this.name=name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
