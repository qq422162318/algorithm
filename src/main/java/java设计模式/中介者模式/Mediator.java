package java设计模式.中介者模式;

public abstract class Mediator {
    public abstract void Register(String name,Colleague colleague);
    public abstract void getMessage(int state,String name);
    public abstract void SendMessage();
}
