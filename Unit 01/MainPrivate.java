// Private access modifier is used to restrict access to the members of a class. Members declared as private can only be accessed within the same class. This is useful for encapsulation, which is a fundamental principle of object-oriented programming.

class StudentDetails{
    private String name;
    // private int age;

 /*    private void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    } */

    public void setName(String name){
        this.name = name;
    }
      public String getName(){
        return name;
    }

   /*  public void setAge(int age){
        this.age = age; 
    }
  
    public int getAge(){
        return age;
    } */
}

public class MainPrivate {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        // student.setAge(12);
        student.setName("John Doe");
        System.out.println("Name: " + student.getName());
        // System.out.println("Age: " + student.getAge());
        // student.name = "John Doe";
        // student.age = 20;
        // student.displayDetails();

}

}