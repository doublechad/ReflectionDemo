package tw.demo.chapter23;

public class DemoRun {
    public static void main(String[] args) {
        SomeObject so =new SomeObject();
        CGLIBproxy proxyFactory =new CGLIBproxy();
        SomeObject proxy =(SomeObject)proxyFactory.bind(so);
        proxy.doSomingByProtected();
        proxy.doSomingBypublic();
        proxy.doSomingByFinal();
        SomeObject.doSomingByStatic();

    }
}
