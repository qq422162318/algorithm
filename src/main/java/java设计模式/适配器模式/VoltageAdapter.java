package java设计模式.适配器模式;
//类适配器
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV=output220V();
        int dstV=srcV/44;
        return dstV;
    }
}
