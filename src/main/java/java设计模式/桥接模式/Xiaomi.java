package java设计模式.桥接模式;

public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("xiaomi opening");
    }
    @Override
    public void close() {
        System.out.println("xiaomi close");
    }
    @Override
    public void call() {
        System.out.println("xiaomi calling");
    }
}
