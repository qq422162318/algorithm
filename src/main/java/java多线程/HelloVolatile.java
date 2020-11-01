package java多线程;

import java.util.concurrent.TimeUnit;

public class HelloVolatile {
    volatile boolean running=true;//加volatile 保证线程对变量可见性
    void m(){
        System.out.println("m start");
        while(running){

        }
        System.out.println("m end!");
    }

    public static void main(String[] args) {
        HelloVolatile t = new HelloVolatile();
        new Thread(t::m,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running=false;
    }
}
