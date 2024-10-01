package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;


class Sample{

    @SuppressWarnings("deprecation")
    void display(){
        System.out.println("Hello World");
    }
}


class AgeComparator implements Comparator<Person> {


   public int compare(Person p1, Person p2) {

      return  Integer.compare(p1.age,p2.age);
   }

}

class NameComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {

       return p1.name.compareTo(p2.name);
    }

}




class Person implements Comparable<Person>{

    String name;
    int age;

    Person(String name, int age){
        this.name= name ;
        this.age=age;
    }

    public int compareTo( Person p){



        int result = Integer.compare(age,p.age);
        return result;
    }


    public void display(){

        System.out.println("name " + name+ " age " + age);
    }


}











public class Main {

    public static void main(String[] args) {

//        Sample s= new Sample();
//        s.display();
//
//
//
//        String[] strs= { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
//        StringJoiner sJ = new StringJoiner("*" , "(" ,")");
//
//        for( String str : strs){
//  sJ.add(str);
//        }
//
//        System.out.println(sJ);
//        System.out.println(strs.length);




        ArrayList<Person> personList = new ArrayList<Person>();

        personList.add(new Person("sharan" , 23));

        personList.add(new Person("Kamal" , 70));
        personList.add(new Person("John" , 10));

       // Collections.sort(personList);

//        for( Person p : personList ){
//            p.display();
//        }

        //Collections.sort(personList, new AgeComparator());

        Collections.sort(personList, new NameComparator());

        for( Person p : personList ){
            p.display();
        }









    }
}
