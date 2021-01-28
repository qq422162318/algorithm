package java设计模式.代理模式.动态代理;

import java设计模式.代理模式.静态代理.ITeacherDao;
import java设计模式.代理模式.静态代理.TeacherDao;

public class Test {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        System.out.println(proxyInstance);
        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();

        ProxyFactory2 proxyFactory2 = new ProxyFactory2(teacherDao);
        ITeacherDao proxyInstance1 = (ITeacherDao) proxyFactory2.getProxyInstance();
        System.out.println(proxyInstance1);
    }
}
