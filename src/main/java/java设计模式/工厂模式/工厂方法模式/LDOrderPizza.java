package java设计模式.工厂模式.工厂方法模式;

import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new LDCheessPizza();
            pizza.setName("LDcheesePizza");
        }else if (orderType.equals("pepper")){
            pizza=new LDPeeperPizza();
            pizza.setName("LDpeeperPizza");
        }
        return pizza;
    }
}
