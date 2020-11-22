package java设计模式.工厂模式.普通工厂方法.普通方法;

import java设计模式.工厂模式.普通工厂方法.普通工厂.SimpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza2 {
    Pizza pizza=null;
    String orderType="";
    public OrderPizza2(){
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
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
