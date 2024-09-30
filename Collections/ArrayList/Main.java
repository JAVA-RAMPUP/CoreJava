package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.stream.Stream;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");


        boolean a= fruits.stream().anyMatch( fruit -> fruit.startsWith("B") );
        System.out.println(a);

        fruits.stream().filter(f -> f.endsWith("e")).forEach( f->System.out.println(f));
        //System.out.println(s);
        System.out.println(fruits.stream());




       // fruits.add(4,"Mango");
        fruits.add(2,"Apple");
//fruits.remove("Cherry");

        Collections.sort(fruits);
      //  System.out.println(fruits);

//        Iterator<String> it=fruits.iterator();
//
//         while(it.hasNext()){
//             System.out.println(it.next());
//         }
//
//
//
//        System.out.println("First element: " + fruits.get(0));
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        System.out.println("Size: "+fruits.size());

//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                arrayList.add(i);
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 1000; i < 2500; i++) {
//                arrayList.add(i);
//            }
//        });
//
//       // t1.start();
//        t2.start();
//
//        //t1.join();
//        t2.join();
//
//        System.out.println("ArrayList size: " + arrayList.size());


    }


}
