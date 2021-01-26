package java设计模式.桥接模式;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FolderPhone(new Xiaomi());
        phone.call();
    }
}
