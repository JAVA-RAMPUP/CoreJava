package Interview;





class OuterClass {


    class InnerClass {

        void show(){
            System.out.println("Inside Inner Class");
        }
    }

    static class  staticInnerClass{

        void show(){
            System.out.println("Inside Static Inner Class");
        }
    }

}


public class InnerClassExample {


    public static void main(String[] args) {

       // OuterClass.InnerClass c = new OuterClass().new InnerClass();

    OuterClass oc = new OuterClass();

        OuterClass.InnerClass ic= oc.new InnerClass();
    ic.show();






    }


}
