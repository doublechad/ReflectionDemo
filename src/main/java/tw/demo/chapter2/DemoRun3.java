package tw.demo.chapter2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DemoRun3 {

    public static void main(String[] args) {
        Student student = new Student();
        Class studentClass=student.getClass();

        Method[] method =studentClass.getMethods();
        Arrays.stream(method).map(Method::getName).forEach(System.out::println);

        System.out.println("--------我是分隔線---------");

        Method[] method1 =studentClass.getDeclaredMethods();
        Arrays.stream(method1).map(Method::getName).forEach(System.out::println);

        Student student2 = new Student();
        student2.setStudentOnly(4.0);

        try {
            Method readyToInvoke =studentClass.getDeclaredMethod("getStudentOnly");
            Object result =readyToInvoke.invoke(student2,null);
            System.out.println(result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
