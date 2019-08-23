class constructor
{
    private int l,b,h;
    public cons()
    {
        l=10;b=20;h=30;
    }
    public cons(int L, int B, int H)
    {
        l=L; b=B; h=H;
    }
    public void print()
    {
        System.out.println(l+" "+b+" "+h);
    }
    public static void main(String[] args) 
    {
        cons obj=new cons();
        cons obj2=new cons(20,10,15);
        obj.print();
        obj2.print();
    }
}