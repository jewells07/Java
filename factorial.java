import java.util.*;
class factorial
{static int fac;
    int fact(int n)
    { 
        if(n==0) return 1;
        fac=n*fact(n-1);
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        fact aa=new fact();
        aa.fact(a);
        System.out.println(fac);
        
    }
}