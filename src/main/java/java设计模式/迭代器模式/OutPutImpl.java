package java设计模式.迭代器模式;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    List<College> collegeList;
    public OutPutImpl(List<College> collegeList){
        super();
        this.collegeList=collegeList;
    }
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println("==="+next.getName()+"===");
            printDepartment(next.createIterator());
        }
    }
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }
}
