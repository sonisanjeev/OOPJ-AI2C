    import java.lang.Exception;
/*     
    public class ExceptionExp {

    int num1 = 10;
    int num2 = 0;
    int num3 = 2;

    void add() {
        try {
            int add = num1 + num2;
            System.out.println("addition" + add);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    void div() {
        try {
            int div = num1 / num2;
            System.out.println(div);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        catch(Exception e){
            System.out.println("Exection error" + e);
        }
        finally{
            System.out.println("Final done");
        }
     
    }

    public static void main(String[] args) {

        System.out.println("Main method");
        ExceptionExp obj = new ExceptionExp();
        
        obj.div();
        obj.add();
    }
}  */
//==================multi catch======
/* public class MultipleCatchBlock1 {  
  public static void main(String[] args) {  
             try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
}  */
//=======================try cath finally===========

public class MyMainException {
public static void main(String[] args) {
int a[]=new int[4];
try
{
a[0]=12/0;
System.out.println(a[6]);
}
catch(ArithmeticException e)
{
System.out.println("Aritmetic Exception"+e.getMessage());
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index out of bound"+e.getMessage());
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("Finally block executed");
}
System.out.println("outside Finally block executed");
}
}
