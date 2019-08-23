import java.util.*;
class countvowels
{
    public static void main(String[] args) {
        int i,vowels=0,consonants=0,space=0,digits=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabets & tempber");
        String str= new String();
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
           char ch=str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             {
                 vowels++;
             }
             else if(ch >= 'a'&& ch <= 'z')
              { 
                ++consonants;
              }
              else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
             else if(ch==' ')
             {
                 space++;
             }
             
        }
        System.out.println("The vowels ="+vowels);
        System.out.println("The consonants ="+consonants);
        System.out.println("The spaces ="+space);
        System.out.println("The digits ="+digits);

    }
}