
package Abstraction;

interface Animal {
    default void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat();
}

interface Bird {
    default void sound() {
        System.out.println("Bird makes a sound");
    }

    void eat();

}

class Bat implements Animal, Bird {

    @Override
    public void sound() {
        Animal.super.sound(); //calling default method of Animal
        Bird.super.sound(); //calling default method of Bird
    }

   public void eat(){
        System.out.println("Bat is eating");
    }

}

public class Interface {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.sound();

        bat = null; // GC will delete it automatically
    }
}
