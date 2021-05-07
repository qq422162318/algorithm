package java设计模式.中介者模式;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeemachine=new CoffeeMachine(mediator,"coffeemachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        Tv tv = new Tv(mediator, "tv");
        alarm.sendMessage(0);
    }
}
