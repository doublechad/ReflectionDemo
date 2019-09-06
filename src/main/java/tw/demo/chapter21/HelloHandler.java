package tw.demo.chapter21;

public class HelloHandler implements IHello {
    private IHello target;

    public HelloHandler(IHello target) {
        this.target = target;
    }

    @Override
    public void sayHello() {
        System.out.println("目標類別調用前");
        target.sayHello();
        System.out.println("目標類別調用後");
    }
}
