package java设计模式.原型模式;

import javax.xml.soap.SOAPHeader;

public class Sheep implements Cloneable {
    private int age;
    private String Color;
    private String name;
    public Sheep friend;

    public Sheep(String name, int age, String color) {
        this.age = age;
        this.Color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "age=" + age +
                ", Color='" + Color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
