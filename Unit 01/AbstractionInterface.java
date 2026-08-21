interface Vehicle {
    // abstract method
    void start();

    // normal method
    default void stop() {
        System.out.println("Engine Stopped");
    }

    // static method
    static void breakdown() {
        System.out.println("Vehicle brokedown");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Vehicle Started");
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
        Vehicle.breakdown();

    }

}
