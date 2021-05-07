package 反射;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect_classTest {
    @Test
    public void test1(){
        User user=new User();
        Class  class1 = user.getClass();
        System.out.println(class1);
    }
    @Test
    public void test2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class userClass = User.class;
        Constructor constructor = userClass.getDeclaredConstructor(String.class);
        Constructor[] constructors = userClass.getConstructors();
        constructor.setAccessible(true);
        Object tom = constructor.newInstance("tom");
        System.out.println(tom);
        for (Constructor i:constructors)
        System.out.println(constructors);
    }
    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException {
     Class clazz=Class.forName("反射.User");

        System.out.println(clazz);
    }
    @Test
    public void test4() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
      Class clss1=User.class;
        Object user = clss1.newInstance();
      Field field=clss1.getDeclaredField("username");
        field.setAccessible(true);
        field.set(user,"tom");
        Object name = field.get(user);
        System.out.println(name);

    }
    @Test
    public void test5(){
    Class clss=User.class;
        //Method[] methods = clss.getMethods();
        Method[] methods=clss.getDeclaredMethods();
        for (Method m:methods) System.out.println(m);
    }
    @Test
    public void test6() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user=new User();
        String st=user.sayHello("fox");
        System.out.println(st);
        Class clss=user.getClass();
        Method method=clss.getMethod("sayHello", String.class);
        Object inv = method.invoke(user, "fox");
        System.out.println(inv);
    }
    @Test
    public void test7() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
     Class clazz=User.class;

     Method method=clazz.getMethod("sum",Integer[].class);
     Integer[] args={1,2,3,4,5};//Interger里每个元素皆对象
     Object[] objs={args};
        method.invoke(null,objs);
    }
}
