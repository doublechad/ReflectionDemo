package tw.demo.chapter1;

public class Son extends Father{
    static {
        System.out.println("Son Class exec static");
    }

    public Son() {
        System.out.println("init Son");
    }
}
