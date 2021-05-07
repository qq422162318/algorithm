package java设计模式.工厂模式.工厂方法模式;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java设计模式.工厂模式.普通工厂方法.普通方法.CheesePizza;
import java设计模式.工厂模式.普通工厂方法.普通方法.GreekPizza;
import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    public abstract Pizza createPizza(String orderType);

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = bufferedReader.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}

