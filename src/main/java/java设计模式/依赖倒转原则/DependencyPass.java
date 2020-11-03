package java设计模式.依赖倒转原则;

public class DependencyPass {
    public static void main(String[] args) {
        chanhong chanhong = new chanhong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(chanhong);
    }
}
class chanhong implements ITV{
    @Override
    public void play() {
        System.out.println("changhong");
    }
}
//1.接口
interface IOpenAndClose{
    public void open(ITV tv);
}
interface ITV{
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}
//2.构造器
//interface IOpenAndClose{
//    public void open();
//}
//interface ITV{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv=tv;
//    }
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
//3.setter
//class OpenAndClose implements IOpenAndClose{
//    private ITV tv;
//    public void setTv(ITV tv){
//        this.tv=tv;
//    }
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
