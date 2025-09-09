import java.lang.*;
class Fibonacci
{
	public static void main(String []args)
	{
		int a=0,b=1,c;
		System.out.print(a+"\t"+b+"\t");
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}

