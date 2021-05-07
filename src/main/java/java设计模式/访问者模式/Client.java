package java设计模式.访问者模式;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Women());

        objectStructure.display(new Fail());
    }
}
