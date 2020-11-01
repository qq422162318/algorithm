package java多线程;

import org.omg.PortableServer.THREAD_POLICY_ID;

//import org.openjdk.jol.info.ClassLayout;
//
public class T01 {
//    public static void main(String[] args) {
//        Object o = new Object();
//        System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        synchronized (o){
//            System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        }
//    }
static class thread1 implements Runnable{

    @Override
    public void run() {
        String[] str={"A","B","C","D","E","F","G"};
        for (int i = 0; i <str.length ; i++) {
            System.out.print(str[i]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
static class thread2 implements Runnable{

    @Override
    public void run() {
        String string="1234567";
        for (int i = 0; i <string.length() ; i++) {
            System.out.print(string.charAt(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    public static void main(String[] args) {
         new Thread(new thread1()).start();
         new Thread(new thread2()).start();
      }

}
