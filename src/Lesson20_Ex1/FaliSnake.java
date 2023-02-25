package Lesson20_Ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FaliSnake {
    public static void main(String[] args)throws  Exception {
        File file = new File("C:\\Users\\adria\\IdeaProjects\\javaProo\\src\\Lesson20_Ex1\\Snake1.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bf= new BufferedReader(fileReader);
        String str = null;
        while((str =bf.readLine())!=null)
        {
            System.out.println(str);
        }
        bf.close();
    }

}
