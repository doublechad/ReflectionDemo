package tw.demo.chapter22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.MessageFormat;

public class JDKProxyHanlder implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target=target;
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
        return proxy;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            System.out.println(MessageFormat.format("{0}調用了",method.getName()));
            result = method.invoke(target, args);

        } catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
}
