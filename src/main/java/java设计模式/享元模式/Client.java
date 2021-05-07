package java设计模式.享元模式;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite news = factory.getWebSiteCategory("news");
        news.use(new User("dsf"));

        WebSite boke = factory.getWebSiteCategory("boke");
        boke.use(new User("boke"));

        WebSite boke1 = factory.getWebSiteCategory("boke");
        boke1.use(new User("jack"));
        System.out.println(new Integer(127)==new Integer(127));
    }
}
