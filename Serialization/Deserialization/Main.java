package Serialization.Deserialization;
import Serialization.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Main extends Student{

    public static void main(String[] args)
    {
        Student student=null;
        try{
            FileInputStream fis = new FileInputStream("Assests/Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            student = (Student)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException ioe)
        {
            return;
        }catch(ClassNotFoundException e)
        {
            System.out.println("Student Class is not found.");
            return;
        }

        System.out.println("Student Name:"+student.getStuName());

    }
}