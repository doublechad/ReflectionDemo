package tw.demo.chapter21;

public class DemoRun {
    public static void main(String[] args) {
        HelloImp target =new HelloImp();
        HelloHandler proxy =new HelloHandler(target);
        proxy.sayHello();
    }
}
