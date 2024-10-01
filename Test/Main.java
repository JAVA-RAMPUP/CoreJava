package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;


class  Employee{

    String firstName;
    String lastName;
    int age;

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

        arrEmployee.stream().forEach( emp -> { emp.setAge(23);});


        List<Employee> empFilteredList= arrEmployee.stream().filter( emp -> { return emp.age >= 18;}) ;




        arrEmployee.stream().map(  employee -> {
            System.out.println(employee.firstName + " " + employee.lastName);
            return 3 ;
        });

        System.out.println(arrEmployee);
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
