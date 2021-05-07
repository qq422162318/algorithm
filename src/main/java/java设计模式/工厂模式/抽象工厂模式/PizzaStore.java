package java设计模式.工厂模式.抽象工厂模式;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
