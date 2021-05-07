package java设计模式.工厂模式.抽象工厂模式;

import java设计模式.工厂模式.工厂方法模式.BJCheessPizza;
import java设计模式.工厂模式.工厂方法模式.BJPepperPizza;
import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

public class BJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheessPizza();
            pizza.setName("BJcheesePizza");
        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
            pizza.setName("BJpeeperPizza");
        }
        return pizza;
    }
}
