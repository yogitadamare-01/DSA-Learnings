import java.util.Scanner;
public class QuickSort
{   
	
	static int partition(int a[],int l, int h)
	{
		int pivot;
		
		pivot=a[l];
	
		int i=l;
		int j=h+1;
		while(i<j)
		{
			do
			{
				i++;
			}while(i<=h && a[i]<=pivot);
			
			do
			{
				j--;
			}while(j>=l && a[j]>pivot);
			if(i<j)
			{
			 	int temp=a[i];
			 	a[i]=a[j];
			 	a[j]=temp;
			 }
		 }
		 int temp=a[l];
		 a[l]=a[j];
		 a[j]=temp;
		return j;
	}
	
	static void quickSort(int a[],int l,int h)
	{
		if(l<h)
		{
			int j=partition(a,l,h);
			quickSort(a,l, j-1);
			quickSort(a,j+1,h);
		}                                                                                                                                                                                                                                                                           
	}

	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int n=a.length-1;
		System.out.println("Enter the elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("the given array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
		quickSort(a,0,n);
		System.out.println("the sorted array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	} 
}                                
