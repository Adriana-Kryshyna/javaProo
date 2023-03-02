package Lesson22_Ex2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        File fl = new File("C:\\Users\\adria\\IdeaProjects\\javaProo\\src\\Lesson22_Ex2\\Info.txt");
        SeriliazTwo st = new SeriliazTwo("Grey ",2,new Creature("Shark"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl));
        oos.writeObject(st);
        oos.flush();
        oos.close();
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(fl));
        SeriliazTwo ser = (SeriliazTwo) ois.readObject();
        ois.close();
        System.out.println(ser.shark.who+" "+ser.how_many+" "+ser.penguin);

    }
}
