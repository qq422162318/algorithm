package java设计模式.访问者模式;

public class Women extends Person {
    @Override
    public void accept(Action action) {
        action.getWomenResult(this);
    }
}
