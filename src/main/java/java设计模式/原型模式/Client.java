package java设计模式.原型模式;

public class Client {
    public static void main(String[] args) {
        System.out.println("原型模式");
        Sheep sheep = new Sheep("tom", 1, "white");
        sheep.friend=new Sheep("jerry",2,"yellow");
        Sheep clone = (Sheep) sheep.clone();
        Sheep clone1 = (Sheep) sheep.clone();
        System.out.println(sheep.toString()+""+clone.toString());
        System.out.println(sheep.hashCode()+"||"+clone.hashCode());
        System.out.println(sheep.friend.hashCode()+"||"+clone.friend.hashCode());
    }
}
