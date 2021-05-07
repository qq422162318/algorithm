package java设计模式.建造者模式;

public abstract class AbstractHouse {
    public abstract void buildeBasic();
    public abstract void buildeWall();
    public abstract void roofed();
    public void build(){
        buildeBasic();
        buildeWall();
        roofed();
    }
}
