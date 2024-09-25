package Collections.HashSet;

import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        // HashSet declaration
        HashSet<String> hSet = new HashSet<>();

        // Adding elements to the HashSet
        hSet.add("ZZ");
        hSet.add("AA");
        hSet.add("BB");
        hSet.add("CC");
        hSet.add("DD");
        hSet.add("EE");

        //removing elements
        hSet.remove("EE");
        hSet.remove("CC");

        System.out.println("HashSet Elements: ");
        // Iterating HashSet
        for(String s: hSet){
            System.out.println(s);
        }
    }
}