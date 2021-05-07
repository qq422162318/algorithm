package java设计模式.观察者模式;

public interface Subject {
    public void registerObjserver(Observer o);
    public void removeObjserver(Observer o);
    public void notifyObjserver();
}
