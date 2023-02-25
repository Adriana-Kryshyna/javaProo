package Lesson18_EX1;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleValues {
    public static void main(String[] args) {
        ArrayList<String > list= new ArrayList<>();
        list.add("Hello");
        list.add("Cat");
        list.add("Dog");
        list.add("Snake");
        list.add("Take care");
        for (String st1:list
        ) {
            System.out.println(st1+" "+st1);

        }


    }

}
