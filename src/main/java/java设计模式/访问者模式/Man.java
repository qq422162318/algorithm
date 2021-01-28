package java设计模式.访问者模式;

public class Man extends Person{

    @Override
    public void accept(Action action) {
      action.getManResult(this);
    }
}
