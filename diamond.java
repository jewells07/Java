import java.util.Scanner;

public class diamond
 {
	
	public static void main(String[] args) 
	{
        int mid,temp,s,j,i;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the tempber of lines(odd tempber only) ");
        temp=sc.nextInt();
        mid=(temp+1)/2;
      //upper 
        for (i=1;i<=mid;i++)
        {
            for(s=1;s<=(mid-i);s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(i*2-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for(i=1;i<=(mid-1);i++)
        {
            for(s=1;s<=i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*(mid-i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}