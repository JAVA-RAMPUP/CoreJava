package Static_keywords;


class Employee{

    static String ceo="Musk";
    static  int num ;

    static {
num = 10/0;
    }

}




public class Main {

    void dcd(){

        Employee.ceo="cd";
         System.out.println(" ceo: " + Employee.ceo);
    }

    public static void main(String[] args) {

//        Employee.ceo="sharan";
       // System.out.println("dwd");

//        System.out.println(10/0);
//        System.out.println(Employee.ceo);
//        Main n= new Main();
//        n.dcd();
        System.out.println(Employee.num);
//        System.out.println(" ceo: " + Employee.ceo);
//       // Employee.main(new String[]{"c"});

    }
}
