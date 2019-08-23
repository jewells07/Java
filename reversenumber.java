import java.util.*;
/*
class reversenumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your choice");
        int n=sc.nextInt();
        StringBuffer str = new StringBuffer(String.valueOf(n));
        str.reverse();
        n = Integer.parseInt(str.toString());
        System.out.println("THE REVERSE OF NUMBER: "+n);
    }
}*/
class re 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your choice");
        String n=sc.nextLine();
        StringBuffer str = new StringBuffer(n);
        str.reverse();
       
        System.out.println("THE REVERSE OF NUMBER: "+str);
    }
}