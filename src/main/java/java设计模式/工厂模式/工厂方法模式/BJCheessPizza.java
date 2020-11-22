package java设计模式.工厂模式.工厂方法模式;

import java设计模式.工厂模式.普通工厂方法.普通方法.Pizza;

public class BJCheessPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("BJCheessPizza-prepare");
    }
}
