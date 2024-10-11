package Interview;


@FunctionalInterface
interface  FuncIn{

    int add(int a , int b);
}

interface normalInterface{


    int add(int a, int b);
    void display();
    void show();

    String Hello();
}


public class Example {


    public static  int adding(int a ,int b ){
        return a+b;
    }

    public  int instanceadding(int a ,int b ){
        return a+b;
    }

    public static void main(String[] args) {


        FuncIn f = (a,b) -> {

            return a+b;
        };

   FuncIn f2= Example::adding;

   Example ex = new Example();
   FuncIn f3= ex::instanceadding;
   int sum= f3.add(3,4);
        System.out.println(sum);



        normalInterface ni= new normalInterface() {
            @Override
            public int add(int a, int b) {
                return 0;
            }

            @Override
            public void display() {

            }

            @Override
            public void show() {

            }

            @Override
            public String Hello() {
                return "";
            }
        };


    }

}
