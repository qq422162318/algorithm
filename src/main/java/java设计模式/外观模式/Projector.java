package java设计模式.外观模式;

public class Projector {
    private static Projector Instance=new Projector();
    public static Projector getInstance(){
        return Instance;
    }
    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
    public void focus(){
        System.out.println("Projector focus");
    }
}
