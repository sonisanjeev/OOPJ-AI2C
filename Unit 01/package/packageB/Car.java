package packageB;

import packageA.Vehicle;

public class Car extends Vehicle {

    public void show() {

        // Accessing protected variable
        System.out.println(brand);

        // Accessing protected method
        displayBrand();
    }

   

    public static void main(String[] args) {
        Car car = new Car();
        car.show();
    }
}

/*  run command: 
    javac -d . packageA\Vehicle.java packageB\Car.java
    java packageB.Car  */