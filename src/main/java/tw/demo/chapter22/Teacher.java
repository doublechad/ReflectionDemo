package tw.demo.chapter22;

public class Teacher implements IWorker {
    @Override
    public void doSoming() {
        System.out.println("上課了");
    }
}
