package java多线程.面试题;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class T03_NotifyHoldingLock { //wait notify

    //添加volatile，使t2能够得到通知
    volatile List lists = new ArrayList();

    public void add(Object o) {
        lists.add(o);
    }

    public int size() {
        return lists.size();
    }

    public static void main(String[] args) {
        T03_NotifyHoldingLock c = new T03_NotifyHoldingLock();

        final Object lock = new Object();

        new Thread(() -> {
            synchronized(lock) {
                System.out.println("t2启动");
                if(c.size() != 5) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("t2 结束");
                lock.notify();//结束后唤醒t1线程不然t1一直处于wait状态
            }

        }, "t2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        new Thread(() -> {
            System.out.println("t1启动");
            synchronized(lock) {
                for(int i=0; i<10; i++) {
                    c.add(new Object());
                    System.out.println("add " + i);

                    if(c.size() == 5) {
                        lock.notify();//唤醒t2锁
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "t1").start();


    }
}

