package java设计模式.中介者模式;

public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(int stateChange);
    public Mediator getMediator(){
        return this.mediator;
    }
}
