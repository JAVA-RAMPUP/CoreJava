package Strings;

public class Main {


    public static void main(String[] args) {

        String s1= "sharan";
        String s2= "sharan";

        String s3 = new String("sharan");
        String s4 = new String("sharan");


        System.out.println( s3.equals(s2));
        System.out.println( s1==s2);
        System.out.println( s1==s3);

        System.out.println( s3==s4);

    }

}
