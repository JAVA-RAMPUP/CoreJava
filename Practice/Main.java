package Practice;

import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        String[] strs= { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
        StringJoiner sJ = new StringJoiner("*" , "(" ,")");

        for( String s : strs){
  sJ.add(s);
        }

        System.out.println(sJ);
        System.out.println(strs.length);

    }
}
