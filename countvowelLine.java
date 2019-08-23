import java.util.*;
class countvowelLine
{   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str =new String();
        
        while(true)
     {
         int x,A=0,E=0,I=0,O=0,U=0;
        System.out.println("Enter a line:");
        str=sc.nextLine();
        if(str.equals("quit"))
        {  
            System.out.println("end");
            break;
        }
       else
        {

            for(x=0;x<str.length();x++)
            {
               char ch=str.charAt(x);
               switch (ch) 
               {
                   case 'a':case'A': A++;                      
                       break;
                   case 'e':case 'E':  E++;
                       break;
                   case 'i': case 'I': I++;
                       break;
                   case 'u': case 'U': U++;
                       break;
                   case 'o': case 'O':O++;              
                       break;
               }
            }  
            System.out.println("A="+A+" E="+E+" I="+I+" O="+O+" U="+U); 
            System.out.println("Total vowel="+(A+E+I+O+U));  
        }
      }
    }    
}