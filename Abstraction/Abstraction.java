package Abstraction;

class Example1{
    public void display1(){
        System.out.println("display1 method");
    }
}
abstract class Example2{
    public void display2(){
        System.out.println("display2 method");
    }
}

abstract class Example3 extends Example1{
    abstract void display3();
}


abstract class Example4 extends Example2{
    abstract void display3();
}



public class Abstraction {
}
