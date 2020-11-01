package java多线程.c_013;

import java.util.ArrayList;

public class T {
    volatile int count=0;
    synchronized void m(){
        for (int i = 0; i <10000 ; i++) {
            count++;
        }
    }

    public static void main(String[] args) {
        T t = new T();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            threads.add(new Thread(t::m,"thread"+i));
        }
        threads.forEach((o)->o.start());
        threads.forEach((o)->{
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
}
