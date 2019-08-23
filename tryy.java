import java.util.*;
class tryy
{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner (System.in);
         float a,b,c=0;
        a=sc.nextFloat();
        b=sc.nextFloat();
        try
        { 
            c=a/b;
            if(c<10) throw new Exception("hello");
        }
        catch (ArithmeticException e) {
            System.out.println("It cannot divide by zero ");
        }
        catch(Exception e)
        {
            System.out.println("It is less than 10");
        }
        finally{ 
            System.out.println(c);
            System.out.println("BYE");
        }
    }
}