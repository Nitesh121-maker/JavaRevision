class Vehicle{
    String brand;
    int speed;
    
    // Constructor
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
}

// Class Car
class Car extends Vehicle {
    
    // Car Constructor
    Car(String brand, int speed){
        super(brand, speed);
        this.brand = brand;
        this.speed = speed;
    }
    // Horn Method
    void Horn(String brand, int speed){
       System.out.println(brand+ " has beep beep  sound:");
       System.out.println(brand+ " runs on speed: "+speed);
    }
}

// Main Class
class Main {
     public static void main(String[] args){
          Car v = new Car("Ferari", 1000);
          v.Horn(v.brand,v.speed);
     }
}
