public class FinalModifier {

    final String name = "Ajay"; // final variable

    // to change the value of a final variable, you need to create a new instance of
    // the class and assign a new value to the variable in the constructor or a
    // method. However, once a final variable is assigned a value, it cannot be
    // changed.
    void updateName() {
        // name = "Vijay"; // Error: cannot assign a value to final variable name
    }

    // making any method final means that it cannot be overridden by subclasses.
    // This is useful when you want to ensure that the behavior of a method remains
    // consistent across all subclasses.
    final void DisplayName() {
        System.out.println("This is a final method."+ name);
    }
//to overcome the final method we can use the below code but it will give an error because we cannot override a final method
/*   class Subclass extends FinalModifier {
    void DisplayName() {
        System.out.println("This is a subclass method.");
    }
  } */

    public static void main(String[] args) {
        System.out.println("Final method called");
        FinalModifier obj = new FinalModifier();
        obj.updateName();
        obj.DisplayName();

    }

}
