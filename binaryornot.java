import java.util.Scanner;

public class binaryornot
 {
	
	public static void main(String[] args) 
	{
        int temp,i,index=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number");
        temp=sc.nextInt();
        int rem[]=new int[100];
        System.out.println("the binary vale of "+temp+"=");
        while(temp>0)
        {
            rem[index] = temp %2;
            temp=temp/2;
            index++;
        }
       
        for(i=(index-1);i>=0;i--)
        {
            System.out.print(rem[i]);
        }
    }
}
	 