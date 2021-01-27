package java设计模式.外观模式;

public class Popcorn {
    private static Popcorn Instance=new Popcorn();
    public static Popcorn getInstance(){
        return Instance;
    }
    public void on(){
        System.out.println("Popcorn on");
    }
    public void off(){
        System.out.println("Popcorn off");
    }
    public void pop(){
        System.out.println("Popcorn pop");
    }
    public void pause(){
        System.out.println("Popcorn pause");
    }
}
