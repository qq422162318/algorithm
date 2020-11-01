package 算法.线性表;

import java.util.Iterator;

public class SequenceListTest2 {
    public static void main(String[] args) {
        SequenceList<String> s1=new SequenceList<>(3);
        s1.insert("张三");
        s1.insert("李四");
        s1.insert("王五");
        s1.insert("赵六");
        for (Object o : s1) {
            System.out.println(o);
        }

    }
}
