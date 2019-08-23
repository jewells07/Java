import java.util.Scanner;

public class evenodd {
	//private static Scanner sc;
	public static void main(String[] args) 
	{
        int Size, i, EvenSum = 0, OddSum = 0;
        Scanner sc = new Scanner (System.in);
		
	 
		System.out.print(" Please Enter tempber of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
			else
			{
				OddSum = OddSum + a[i]; 
			}
		}		
		System.out.println("\n The Sum of Even tempbers in this Array = " + EvenSum);
		System.out.println(" The Sum of Odd tempbers in this Array = " + OddSum);
	}
}
