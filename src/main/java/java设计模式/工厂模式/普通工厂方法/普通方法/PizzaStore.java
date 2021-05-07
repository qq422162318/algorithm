package java设计模式.工厂模式.普通工厂方法.普通方法;

import java设计模式.工厂模式.普通工厂方法.普通工厂.SimpleFactory;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());

    }
}
