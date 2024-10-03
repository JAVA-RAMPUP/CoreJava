package Java8.Lambda;


interface FunctionalInterface {

    int show(int num);
   // void config();
}

class Example{

    void display(){
        System.out.println("Hello World");
    }
}


public class Main {

    public static void main(String[] args) {

//         FunctionalInterface fi = new FunctionalInterface() {
//
//            public int show(int num) {
//                 System.out.println("Implemented via lambda" + "and num is"+num);
//                return num;
//            }
//
//             public void config() {
//                System.out.println("Config");
//             }
//
//         };



        FunctionalInterface fi = ( num) -> {

          return num;
        };

//fi.config();
fi.show(5);


FunctionalInterface fi2 = ( int r) -> r+1;

        System.out.println(fi2.show(5));
    }
}
