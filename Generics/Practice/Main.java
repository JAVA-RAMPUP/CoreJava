package Generics.Practice;


class  Gen<K,V>{

    K key;
    V value;

    public Gen(K key , V value){

        this.key=key;
        this.value=value;
    }

    public void swap(){

        V temp = value;

        value= (V) key;

        key = (K) temp ;
    }

    public void display(){

        System.out.println("Key :" + key + " value :" + value);
    }

    public void show(      ){}


}


class E2{


    public static <T> void swap( T[] array , int index1 , int index2){
        System.out.println( "index " + index1 + " is " + array[index1] + " index " + index2+" is " + array[index2]);

           T temp =array[index1];
           array[index1]=array[index2];
           array[index2]=temp;

        System.out.println( "index " + index1 + " is " + array[index1] + " index " + index2+" is " + array[index2]);

    }
}


//class e3 implements Comparable{
//
//
//
//    public <T> void Comparable(){
//
//
//    }
//
//
//}





public class Main {

    public static void main(String[] args) {

        Gen<Integer, String> pair = new Gen<Integer,String>(8,"Eight");
        pair.swap();
        pair.display();


        String[] strArr = { "a", "b", "c", "d", "e", "f" };

        E2.swap(strArr, 4,3);




    }

}
