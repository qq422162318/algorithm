package java多线程.c_20;

import java.util.concurrent.TimeUnit;
//synchronized是可重入锁
public class T01_ReentrantLock1 {
    synchronized void m1(){
        for (int i = 0; i <10 ; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            if (i==2)m2();
        }
    }
    synchronized void m2(){
        System.out.println("m2...");
    }

    public static void main(String[] args) {
        T01_ReentrantLock1 t01_reentrantLock1 = new T01_ReentrantLock1();
        new Thread(t01_reentrantLock1::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(t01_reentrantLock1::m2).start();
    }
}
