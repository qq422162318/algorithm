package java设计模式.享元模式;

public class User {
    private String name;
    User(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
