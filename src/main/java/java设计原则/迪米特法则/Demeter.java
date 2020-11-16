package java设计原则.迪米特法则;

import java.util.ArrayList;
import java.util.List;
//使用迪米特法则的解法
public class Demeter {
    public static void main(String[] args) {
      SchoolManager schoolManager=new SchoolManager();
      schoolManager.printAllEmployee(new CollegeManager());
    }
}
class Employee{
    private String id;
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
class CollegeEmployee{
    private String id;
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
//管理学院员工的管理类
class CollegeManager{
    public List<CollegeEmployee> getAllEmployee(){
        ArrayList<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id="+i);
            list.add(collegeEmployee);
        }
        return list;
    }
    public void printEmployee(){
        List<CollegeEmployee> collegeEmployeeList = this.getAllEmployee();
        System.out.println("分公司员工");
        for (CollegeEmployee employee : collegeEmployeeList) {
            System.out.println(employee.getId());
        }
    }
}
//学校管理类
class SchoolManager{
    public List<Employee> getAllEmployee(){
        ArrayList<Employee> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id="+i);
            list.add(employee);
        }
        return list;
    }
    public void printAllEmployee(CollegeManager sub){
        sub.printEmployee();
        System.out.println("学校总部员工");
        List<Employee> schoolEmployee = this.getAllEmployee();
        for (Employee employee : schoolEmployee) {
            System.out.println(employee.getId());
        }
    }
}

