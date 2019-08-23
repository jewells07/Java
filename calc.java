import java.util.Scanner;

class calc
{
    public static void main(String[] args) {
        int a,b,opt,add,sub,mod,mul;
        double div,res=0;
        Scanner sc= new Scanner(System.in);
        char ch; 
        System.out.println("Enter two tempber");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the symbol from add,sub,mul,mod,div:");
        ch=sc.next().charAt(0);
        switch (ch) {
            case '+': 
                res= a+b;
                break;
            case '-':
            res= a-b;
                break;
            case '*':
            res= a*b;
                break;
            case '%':
            res=  a%b;
                break;
            case '/':
                if(b==0)
                 { System.out.println("not possible,re-enter the number");
                    b=sc.nextInt();
                    res =(double) a/b;
                }
                else {
                    res =(double) a/b;
                }
                break;
            default:
            System.out.println("you choose wrong option:");
                break;
        }
        System.out.println("Result ="+res);

    }
}