class A extends Thread
{
    A()
    {
        super("My Thread");
        start();
    }
    public void run() 
    {
        try
        {
            for(int i=0;i<=10;i++)
            {
                System.out.println("Printing count "+i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {System.out.println("Helllllo");}
    }
}
class Thread2
{ public static void main(String[] args)
     {
    A obj =new A();
   try 
   {
        while(obj.isAlive())
        {
            System.out.println("Main thread will be alive till the child thread is live");
            Thread.sleep(1500);
        }
    } 
    catch (InterruptedException e) { System.out.println("HELLO");}
    System.out.println("Main thread's run is over");
    }
}