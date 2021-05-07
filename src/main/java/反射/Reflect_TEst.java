package 反射;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflect_TEst {

    @Test
    public void test1() throws Exception{
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","tom");
        map.put("age",20);
        map.put("sex","男");
        map.put("address","北京");
        Class class1=Class.forName("changyong.Person");
        Object obj=class1.newInstance();
        Field[] fid=class1.getDeclaredFields();
        Set<String> keys=map.keySet();
        for(Field f:fid){
            String field_name=f.getName();
            if(keys.contains(field_name)){
                f.setAccessible(true);
                f.set(obj,map.get(field_name));
            }
        }
        //System.out.println(obj);
    }
    @Test
    public void test2() throws Exception{
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","tom");
        map.put("age",20);
        map.put("sex","男");
        map.put("address","北京");
        Class class1=Class.forName("changyong.Person");
        Object obj=class1.newInstance();
        Method[] methods=class1.getDeclaredMethods();
        for(String key:map.keySet()){
            String mName="set"+key;
            for(Method method:methods){
                if(mName.equalsIgnoreCase(method.getName())){
                    method.invoke(obj, map.get(key));
                }
            }
        }
        System.out.println(obj);
    }
}
