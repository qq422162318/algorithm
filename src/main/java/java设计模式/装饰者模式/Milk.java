package java设计模式.装饰者模式;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("milk");
        setPrice(2.0f);
    }
}
