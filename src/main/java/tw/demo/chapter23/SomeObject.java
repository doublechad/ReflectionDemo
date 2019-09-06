package tw.demo.chapter23;

public class SomeObject {

    public void doSomingBypublic(){
        System.out.println("public");
    }
    protected void doSomingByProtected(){
        System.out.println("protected");
    }
    public  static void doSomingByStatic(){
        System.out.println("static");
    }
    public final void doSomingByFinal(){
        System.out.println("final");
    }
}
