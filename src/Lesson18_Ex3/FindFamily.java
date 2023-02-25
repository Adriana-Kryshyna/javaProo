package Lesson18_Ex3;

import java.util.HashMap;
import java.util.Scanner;

//Програма визначає, яка сім'я (прізвище) живе у місті:
public class FindFamily {
    public static void main(String[] args) {
        FamilyandCity ct = new FamilyandCity("Vinitsya");
        FamilyandCity ct1 = new FamilyandCity("Kyiv");
        FamilyandCity ct2 = new FamilyandCity("Sosonka");
        FamilyandCity ct3 = new FamilyandCity("Harkiv");
        FamilyandCity ct4 = new FamilyandCity("Lviv");
        HashMap<FamilyandCity, String> faml = new HashMap<>();
        faml.put(ct, "Gavrik");
        faml.put(ct1, "Starovoit");
        faml.put(ct2, "Kaplin");
        faml.put(ct3, "Stefa");
        faml.put(ct4, "Salo");
        System.out.println("ХТО ПРОЖИВАЄ В МІСТІ\n" +
                "1.Vinitsya\n" +
                "2.Kyiv\n" +
                "3.Sosonka\n" +
                "4.Harkiv\n" +
                "5.Lviv");
        Scanner scan = new Scanner(System.in);
        System.out.println((char)27+"[35m"+"Make a choice");
        int fin = scan.nextInt();
        switch (fin) {
            case 1: {
                System.out.print((char)27+"[96m"+"Vinitsya -"+(char)27+"[0m");
                System.out.println(faml.get(ct));
                break;
            }
            case 2: {
                System.out.print((char)27+"[96m"+"Kyiv -"+(char)27+"[0m");
               System.out.println(faml.get(ct1));
               break;
            }
            case 3: {
                System.out.print((char)27+"[96m"+"Sosonka -"+(char)27+"[0m");
                System.out.println(faml.get(ct2));
                break;
            }
            case 4: {
                System.out.print((char)27+"[96m"+"Harkiv -"+(char)27+"[0m");
                System.out.println(faml.get(ct3));
                break;
            }
            case 5: {
                System.out.print((char)27+"[96m"+"Lviv -"+(char)27+"[0m");
                System.out.println(faml.get(ct4));
                break;
            }
        }

    }
}
class FamilyandCity{
    String city;

    public FamilyandCity(String city) {
        this.city = city;
    }
}
