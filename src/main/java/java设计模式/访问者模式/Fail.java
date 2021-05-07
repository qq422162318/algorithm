package java设计模式.访问者模式;

public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人表示失败");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人表示失败");
    }

}
