import java.util.Scanner;

public class ScannerExmaple {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("My name and age is  " + name + age);

    }
    
}
