package java多线程;

public class M {

    @Override
    protected void finalize() throws Throwable{
        System.out.println("线程回收了");
    }
}
