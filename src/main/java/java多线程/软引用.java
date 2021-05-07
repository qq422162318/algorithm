package java多线程;

import java.lang.ref.SoftReference;

public class 软引用 {
    public static void main(String[] args) throws InterruptedException {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024 * 10 * 10]);
        System.out.println(softReference.get());
        Thread.sleep(2000);
        System.gc();
        System.out.println(softReference.get());
        byte[] b=new byte[1024*10*15];
        System.out.println(softReference.get());
    }
}
