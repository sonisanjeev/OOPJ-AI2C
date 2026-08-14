public class StaticModifier {
    //static variable
   static String name="Ajay";
//static block
    static {
        System.out.println("Static block called");
    }
    public static void main(String[] args) {

        System.out.println("Name: " + name);
       
    }
}
