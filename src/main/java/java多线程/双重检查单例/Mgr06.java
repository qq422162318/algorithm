package java多线程.双重检查单例;

public class Mgr06 {
private static volatile Mgr06 INSTANCE;
//private static  Mgr06 INSTANCE;
    private Mgr06(){

    }
    public static Mgr06 getInstance(){
        if (INSTANCE==null){
            synchronized (Mgr06.class){
                if (INSTANCE==null){
                    INSTANCE= new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Mgr06 mgr06 = new Mgr06();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(mgr06.hashCode());
                System.out.println(mgr06.toString());
            }
        });
        System.out.println(mgr06.toString());
        thread.start();
    }
}
