package java设计模式.适配器模式;

public class Voltage220V {
    public int output220V(){
        int src=220;
        System.out.println("electric is "+src+"v");
        return src;
    }
}
