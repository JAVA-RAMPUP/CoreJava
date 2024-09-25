package Collections.Hashmap;


//import java.util.HashMap;
//import java.util.Map;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();


//        hashMap.put(101,"Cricket");
//        hashMap.put(105,"Hockey");
//        hashMap.put(111,"Basketball");
//        hashMap.put(123,null);
//        hashMap.put(21,null);
        //hashMap.put(null,null);
        hashMap.put(null,"Ball");

        hashMap.put(null,"Tennis");
        System.out.println("map"+hashMap);
       Object cloneMap = hashMap.clone();
        System.out.println(Object.class.getName());
       // System.out.println(hashMap.get(101));




       // hashMap.put(101,"Football");
      //  hashMap.remove(111);






       Set<Map.Entry<Integer, String>> set = hashMap.entrySet();

//       for(  Map.Entry<Integer,String> element :set){
//           System.out.println(element.getKey());
//           System.out.println(element.getValue());
//       }

        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

       while (iterator.hasNext()) {

           Map.Entry<Integer, String> entry = iterator.next();
           //System.out.println(iterator.next());
           System.out.println(entry.getKey() + ", " + entry.getValue());

       }





       // Map.Entry<Integer, String>  set = hashMap.entrySet();
       // Set<Map.Entry<Integer, String>> set = hashMap.entrySet();
      //  System.out.println( "set " + set);
        //System.out.println("type of object in a hashmap" ,);

//        for(Map.Entry<Integer, String> mEntry : hashMap.entrySet()){
//            System.out.print("key: "+ mEntry.getKey() + " & Value: ");
//            System.out.println(mEntry.getValue());
//        }


    }


}
