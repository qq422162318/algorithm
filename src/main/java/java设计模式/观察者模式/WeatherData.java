package java设计模式.观察者模式;

import java设计模式.观察者模式.CurrentConditions;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    private ArrayList<Observer> observers;
    public WeatherData() {
        observers=new ArrayList<Observer>();
    }
    public float getTemperatrue(){
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setData(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange() {
        notifyObjserver();
    }

    @Override
    public void registerObjserver(Observer o) {
      observers.add(o);
    }

    @Override
    public void removeObjserver(Observer o) {
        if (observers.contains(o))
        observers.remove(o);
    }

    @Override
    public void notifyObjserver() {
        for (int i = 0; i <observers.size() ; i++) {
            observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
        }
    }
}
