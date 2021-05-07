package java多线程.c_005;

public class T implements Runnable{
    private /*volatile*/ int count=100;
    @Override
    public synchronized void run() {
      count--;
        System.out.println(Thread.currentThread().getName()+"count"+count);
    }

    public static void main(String[] args) {
        T t = new T();
        for (int i = 0; i <100 ; i++) {
            new Thread(t,"THREAD"+i).start();
        }
    }
}
