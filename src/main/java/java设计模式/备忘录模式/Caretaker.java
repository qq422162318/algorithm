package java设计模式.备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList=new ArrayList<>();
    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
