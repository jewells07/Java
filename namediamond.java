import java.util.*;
class namediamond
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=new String ();
        System.out.println("Enter the name:");
        str=sc.next();
        int i,j,s;
        char ch[]=str.toCharArray();
        int len=str.length();
        System.out.println(len);
        for( i=0;i<len;i++)
        {
            for(s=0;s<len-i;s++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }
        for(i=(len-1);i>0;i--)
        {
            for(s=(len-1);s>=i-1;s--)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(ch[j]+" ");
            }
            System.out.println();
        }        
    }
}