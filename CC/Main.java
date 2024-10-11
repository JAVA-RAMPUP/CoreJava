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

    public  T  void add(T a,T b){
        return a+b;
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
       // System.out.println(Main.a);

    }

}
