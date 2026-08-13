//Topics: Class, Object, Instance Method and Variables,
// Constructor, Parameterized Constructor, 
// Copy Constructor, Constructor Overloading
public class ClassConstructor {
    // instance variables - non-static variables
    String name;
    int rollno;
    int id;
    // parameterized constructor
    ClassConstructor(String n, int r) {
        this.name = n;
        this.rollno = r;
    }
    //copy constructor
    ClassConstructor(ClassConstructor c) {
        this.name = c.name;
        this.rollno = c.rollno;
    }
    //constuctor overloading
    ClassConstructor(String n, int r, int i) {
        this.name = n;
        this.rollno = r;
        this.id = i;
    }
    // instance method
    public void Display() {
        System.out.println(" Name: " + name + " Rollno: " + rollno);
    }
    //constructor overloading method
    public void Display1() {
        System.out.println(" Name: " + name + " Rollno: " + rollno + " Id: " + id);
    }
    public static void main(String[] args) {
        //creating object of class
        ClassConstructor obj = new ClassConstructor("Ajay", 155);
        //copying object using copy constructor
        ClassConstructor obj1 = new ClassConstructor(obj);

        //constructor overloading
        ClassConstructor obj2 = new ClassConstructor("Ajay Singh", 165, 1);
        //accessing instance method using object
        obj.Display();
        obj1.Display();
        obj2.Display1();
        // display message on console
        System.out.print("Hello World");

    }
}
