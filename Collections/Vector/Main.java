package Collections.Vector;

import java.util.*;
import java.util.Vector;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Vector<Integer> vector = new Vector<Integer>();
//
//        vec.addElement("Apple");  // add to the last
//        vec.addElement("Orange");
//        vec.addElement("Mango");
//        vec.addElement("Fig");
//
//        System.out.println("Size is: "+vec.size());
//        System.out.println("Default capacity increment is: "+vec.capacity());
//
//        vec.addElement("Grape");
//        vec.addElement("fruit2");
//        vec.addElement("fruit3");
//
//        System.out.println("Size after addition: "+vec.size());
//        System.out.println("Capacity after increment is: "+vec.capacity());
//
//        Enumeration<String> en = vec.elements();
//        System.out.println("\nElements are:");
//        while(en.hasMoreElements())
//            System.out.print(en.nextElement() + " ");

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 89500; i++) {
                vector.add(i);
            }
        });

        t1.start();
        t2.start();

      //  t1.join();
      //  t2.join();

        System.out.println("Vector size: " + vector.size());
        t1.join();
        System.out.println("Vector size: " + vector.size());

        t2.join();
        System.out.println("Vector size: " + vector.size());



    }
}
