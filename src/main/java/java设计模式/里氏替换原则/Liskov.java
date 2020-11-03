package java设计模式.里氏替换原则;

public class Liskov {
    public static void main(String[] args) {

    }
}
class Base{

}
class A extends Base{
    public int fun1(int a,int b){
        return a-b;
    }
}
class B extends Base{
    private A a=new A();
    public int fun1(int a,int b){
        return a+b;
    }
    public int fun2(int a,int b){
        return this.a.fun1(a,b);
    }
}
