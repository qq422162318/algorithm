package java设计模式.享元模式;

public class ConcreteWebSite  extends WebSite{
    private String type="";
    ConcreteWebSite(String type){
        this.type=type;
    }
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式"+type+" "+user.getName()+" isusering");
    }
}
