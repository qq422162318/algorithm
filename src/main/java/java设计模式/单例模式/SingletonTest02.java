package java设计模式.单例模式;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance==instance1);
    }
}
//饿汉式(静态代码块)
class Singleton2{
    //1.构造器私有化,外部能new
    private Singleton2(){

    }
    private static Singleton2 instance;
    static {
        instance=new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
//简单在类装载时就完成实例化,避免同步问题,可能会造成内存浪费
