public class StaticModifier {
    static int a = 10; // Static variable
    int b = 20; // non-Static variable
    static int c; // static instance variable

    // static block to initialize static variable b
    static {
        c = a * 30;
        System.out.println("Static method called. Value of a: " + a);
    }
    // non static method
    void display(){
        System.out.println("Value of b is " + b);
    }

    public static void main(String[] args) {
        StaticModifier obj = new StaticModifier();
  obj.display();
        System.out.println("Value of a: " + a);
        // need to access using object because defined varaible is non static
        System.out.println("Value of b " + obj.b);

        System.out.println("Result is " + c);
    }
}