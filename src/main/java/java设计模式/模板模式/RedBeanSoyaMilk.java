package java设计模式.模板模式;

public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入红豆豆浆");
    }

    @Override
    boolean bool() {
        return true;
    }
}
