package Reflections;

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

class Dog extends Animal {
    public String name;
    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }

}

class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

            Dog d1 = new Dog();
//Animal a1= new Animal();
            //Class obj = d1.getClass();

            Class<? extends Animal> obj = d1.getClass();

            String name = obj.getName();
            System.out.println("Name: " + name);

            int modifier = obj.getModifiers();

            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            var superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());



        Method[] methods = obj.getDeclaredMethods();

        for (Method m : methods) {

            System.out.println("Method Name: " + m.getName());

            int MethodModifier = m.getModifiers();
            System.out.println("Modifier: " + Modifier.toString(MethodModifier));

            System.out.println("Return Types: " + m.getReturnType());
            System.out.println(" ");
        }


        Field field1 = obj.getField("name");
        field1.set(d1, "labrador");

        // get the value of the field
        Object typeValue = field1.get(d1);
        System.out.println("Value: " + typeValue);

        // get the access modifier of the field type
        int field1Modifier = field1.getModifiers();

        // convert the modifier to String form
        String modifier1 = Modifier.toString(field1Modifier);
        System.out.println("Modifier: " + modifier1);
        System.out.println(" ");



    }
}