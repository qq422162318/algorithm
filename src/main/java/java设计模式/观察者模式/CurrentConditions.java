package java设计模式.观察者模式;

public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;
    public void update(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    private void display() {
        System.out.println("***Today mTemperature"+temperature);
        System.out.println("**today MPressure"+pressure);
        System.out.println("**today mHumidity"+humidity);
    }
}
