package java设计模式.备忘录模式;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态#1");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态#2");
        originator.getStateFromMemento(caretaker.get(0));

        System.out.println(originator.getState());

    }
}
