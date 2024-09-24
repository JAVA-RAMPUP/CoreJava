package Static_keywords;



// Final class
final class CompanyInfo {
    private static final String companyName = "CEI";
    private static final String location = "Chennai";

    public static String getCompanyName() {
        return companyName;
    }

    public static String getLocation() {
        return location;
    }
}


class Employee{

    static String ceo="Musk";// method area

    static  int count=0 ;

    String name="sharan"; //heap area

    static {
        count++;
    }

    public static void showCeo(){
        System.out.println(ceo);
    }

    //cannot be override by subclasses
    public final void showEmployeePolicies(){
        System.out.println( "Employee Policies are ......"  );
    }


}

public class Main {


    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }





        Employee empOne = new Employee();

       // System.out.println( empOne.name);
        empOne.name= "desing";

        Employee empTwo = new Employee();

        Employee.ceo = "Elon";

        System.out.println( "CEO" +Employee.ceo);

        System.out.println(empOne.ceo );

        System.out.println( empTwo.name);






//        Sharan.name="Sharan";
//
//        Employee.ceo="sharan";
//
//        System.out.println(Employee.ceo);
//
//        System.out.println(Employee.count);
//
//        Employee.showCeo();

    }
}
