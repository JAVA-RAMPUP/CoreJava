package OOPS;




//Composition

class Engine {
    public int engineNo ;
    Engine(int engineNo){
        this.engineNo = engineNo ;
    }
    public int getEngineNo(){
        return engineNo;
    }
}

class Car {
    private String model;
    Engine engine;
    public Car(String model,int engineNo) {
        this.model = model;
         engine = new Engine(engineNo);

    }


    public void getModel() {
        System.out.println("Model is "+this.model);
    }


}

public class Composition {
    public static void main(String[] args) {

        Car C1= new Car("Ford" ,3);
        C1.getModel();
        System.out.println(C1.engine.getEngineNo());
        //C1=null;
    }

}
