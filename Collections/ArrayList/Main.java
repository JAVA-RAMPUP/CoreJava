package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

         Iterator<String> it=arrayList.iterator();

         while(it.hasNext()){
             System.out.println(it.next());
         }

         arrayList.stream().sorted();


        System.out.println("First element: " + arrayList.get(0));

        for (String fruit : arrayList) {
            System.out.println(fruit);
        }


    }


}
