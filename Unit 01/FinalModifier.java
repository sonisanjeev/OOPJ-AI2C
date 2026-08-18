public class FinalModifier {

    final String name = "Ajay"; // final variable
    void updateName() {
        // name = "Vijay"; // Error: cannot assign a value to final variable name
       System.out.println(" Updated Name " + name);
    }

    public static void main(String[] args) {
        System.out.println("Final method called");
        FinalModifier obj = new FinalModifier();
        obj.updateName();

    }

}
