package java设计模式.单例模式;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance==instance1);
    }
}
//使用枚举可以实现单例
/**
 *1)这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 * 2)这种方式是Effective Java作者Josh Bloch提倡的方式3)结论:推荐使用
 */
enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
