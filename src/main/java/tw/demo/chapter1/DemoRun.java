package tw.demo.chapter1;

public class DemoRun {

    public static void main(String[] args) {
        //透過常量取得class
//        Class father =Father.class;
//        Father fatherInstance1 = new Father();
//        //透過instance取得
//        Class father2 =fatherInstance1.getClass();
        //System.out.println(father ==father2);
//        Son son =new Son();
//        透過Class  動態加載
        try {
            Class father3 =Class.forName("tw.demo.chapter1.Father");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}

