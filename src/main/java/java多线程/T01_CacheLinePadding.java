package java多线程;

public class T01_CacheLinePadding {
    private static class T{
        public volatile long x=0L;
    }
    public static T[] arr=new T[2];
    static{
        arr[0]=new T();
        arr[1]=new T();
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() ->{
            for (long i = 0; i <1000_0000L ; i++) {
                arr[0].x=i;
            }
        });
        Thread thread1 = new Thread(()->{
            for (long i = 0; i <1000_0000L ; i++) {
                arr[1].x=i;
            }
        });
        final long start=System.nanoTime();
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println((System.nanoTime()-start)/100_0000);
    }

}
