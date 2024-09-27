package Exceptions;

class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super(str);
    }
}

public class Main {

    public static void main(String[] args) throws UserDefinedException {

        try{

             int a =10/0;
        }
        catch (ArithmeticException e){
            System.out.println("handled");
           // throw new UserDefinedException("c");
        }
finally {
            System.out.println("finally");
        }
    }

}
