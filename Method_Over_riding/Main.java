package Method_Over_riding;


class  Parent{


    void show(){
        System.out.println("Parent");
    }


        }

class Child extends Parent{

    @Override
    void show(){
        System.out.println("Child");
    }
}



public class Main {


    public static void main(String[] args) {

        // reference = Object

        Parent p = new Child();
     //  parent reference to child object

        p.show(); // invoke child's method

        Parent p1 = new Parent();

        //  parent reference to parent object
        p1.show(); // invoke parents 's method

        Child c = new Child();

        c.show();


    //  Child c = new Parent(); // not works
     // c.show();

    }

}
