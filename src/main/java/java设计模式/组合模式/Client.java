package java设计模式.组合模式;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学","中国顶级大学");
        OrganizationComponent compuerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息学院", "信息学院");

        compuerCollege.add(new Department("软件工程","软件工程"));
        compuerCollege.add(new Department("网络工程","网络工程"));
        compuerCollege.add(new Department("计算机科学与技术","网络工程"));

        infoEngineerCollege.add(new Department("通信工程","通信工程"));
        infoEngineerCollege.add(new Department("信息工程","信息工程"));

        university.add(compuerCollege);
        university.add(infoEngineerCollege);

//        university.print();
        compuerCollege.print();
    }
}
