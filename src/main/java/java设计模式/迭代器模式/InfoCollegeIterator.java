package java设计模式.迭代器模式;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList;
    int index=-1;

    public InfoCollegeIterator(List<Department> departments){
        this.departmentList=departments;
    }

    @Override
    public boolean hasNext() {
        if (index>=departmentList.size()-1){
            return false;
        }else {
            index+=1;
            return true;
        }
    }

    @Override
    public Object next() {

        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }

}
