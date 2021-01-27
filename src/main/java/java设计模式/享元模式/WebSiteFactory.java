package java设计模式.享元模式;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String ,ConcreteWebSite> pool=new HashMap<>();

    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
