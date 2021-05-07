package java设计模式.访问者模式;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人表示成功");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人表示成功");
    }
}
