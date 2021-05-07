package java设计模式.单例模式;

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println(Singleton4.getInstance()==Singleton4.getInstance());
    }
}
//doble-check
class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){}
    public static  Singleton4 getInstance(){
        if (instance==null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
