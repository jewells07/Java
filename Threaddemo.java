class hi extends Thread// if you want multiple inheritance then you can write(implements Runnable) instead of extends Thread
{
   public void run()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("Hi");
       try{Thread.sleep(500);} catch(Exception E){}//wait for 1/2 sec
        }
    }
}
class hellThreado extends 
{
   public void run()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println("Hello");
        try{Thread.sleep(500);} catch(Exception E){}//wait for 1/2 sec
        }
    }
}
class Threaddemo
{
    public static void main(String[] args) {
    hi obj1=new hi();
    hello obj2=new hello();
   
    obj1.start();
    try{Thread.sleep(10);} catch(Exception E){}//wait for 10mili sec
    obj2.start();
    
    
    }
}