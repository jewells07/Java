class box
{
    private int l,b,h;
    public void setdimension(int l,int b,int h)
    {
        this.l=l; this.b=b; this.h=h;
        System.out.println(l+" "+b+" "+h+" ");
    }
   

}
class thiss
{
    public static void main(String[] args) {
        box t1=new box();
        t1.setdimension(10,20,30);
        //t1.sendthiss();
    }
}