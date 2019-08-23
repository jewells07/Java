interface MyInterface
{
   public void method1();
   public void method2();
}
interface MyInterface1
{
   //public void method2();
}
class inter implements MyInterface,MyInterface1
{
   
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new inter();
    MyInterface1 obj1 = new inter();
    obj.method1();
    obj1.method2();
    
   }
}