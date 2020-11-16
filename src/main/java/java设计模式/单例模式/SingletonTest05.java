package java设计模式.单例模式;

/**
 * static修饰的静态方法会随着类的定义而被分配和装载入内存中，
 * 编译器只为整个类创建了一个静态变量的副本，也就是只分配一个内存空间，
 * 虽然可能有多个实例，但这些实例共享该内存，特别值得注意的是，任何一个对象对静态数据成员的修改，
 * 都会影响其它对象。
 * 静态不能引用非静态这一特性，是由于静态的会随着类的定义而被分配和装载入内存中这一关键点决定的；
 * 如果静态引用了非静态的，根本无法从内存中找到非静态的代码段，势必会出错，这种做法是Java虚拟机决不允许的。
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println(Singleton5.getInstance()==Singleton5.getInstance());
    }
}
//静态内部类
/**1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 *2)静态内部类方式在singleton类被装载时并不会立即实例化，而是在需要实例化时，
 * 调用getlnstance万法，牙会装载SingletonInstance类，从而完成Singleton的实例化。
 * 3)类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 4)优点:避免了线程不安全，利用静态内部类特点实现延迟加载，效率高5)结论:推荐使用.
 */
class Singleton5{

    private Singleton5(){}
    //
    private static class SingletonInstance{
        private static  Singleton5 INSTANCE=new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
/**
 * 静态static变量/方法在类加载的过程中被初始化，在内存中只存在一份，所以可以把它当作是全局变量/方法。
 * 优点
 * 属于类级别的，不需要创建对象就可以直接使用.
 * 全局唯一，内存中唯一，静态变量可以唯一标识某些状态.
 * 在类加载时候初始化，常驻在内存中，调用快捷方便.
 * 缺点
 * 静态方法不能调用非静态的方法和变量.（非静态方法可以任意的调用静态方法/变量）
 * 不能使用this和super关键字（属于类级别，没有创建对象签不可用this/super）
 */
