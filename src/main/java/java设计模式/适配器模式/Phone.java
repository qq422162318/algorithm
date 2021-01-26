package java设计模式.适配器模式;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
       if (iVoltage5V.output5V()==5){
           System.out.println("charging");
       }else {
           System.out.println("no charging");
       }
    }
}
