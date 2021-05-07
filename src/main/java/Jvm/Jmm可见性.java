package Jvm;

public class Jmm可见性 {

    volatile static boolean run=true;
    //volatile
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            while (run){
                //System.out.println(run); print里面有同步锁
            }
        });
        t.start();
        Thread.sleep(1000);
        run=false;
    }
}
