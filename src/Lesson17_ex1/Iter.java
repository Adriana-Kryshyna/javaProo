package Lesson17_ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        ArrayList<Integer> itr = new ArrayList<>();
        itr.add(312);
        itr.add(82);
        itr.add(32);
        itr.add(2);
        itr.add(3);
        itr.add(12);
        itr.add(31);
        itr.add(30);
        itr.add(300);
        itr.add(1000);
        itr.add(466);
        // System.out.println(itr);
        Iterator<Integer> iterator = itr.iterator();


        while (iterator.hasNext()) {

            Integer itr2 = iterator.next();
            System.out.println(itr2);

        }}}
