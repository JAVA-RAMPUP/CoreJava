package OOPS;




//Composition

class Engine {
    public int engineNo ;
}

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    Engine engine = new Engine();

    public void getModel() {
        System.out.println("Model is "+this.model);
    }


}

public class Composition {
    public static void main(String[] args) {

        Car C1= new Car("Ford");
        C1.getModel();
        System.out.println(C1.engine);
        //C1=null;
    }

}
