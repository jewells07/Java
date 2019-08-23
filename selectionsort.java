import java.util.*;
class selectionsort
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        int n,i,j,temp,pos;
        System.out.println("How many elements do you want");
        n =sc.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter"+n+" elements");
        for(i=0;i<n;i++) a[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            pos=i;
            for(j=i+1;j<n;j++)
            {
                if(a[pos]>a[j]) pos=j; 
                
            } 
                temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
                
            
        }
        System.out.println("Sorted List is");
        for(i=0;i<n;i++) System.out.println(a[i]);
    }
}