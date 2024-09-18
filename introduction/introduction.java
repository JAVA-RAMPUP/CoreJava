package introduction;

public class introduction {


    public static void main(String[] args) {


        int a=10;

// for loop - star pattern
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
        System.out.println("for loop");
        int n=5;
        for (int i = n; i >= 1; i--){

             for(int j= i-1;j >=1;j--){
                 System.out.print(" ");
             }

              for(int k=n ; k>=i ; k--){
                  System.out.print("* ");
              }
            System.out.println();
        }

//        while loop
// string reverse

        String strToReverse="sharan";
        int len=strToReverse.length()-1;
        while( len >= 0){
            System.out.print(str.charAt(len));
            len--;
        }

        // break and continue
//skip the vowels and break when encountering special charcters

        String str= "Sharan";
        int i = 0;
        char[] vowels = {'a','e','i','o','u' };
        while ( i < str.length() ){

            if( str.charAt(i). ){}

            i++;

        }







    }


}
