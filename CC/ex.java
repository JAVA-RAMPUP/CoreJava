package CC;


class myex extends Exception{

    myex(){
        super("custom");
    }

}

public class ex {


    public static void main(String[] args) {
        try{

          //  int a=10/0;
            throw new myex();

        }
        catch (myex myex){
            System.out.println(myex.getMessage());

        }
    }

}
