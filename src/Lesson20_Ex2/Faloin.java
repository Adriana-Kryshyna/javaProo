package Lesson20_Ex2;

import java.io.*;

public class Faloin {

        public static void main(String[] args)throws  Exception {
            File file = new File("C:\\Users\\adria\\IdeaProjects\\javaProo\\src\\Lesson20_Ex2\\NewAnimal.txt");
            FileWriter wr= new FileWriter(file,true);
            PrintWriter pw= new PrintWriter(wr);
            pw.println("Koala is  a very lazy animal");
            pw.flush();
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

