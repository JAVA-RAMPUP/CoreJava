package Collections.ComparableInterface;

import java.util.*;
class Stud {
    int rollno;
    String name;
    int age;
    Stud(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}


class AgeComparator implements Comparator<Stud>{
    public int compare(Stud s1,Stud s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Stud>{
    public int compare(Stud s1,Stud s2){
        return s1.name.compareTo(s2.name);
    }
}

class Test{
    public static void main(String[] args){
        ArrayList<Stud> al=new ArrayList<>();
        al.add(new Stud(101,"Vijay",23));
        al.add(new Stud(106,"Ajay",27));
        al.add(new Stud(105,"Jai",21));

        System.out.println("Sorting by Name");
//Using NameComparator
        Collections.sort(al,new NameComparator());
        for(Stud st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by Age");
//Using AgeComparator
        Collections.sort(al,new AgeComparator());

        for(Stud st: al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
