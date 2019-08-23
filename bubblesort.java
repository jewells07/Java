import java.util.*;
class bubblesort
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("How many elements do you want");
        int n,i,j,temp,pos;
        n =sc.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter"+n+" elements");
        
        for(i=0;i<n;i++) a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        { pos=i;
            for(j=i+1;j<n;j++)
            {
                if(a[pos]>a[j])
                {
                    temp=a[pos];
                    a[pos]=a[j];
                    a[j]=temp;
                }
            }
        }
       System.out.println("Sorted List is");
        for(i=0;i<n;i++) System.out.println(+a[i]);

    }
}