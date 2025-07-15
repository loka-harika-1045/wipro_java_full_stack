public class Abstractionusinginterface {
    public static void main(String[] args) {
        Vehicle car = new Car();  
        car.start();              
    }
}
interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}
