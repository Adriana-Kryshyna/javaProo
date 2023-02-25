package Lesson18_Ex4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FunClass {

     public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<>();

        do{ System.out.print("Enter: ");
        BufferedReader strreader = new BufferedReader(new InputStreamReader(System.in));
       String str = strreader.readLine();
         if (str.equals("STOP"))
         {
             break;
         }
         list.add(str);

    for(String str1 : list)
     { System.out.println(str1); }} while (true);
       }}

