package java设计模式.中介者模式;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }
    public void SendAlarm(int state){
        sendMessage(state);
    }
    @Override
    public void sendMessage(int stateChange) {
          this.getMediator().getMessage(stateChange,this.name);
    }
}
