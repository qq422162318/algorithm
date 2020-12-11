package java设计模式.建造者模式;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildeBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildeWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
