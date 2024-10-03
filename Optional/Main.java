package Optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        String[] strArr = new String[10];


       // System.out.println( strArr[4].length());

        //strArr[4] = null;

        Optional<String> isNull = Optional.ofNullable(strArr[4]);

        System.out.println( isNull.isPresent());



      //  Optional<Integer> length = Optional.ofNullable(   )




       // strArr[4] = "some string";
//        Optional<String> str = Optional.of("Some string");
//
//        Optional<String> nothing = Optional.empty();
//
//        str.ifPresent( s -> System.out.println(s) );
//        System.out.println( str.orElse( "Default value" ) );
//        System.out.println( str.orElseGet( () -> "Default value" ) );
//        System.out.println( nothing.orElse( "Default value" ) );
//        System.out.println( nothing.orElseGet( () -> "Default value" ) );




    }
}
