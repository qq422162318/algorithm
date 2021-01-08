package 反射;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class lnvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
interface proxyInterface{
  void dosome();
}
class domain implements proxyInterface{

    @Override
    public void dosome() {

    }
}
class domainProxy{
    public void testProxy(){
        proxyInterface o = (proxyInterface) Proxy.newProxyInstance(domain.class.getClassLoader(),
                new Class[]{proxyInterface.class},
                new lnvocationHandler());
        o.dosome();
    }
}
