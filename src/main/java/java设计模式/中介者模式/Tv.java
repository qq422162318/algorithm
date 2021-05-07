package java设计模式.中介者模式;

public class Tv extends Colleague {
    public Tv(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void StartTv(){
        System.out.println("i am StartTV");
    }
    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
