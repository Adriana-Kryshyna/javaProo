package Lesson21_Ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Refl {
    static  private  final class Animaall
    {
        public String nameAnimal = "Lion ";
        public String nameAnimal2= "Lioness";
        private  int age = 15 ;
        short child= 3;
        protected  long weight = 25;

        public Animaall() {
        }

        public Animaall(String nameAnimal, String nameAnimal2, int age, short child, long weight) {
            this.nameAnimal = nameAnimal;
            this.nameAnimal2 = nameAnimal2;
            this.age = age;
            this.child = child;
            this.weight = weight;
        }

        public String getNameAnimal() {
            return nameAnimal;
        }

        public void setNameAnimal(String nameAnimal) {
            this.nameAnimal = nameAnimal;
        }

        public String getNameAnimal2() {
            return nameAnimal2;
        }

        public void setNameAnimal2(String nameAnimal2) {
            this.nameAnimal2 = nameAnimal2;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public short getChild() {
            return child;
        }

        public void setChild(short child) {
            this.child = child;
        }

        public long getWeight() {
            return weight;
        }

        public void setWeight(long weight) {
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Class cl = Animaall.class;
        // отримайте всю інформацію про поля, (методи), (конструктори), а також (модифікатори доступу.)
        System.out.println((char)27+"[95m"+" Information about CONSTRUCTOR :"+(char)27+"[0m" );
        Constructor[] con =cl.getConstructors();
        for (Constructor co:con)
        {Class [] paramTypes =  co.getParameterTypes();
            for (Class param:paramTypes) {
                System.out.println(param.getName()+" ");
            }

        }//***MODIFIERS
        System.out.println((char)27+"[95m"+" Information about MODIFIERS :"+(char)27+"[0m" );
        int modifiers = cl.getModifiers();
        System.out.println( "Class name: " +  cl.getName());
        System.out.print( "Modifiers of class: " );
        // getModifiers(), повертає ціле значення
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods))
            System.out.print("private ");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract ");
        if (Modifier.isFinal(mods))
            System.out.print("final ");
        //***METHOD
        System.out.println((char)27+"[95m"+" \nInformation about METHOD :"+(char)27+"[0m");
        Method[] met = cl.getDeclaredMethods();
        for (Method me:met) {
            System.out.println("Name: "+ me.getName());
            System.out.println("\tReturn type: " +  me.getReturnType().getName());
            Class[] paramTypes = me.getParameterTypes();
            System.out.print( "\tParam types:" );
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
        }
    }

        }}


