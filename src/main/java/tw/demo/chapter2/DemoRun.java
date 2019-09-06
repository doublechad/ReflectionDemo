package tw.demo.chapter2;

public class DemoRun {
    public static void main(String[] args) {
        try {
            Class studentClass =Class.forName("tw.demo.chapter2.Student");
            System.out.println("類別名稱：" +
                    studentClass.getName());
            System.out.println("是否為介面：" +
                    studentClass.isInterface());
            System.out.println("是否為基本型態：" +
                    studentClass.isPrimitive());
            System.out.println("是否為陣列物件：" +
                    studentClass.isArray());
            System.out.println("父類別名稱：" +
                    studentClass.getSuperclass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
