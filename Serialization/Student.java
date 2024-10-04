package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable {
    public int stuRollNum;
    public int stuAge;
    public String stuName;
    public transient String stuAddress;
    public transient int stuHeight;
    public Student(){}
    public Student(int roll, int age, String name,
                   String address, int height) {
        this.stuRollNum = roll;
        this.stuAge = age;
        this.stuName = name;
        this.stuAddress = address;
        this.stuHeight = height;
    }
    public String getStuName() {
        return stuName;
    }


    public static void main(String[] args)
    {
        Student obj = new Student(101, 25, "Sharan", "Chennai", 6);
        try{
            FileOutputStream fos = new FileOutputStream("Assests/Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("Serialzation Done!!");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}

