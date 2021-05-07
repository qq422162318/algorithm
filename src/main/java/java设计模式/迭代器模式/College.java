package java设计模式.迭代器模式;

import java.util.Iterator;

public interface College {
    public String getName();
    public void addDepartment(String name,String desc);
    public Iterator createIterator();
}
