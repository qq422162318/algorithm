package java设计模式.依赖倒转原则;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());

    }

}
interface IReceiver{
    public String getInfo();

}
class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "Hello world";
    }
}
class Weixin implements IReceiver{
    @Override
    public String getInfo() {
        return "Hello Weixin";
    }
}
class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
