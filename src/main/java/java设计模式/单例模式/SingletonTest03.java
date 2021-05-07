package java设计模式.单例模式;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println(Singleton3.getInstance()==Singleton3.getInstance());

    }
}
//懒汉式(线程不安全)
class Singleton3{
    private static Singleton3 instance;
    private Singleton3(){}

//    public static synchronized Singleton3 getInstance(){//线程安全方法
    public static synchronized Singleton3 getInstance(){
        if (instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
//不加synchronized线程不安全加synchronized效率低
