package java设计模式.建造者模式;

import jdk.nashorn.internal.ir.CallNode;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
