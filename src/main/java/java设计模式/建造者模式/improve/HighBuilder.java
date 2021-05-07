package java设计模式.建造者模式.improve;

public class HighBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("hightbuild");
    }

    @Override
    public void buildWalls() {
        System.out.println("hithbuild");
    }

    @Override
    public void buildroofed() {
        System.out.println("highbuilding");
    }
}
