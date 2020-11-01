package 算法.排序;

public class ComparableTest {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.setUsername("zhangsan");
       s1.setAge(23);
       Student s2=new Student();
       s2.setAge(24);
       s2.setUsername("lisi");
        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }
    public static Comparable getMax(Comparable c1,Comparable c2){
        int result =c1.compareTo(c2);
        if (result>=0){
            return c1;

        }else{
            return c2;
        }
    }
}
