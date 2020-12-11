package java多线程.咕泡.today1;

import java.util.concurrent.TimeUnit;

public class ThreadStatusDemo {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "timewaiting").start();
        new Thread(() -> {
            while (true) {
                synchronized (ThreadStatusDemo.class) {
                    try {
                        ThreadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "timewaiting2");
        new Thread(new BlockDemo(),"block1").start();
        new Thread(new BlockDemo(),"block2").start();
    }
    static class BlockDemo extends Thread{

        @Override
        public void run() {
           synchronized (BlockDemo.class){
               try {
                   TimeUnit.SECONDS.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
