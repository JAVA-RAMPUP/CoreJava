package CC;


class sample{

    static int RandomNum;

    static {
       RandomNum = (int)(Math.random() * 100);
    }



}


class General<T>{

    T a;
    T b;

    public T add(T d){
        System.out.println(d);
        return d;
    }

    public  <S,U> int sum( U a){
        return 1;
    }



}

public class Main {

    static int a;

    static {
        a=10;
    }

    void display() {
        a=a+1;
        System.out.println(a);
    }

    public static void main(String[] args) {

        Main obj = new Main();
       obj.display();

     //  sample sample = new sample();

        System.out.println("ran"+sample.RandomNum);
        System.out.println("ran"+sample.RandomNum);


       // System.out.println(Main.a);

        double a=10;
        int as= (int)a;

    }

}
