package java多线程.c011;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class T {
    int count=0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName()+"start");
        while(true){
            count++;
            System.out.println(Thread.currentThread().getName()+"count="+count);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count==5){//出现异常会默认自动释放锁对象
                int i=1/0;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        T t = new T();
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                t.m();
            }
        };
        new Thread(runnable,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(runnable,"t2").start();
    }
}
