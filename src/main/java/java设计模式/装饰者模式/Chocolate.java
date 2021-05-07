package java设计模式.装饰者模式;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("chocolate");
        setPrice(3.0f);
    }
}
