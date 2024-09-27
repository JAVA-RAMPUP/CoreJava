package CustomException;

class MyException extends Exception {

    public MyException(){
        super();
        System.out.println("MyException");
    }
}


class Employee {
    String name;
    int id;
}

public class Main {

    public static void main(String[] args) throws MyException{

//        try{
//            int a= 10/0;
//        }catch ( Exception e ){
//            System.out.println(e);
//          //  throw new MyException(e);
//        }

        try {
            throw new MyException();
            // Some code that may throw MyException
        } catch (MyException e) {

            System.out.println("Caught MyException: " + e.getMessage());
        }


    }
}
