package tw.demo.chapter23;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBproxy implements MethodInterceptor {

    private Object targetObject;

    public Object bind(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();
        // 设置父类--可以是类或者接口
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        // 返回代理对象
        return proxyObj;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB代理調用");
        return method.invoke(targetObject, args);
    }
}
