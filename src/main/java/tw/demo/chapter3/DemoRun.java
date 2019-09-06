package tw.demo.chapter3;

import java.lang.reflect.Field;

public class DemoRun {
    public static void main(String[] args) {
        Class c1 =CustomObject.class;
        try {
            Field field =c1.getField("field1");
            MyCustomAnnotation a1 =field.getAnnotation(MyCustomAnnotation.class);
            System.out.println(a1.value());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
