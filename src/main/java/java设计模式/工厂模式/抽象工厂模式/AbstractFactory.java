package java设计模式.工厂模式.抽象工厂模式;

import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

public interface AbstractFactory {
   Pizza createPizza(String orderType);
}
