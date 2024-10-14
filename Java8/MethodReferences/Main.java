package Java8.MethodReferences;


import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

@FunctionalInterface
interface FuncInterface {

    void show();
    default void config(){
        System.out.println("Hello World");
    }


}


class Example{

    Example(){

        System.out.println("From class Example-Constructor");
    }

    static int add(int a, int b){
        return a+b;
    }
}

public class Main {


    public void showImplementation(){

        System.out.println("Instance Method");
    }

    public static void main(String[] args) {

//        Main m = new Main();
//
//        FuncInterface f1 = () ->{
//            System.out.println("Implementing via Lambda");
//        };
//
//        // instance method
//        FuncInterface f2 = m::showImplementation;
//
//        f1.show();
//        f2.show();

        // constructor
        FuncInterface f3 =Example::new;

       f3.show();

        // static

//        BiFunction< Integer, Integer, Integer> f4 = Example::add;
//       int result =f4.apply(1, 2);
//        System.out.println(result);
//
//        IntBinaryOperator sum = (a, b) -> a + b;
//        System.out.println(  sum.applyAsInt(1, 9));

    }
}
