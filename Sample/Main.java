package Sample;



interface myFunctionaInterface{

    void display();
}

public class Main {


    public  void mainDisplay(){
        System.out.println("From Main method");
    }

    public static void main(String[] args) {


        Main mainObj= new Main();
        myFunctionaInterface fi = mainObj::mainDisplay;
        fi.display();


    }

}
