package Generics;


class  Bucket<T extends Number>{

    private T item;

    public Bucket(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}

class PairBucket<K,V>{

  private   K key;
  private   V value;
  PairBucket<K,V> next;

  public void add(K key, V value) {
      this.key = key;
      this.value = value;
      next=null;
  }

public V getValue(){
      return value;
}



}



public class Main {

    public static void main(String[] args) {

        //Integer Bucket
        Bucket<Integer> intBucket = new Bucket<Integer>(4);
        System.out.println(intBucket.getItem());

        Bucket<Float> doubleBucketBucket = new Bucket<Float>(4.9f);


        //String bucket
       // Bucket<String> Strbucket = new Bucket<String>("sharan");
      //  System.out.println(Strbucket.getItem());

        PairBucket<Integer,String> pairBucket= new PairBucket<Integer,String>();
        pairBucket.add(1,"a");
        pairBucket.add(2,"b");
        System.out.println( pairBucket.getValue());

    }
}

