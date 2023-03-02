package Lesson22_Ex1;

import java.io.*;

public class Main {
    public static void main(String[] args)  throws  Exception{
        File f1 = new File("C:\\Users\\adria\\IdeaProjects\\javaProo\\src\\Lesson22_Ex1\\Seriliza.txt");
        Seriliza seriliza = new Seriliza("Lion",20);
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(f1));
        oos.writeObject(seriliza);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f1));
        Seriliza newSereliza= (Seriliza) ois.readObject();
        ois.close();
        System.out.println(newSereliza.getAge()+" "+newSereliza.getUserName());
    }
}
