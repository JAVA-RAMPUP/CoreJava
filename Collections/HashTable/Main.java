package Collections.HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] main) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("One", 6);
        hashtable.put("Two", 1);
        hashtable.put("Three", 3);


        System.out.println("Hashtable Elements: " + hashtable);

    }
}
