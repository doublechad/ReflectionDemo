package tw.demo.chapter2;

import java.lang.reflect.Field;

public class DemoRun2 {
    public static void main(String[] args) {
        Student student = new Student();
        Class studentClass=student.getClass();
        Field[] fields =studentClass.getDeclaredFields();
        for(Field field:fields){
            System.out.println("變數名稱:"+field.getName());
            System.out.println("變數類別:"+field.getType());
        }
        System.out.println("-------------------我是分隔線---------------------------");
        Field[] fields1 =studentClass.getFields();
        for(Field field:fields1){
            System.out.println("變數名稱:"+field.getName());
            System.out.println("變數類別:"+field.getType());
        }
        try {
            Field f =People.class.getDeclaredField("height");
            f.setAccessible(true);
            System.out.println(f.get((People)student));;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }


}
