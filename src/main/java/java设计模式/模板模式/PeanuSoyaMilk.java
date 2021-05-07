package java设计模式.模板模式;

public class PeanuSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生豆浆");
    }

    @Override
    boolean bool() {
        return false;
    }
}
