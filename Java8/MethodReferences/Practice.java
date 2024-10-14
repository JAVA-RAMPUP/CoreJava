package Java8.MethodReferences;


interface sample {

    int add(int a, int b);

}

public class Practice {


    int practiced(int a, int b) {
        return a + b;
    }

    static int spracticed(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {

        Practice p = new Practice();
        sample s =p::practiced;
        sample s2= Practice::spracticed;
    }

}
