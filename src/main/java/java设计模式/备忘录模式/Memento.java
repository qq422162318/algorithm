package java设计模式.备忘录模式;

public class Memento {
    private String state;
    public Memento(String state) {
        this.state=state;
    }

    public String getState() {
        return state;
    }
}
