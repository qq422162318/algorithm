package java设计模式.适配器模式;
//对象适配器模式
public class VoltageAdapter2 implements IVoltage5V{
    private Voltage220V voltage220V;
    public VoltageAdapter2(Voltage220V voltage220V1){
        this.voltage220V=voltage220V1;
    }
    @Override
    public int output5V() {
        int i =0;
        if (null!=voltage220V){
            int i1 = voltage220V.output220V();
            i=i1/44;
        }
        return i;
    }
}
