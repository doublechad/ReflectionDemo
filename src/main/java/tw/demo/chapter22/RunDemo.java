package tw.demo.chapter22;

public class RunDemo {
    public static void main(String[] args) {
        IWorker teacher =new Teacher();
        JDKProxyHanlder jdkProxyHanlder =new JDKProxyHanlder();
        IWorker proxy = (IWorker) jdkProxyHanlder.bind(teacher);
        proxy.doSoming();
    }
}
