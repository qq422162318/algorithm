package java设计模式.代理模式.静态代理;

public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("原方法调用输出");
    }
}
