package java设计模式.模板模式;

public class Client {
    public static void main(String[] args) {
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        PeanuSoyaMilk peanuSoyaMilk = new PeanuSoyaMilk();
        peanuSoyaMilk.make();
    }
}
