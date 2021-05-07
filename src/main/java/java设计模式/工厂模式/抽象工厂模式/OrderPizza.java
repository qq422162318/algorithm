package java设计模式.工厂模式.抽象工厂模式;

import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza(AbstractFactory abstractFactory) {
        setAbstractFactory(abstractFactory);
    }

    AbstractFactory abstractFactory;

    public void setAbstractFactory(AbstractFactory factory) {
        Pizza pizza = null;
        String orderType = "";
        this.abstractFactory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
    }

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
