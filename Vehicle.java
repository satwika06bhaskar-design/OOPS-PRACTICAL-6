package tutorial;
class Vehi {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehi {
    void fuelType() {
        System.out.println("Car uses petrol or diesel");
    }
}

public class Vehicle {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
     Car myCar = new Car();
          myCar.move();      
          myCar.fuelType(); 
  }

}