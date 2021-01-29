package java设计模式.观察者模式;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObjserver(currentConditions);
        weatherData.setData(10f,1f,30.3f);


    }
}
