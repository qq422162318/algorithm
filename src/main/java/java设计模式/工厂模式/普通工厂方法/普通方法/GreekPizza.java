package java设计模式.工厂模式.普通工厂方法.普通方法;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备GreekPizza原材料");
    }
}
