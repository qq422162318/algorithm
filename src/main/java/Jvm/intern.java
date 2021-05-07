package Jvm;

public class intern {
    public static void main(String[] args) {
        String s=new String("a")+new String("b");
        String s2=s.intern();//将这个字符串对选哪个尝试放入串池,有则不会放入,放入并把串池的对象返回
        System.out.println();

    }}
