package java设计模式.职责链模式;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1,31000,1);

        DepartmentApprover departmentApprover = new DepartmentApprover("庄主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("付校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(collegeApprover);

        departmentApprover.processRequest(purchaseRequest);
    }
}
