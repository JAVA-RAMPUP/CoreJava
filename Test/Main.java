package Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class  Employee{

    String firstName;
    String lastName;
    int age;
    String manager;
    Employee( String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge( int age){
        this.age = age;
    }

}




public class Main {

    public static void main(String[] args) {


        ArrayList<Employee> arrEmployee = new ArrayList<Employee>();

        arrEmployee.add(  new Employee( "Sharan" , "v"));
        arrEmployee.add(  new Employee( "Dinesh" , "s"));
        System.out.println(arrEmployee.stream());

        for( Employee emp : arrEmployee ){

            System.out.println(emp.manager.length());
            System.out.println( " age" +emp.age);
            System.out.println( emp.manager);

             Optional<Integer> OptionalLength ;

        }



        arrEmployee.stream().forEach( emp -> { emp.setAge(23);});


        Employee employee1 = new Employee( "Kumar" , "s");

        arrEmployee.add(employee1);

//        for( Employee emp : arrEmployee ){
//
//            System.out.println( " age" +emp.age);
//
//        }

        Stream<Employee> empFilteredStream= arrEmployee.stream().filter(emp -> { return emp.age >= 18;}) ;



        List<Employee> empFilteredList= arrEmployee.stream().filter(emp -> { return emp.age >= 18;}).toList();


       List<String> empNames = arrEmployee.stream().map(employee -> {

            return employee.firstName+employee.lastName ;
        }).toList();

        System.out.println( "em "+empNames);
        //arrEmployee.stream().map()





//        arrEmployee.stream().forEach( employee -> {
//             employee.age=3;
//        });




        String[]  strArr= { "Sharan" , "Cei"};

        Arrays.asList( strArr);

        ArrayList<String> arrayList = new ArrayList<String>( Arrays.asList(strArr));

       // Arrays.stream(strArr).forEach(System.out::println);

        ArrayList<String>  arrList = new ArrayList<String>();

        for( String str : strArr){

            arrList.add(str);
        }

    }

}
