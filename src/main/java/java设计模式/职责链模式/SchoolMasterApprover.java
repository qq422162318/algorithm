package java设计模式.职责链模式;

public class SchoolMasterApprover extends Approver {
    SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        } else {
            throw new RuntimeException("环状-异常");
        }
    }

}