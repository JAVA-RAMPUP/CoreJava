package OOPS;


class Employee {
     String name;
     int id;
    static String companyName = "CEI";
    static int employeeCount = 0;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public void displayDetails() {
        System.out.print("Name: " + name + ",Company: "+ companyName + ",ID: " + id);
    }
}


class  FullTimeEmployee extends Employee {

    int salary;
    public FullTimeEmployee(String name, int salary,int id) {
        super(name,id);
        this.salary=salary;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println(" Salary: " + salary);
    }

}

class PartTimeEmployee extends Employee {

    int salary;
    public PartTimeEmployee(String name, int salary,int id) {
        super(name,id);
        this.salary=salary;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println(" Salary: " + salary);
    }
}


class Manager extends FullTimeEmployee{

    int salary;
    public Manager(String name, int salary,int id) {
        super(name,salary,id);
        this.salary=salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}




public class Inheritance {
    public static void main(String[] args) {
        FullTimeEmployee sharan = new FullTimeEmployee("Sharan",50000,1);
        PartTimeEmployee Danish = new PartTimeEmployee("Danish",25000,5);
        Manager manager = new Manager("Manager",90000,1);
        sharan.displayDetails();
        Danish.displayDetails();
        manager.displayDetails();
        System.out.println(Employee.companyName);

        System.out.println(sharan.companyName);


    }
}



