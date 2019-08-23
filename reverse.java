import java.util.Scanner;
class reverse
{
   public static void main(String args[])
   {
      int temp,num;
      int reverse =0;
      System.out.println("Input your number and press enter: ");
      
      Scanner in = new Scanner(System.in);
      
      num = in.nextInt();
      temp=num;
     
      while(temp%10==0) 
      {
          System.out.print("0");
          temp=temp/10;
      }
      while( temp != 0 )
      {
          reverse = reverse * 10 +temp%10;
          //reversetemp = reversetemp + temp%10;
          temp = temp/10;
      }
      
     
      if(reverse==num ) System.out.println("It is palindrome"); 
      System.out.println(reverse);
      
   }
}