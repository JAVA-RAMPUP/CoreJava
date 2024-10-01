package Exceptions;

class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super(str);
        System.out.println("custom exception"  + str);
    }


}

public class Main {

    public static void main(String[] args)  {

        try{

         //    int a =10/0;
            throw new UserDefinedException("c");

        }
        catch (UserDefinedException e){

            System.out.println(e.getMessage());
            //System.out.println("handled");
        }
finally {
            System.out.println("finally");
        }
    }

}
