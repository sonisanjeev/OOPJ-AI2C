package packageA;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.displayBrand(); // Accessing protected method within the same package
    }
}

/* run commmand: 
    javac -d . packageA\Vehicle.java packageA\Main.java
    java packageA.Main */