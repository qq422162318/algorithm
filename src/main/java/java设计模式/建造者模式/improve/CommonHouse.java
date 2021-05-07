package java设计模式.建造者模式.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("commonhouse ing");
    }

    @Override
    public void buildWalls() {
        System.out.println("commonhouse 10cm");
    }

    @Override
    public void buildroofed() {
        System.out.println("commonhouse roofed");
    }
}
