import java.util.*;
class array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,sum=0;
        System.out.println("How many element you want:");
        a=sc.nextInt();
        int n[]=new int[a];
        for(int i=0;i<a;i++)
        {
            n[i]=sc.nextInt();
            sum=sum+n[i];
        }
        System.out.println("The Total="+sum);
    }
}