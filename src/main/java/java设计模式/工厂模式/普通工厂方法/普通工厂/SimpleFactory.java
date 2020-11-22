package java设计模式.工厂模式.普通工厂方法.普通工厂;

import java设计模式.工厂模式.普通工厂方法.普通方法.CheesePizza;
import java设计模式.工厂模式.普通工厂方法.普通方法.GreekPizza;
import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

public class SimpleFactory {
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        if (pizza == null) {
            System.out.println("pizza is none");
        }
        return pizza;
    }
    public static  Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        if (pizza == null) {
            System.out.println("pizza is none");
        }
        return pizza;
    }
}
