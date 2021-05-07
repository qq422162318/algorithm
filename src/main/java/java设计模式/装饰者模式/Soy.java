package java设计模式.装饰者模式;

public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("Soy");
        setPrice(1.0f);
    }
}
