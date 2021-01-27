package java设计模式.装饰者模式;

public class Decorator extends Drink {
    private Drink obj;
    public Decorator(Drink obj){
        this.obj=obj;
    }
    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }
    public String getDes(){
        return super.des+" "+super.getPrice()+"&&"+obj.getDes();
    }
}
