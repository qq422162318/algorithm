package java设计模式.装饰者模式;

public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
