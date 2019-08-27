class A extends Thread //implements Runnable
{
    A()
    {
    Thread t=new Thread(this,"demo");
    t.start();
    }
    public void run()
    {
        try{
       for(int i=0;i<=10;i++) 
        {
            if(i%2==0)
            {
                System.out.println("Even"+i);
            Thread.sleep(1000);//1 second
            }
            else System.out.println("Odd"+i);
        }
            } catch(Exception e){}
    }
}
class Thread1 extends Thread
{
    public static void main(String[] args) {
        A obj=new A();
    }
}