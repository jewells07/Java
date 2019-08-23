
import java.util.Scanner;
public class sum
{
    public static void main(String[] args) 
    {
        int i,size,s=0;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter how many elements you want:");
        size = input.nextInt();
        int a[]= new int [size];

        System.out.println("Enter the tempber:");
        for(i=0;i<size;i++)
        {
           a[i]= input.nextInt();
        }
        for(i=0;i<size;i++)
        {
           s=s+a[i];
        }
        System.out.println("Sum is"+s);
    }
}