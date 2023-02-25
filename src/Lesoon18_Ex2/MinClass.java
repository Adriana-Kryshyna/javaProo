package Lesoon18_Ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class MinClass {
    public static void main(String[] args) throws IOException {

        LinkedList<Integer> list= new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        for (int i=0; i < 10; i++) {
            System.out.println("Enter ["+i+"]");
            str= reader.readLine();
            list.add(Integer.valueOf(str));

        }
        System.out.println((char)27+"[95m"+"Array :\n"+(char)27+"[0m"+list);

        System.out.println((char)27+"[95m"+"Min element :"+(char)27+"[0m"+ Collections.min(list));


    }


}

