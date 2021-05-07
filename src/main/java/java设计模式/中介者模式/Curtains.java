package java设计模式.中介者模式;

public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void UpCurtains(){
        System.out.println("i am holding UpCurtains");
    }
    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
