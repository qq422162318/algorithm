package java设计模式.建造者模式.improve;

public class HouseDirector {
    HouseBuilder houseBuilder=null;
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildroofed();
        return houseBuilder.buildHouse();
    }
}
