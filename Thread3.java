import java.util.*;
class MyThread extends Thread { 

    public MyThread (String s) { 
      super(s); 
    }
  
    public void run() { 
      System.out.println("Run: "+ getName()); 
    } 
  }
  
  
   class Thread3 {
    public static void main (String arg[]) { 
  
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of Threads you want to create: ");
      int n = input.nextInt();
      System.out.println("You selected "+ n +" Threads");
  
      for (int x=0; x<n; x++)
      {
          MyThread temp= new MyThread("Thread #" + x);
          temp.start();
          System.out.println("Started Thread:" + x);
      }
  }
  }