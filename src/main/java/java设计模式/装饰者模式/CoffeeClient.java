package java设计模式.装饰者模式;

import javafx.beans.property.LongPropertyBase;

public class CoffeeClient {
    public static void main(String[] args) {
        LongBlack longBlack = new LongBlack();
        System.out.println(longBlack.cost());
        Milk milk = new Milk(longBlack);
        System.out.println(milk.cost());
        System.out.println(milk.getDes());
        Chocolate chocolate = new Chocolate(longBlack);
        System.out.println(chocolate.cost());
        System.out.println(chocolate.getDes());

        DeCaf deCaf = new DeCaf();
        System.out.println(deCaf.cost());
        System.out.println(deCaf.getDes());
    }
}
