package Jvm;

public class synchronized1 {
    public static void main(String[] args) {
        Object lock=new Object();
        synchronized (lock){
            System.out.println("ok");
        }
    }
}
