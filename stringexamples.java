class stringexamples
{
    public String toString()
    {
        return "HEllo"+"world";
    }
    public static void main(String[] args) {
        stringexamples b=new stringexamples();
        String ss="OHH "+b;
        System.out.println(ss);

        char ch[]={'j','a','v','a'};
        byte ascii[]={65,66,67,68};
        String s=new String(ascii);
        String s1=new String(ch);
        String s2=new String(s1);
    

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println("JAVA".equalsIgnoreCase(s1));
        System.out.println("JAVA".CompareTo(s1));
        System.out.println("jewells".length());
    
        String w="This is Example:";
        char buf[]= new char[11];
        w.getChars(0,11,buf,0);
        System.out.println(buf);
        System.out.println(w);
    }
}