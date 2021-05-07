package java设计模式.单例模式;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance==instance1);
    }
}
//饿汉式(静态变量)
class Singleton1{
    //1.构造器私有化,外部能new
    private Singleton1(){

    }
    private final static Singleton1 instance=new Singleton1();
    public static Singleton1 getInstance(){
        return instance;
    }
}
//简单在类装载时就完成实例化,避免同步问题,可能会造成内存浪费
