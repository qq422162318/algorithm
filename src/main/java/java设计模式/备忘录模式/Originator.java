package java设计模式.备忘录模式;

public class Originator {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Memento saveStateMemento(){
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento){
        state=memento.getState();
    }
}
