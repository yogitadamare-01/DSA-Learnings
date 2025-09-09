import java.lang.*;
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int flag=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=1;
			}
			
			
		}
		if(flag==1)
		{
			System.out.println("Entered number is not a prime number."+a);
		}
		else
		{
			System.out.println("Entered number is a prime number."+a);
		}
	}
	
}
