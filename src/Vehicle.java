public class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    public void start(){
        System.out.println("Vehicle started");
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String color, int speed, boolean hasSidecar) {
        super(color, speed);
        this.hasSidecar = hasSidecar;
    }
    @Override
    public void start(){
         super.start();
        System.out.println( "Motorcycle started  ");
    }

}

 class Truck extends Vehicle {

    int cargoCapacity;

    public Truck(String color, int speed, int cargoCapacity) {
        super(color, speed);
        this.cargoCapacity = speed;
    }

    @Override
     public void start(){
        super.start();
        System.out.println( "Truck started");
    }
 }