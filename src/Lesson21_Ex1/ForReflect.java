package Lesson21_Ex1;
import java.lang.reflect.Field;

public class ForReflect {

        static private final class AnimalFields {
            public String animal = "Koala";
            private int weight = 10;
            short legs = 4;
            protected long tail = 10;
        }

        public static void main(String[] args) {
            Class cla = AnimalFields.class;
            Field[]   fields = cla.getDeclaredFields();
            for (Field field : fields) {
                Class fieldType = field.getType();
                System.out.println( "\tName: " +  field.getName());
                System.out.println( "\tType: " +  fieldType.getName());
            }
        }
    }

