package java设计模式.外观模式;

public class DVDPlayer {
    private static DVDPlayer Instance=new DVDPlayer();
    public static DVDPlayer getInstance(){
        return Instance;
    }
    public void on(){
        System.out.println("DVDPlayer on");
    }
    public void off(){
        System.out.println("DVDPlayer off");
    }
    public void play(){
        System.out.println("DVDPlayer play");
    }
    public void pause(){
        System.out.println("DVDPlayer pause");
    }

}
