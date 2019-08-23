import java.util.*;
class findcapitalwords
{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String str= new String();
        int i,count=0;
        System.out.println("Enter the Word");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);
           
               if(ch>= 65 && ch<=91)
            {
                ++count;
            }
            
        }
        System.out.println("The capital ="+count);
    }
}