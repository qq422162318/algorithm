package java设计模式.迭代器模式;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department[] departments;
    int numOfDepartment=0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java"," Java college");
        addDepartment("php","php college");
        addDepartment("大数据专业","大数据college");
        addDepartment("python","python college");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment]=department;
        numOfDepartment+=1;

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
