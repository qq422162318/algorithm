package java设计模式.桥接模式;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo opening");
    }
    @Override
    public void close() {
        System.out.println("Vivo close");
    }
    @Override
    public void call() {
        System.out.println("Vivo calling");
    }
}
