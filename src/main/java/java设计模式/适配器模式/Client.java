package java设计模式.适配器模式;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
//        phone.charging(voltageAdapter);

        phone.charging(new VoltageAdapter2(new Voltage220V()));
    }
}
