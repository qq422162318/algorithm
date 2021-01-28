package java设计模式.代理模式.动态代理;

import java设计模式.代理模式.静态代理.ITeacherDao;
import java设计模式.外观模式.Projector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理模式开始");
                Object invoke = method.invoke(target,args);
                return invoke;
            }
        });
    }
}
