package java设计模式.建造者模式.improve;
//抽象的建造者
public abstract class HouseBuilder {
   protected House house=new House();

   public abstract void buildBasic();
   public abstract void buildWalls();
   public abstract void buildroofed();

   public House buildHouse(){
       return house;
   }
}
