package com.company;
import java.util.Scanner;
public class Problem_1 {
    public void bubbleSort(int a[])
    {
        int temp;
        for(int k=0;k<a.length;k++)
        {
            for(int j=k+1;j<a.length;j++)
            {
                if(a[k]>a[j])
                {
                    temp=a[k];
                    a[k]=a[j];
                    a[j]=temp;
                }
            }
        }


    }
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[8];
        System.out.println("Enter the Marks");
        for(int k=0;k<a.length;k++)
        {
            a[k]=sc.nextInt();
        }
        Problem_1 p1=new Problem_1();
        p1.bubbleSort(a);
        System.out.println("the marks which are in sorted manner as ");
        for(int k=0;k<a.length;k++)
        {
            System.out.print(a[k]+" ");
        }
        int sum1=0;
        for(int k=0;k<3;k++)
        {
            sum1=sum1+a[k];
        }
        int avg1=sum1/3;
        int sum2 = 0;
        for (int k = a.length - 1; k >= a.length - 3; k--) {
            sum2 = sum2 + a[k];
        }
        int avg2 = sum2 / 3;
        int diff;
        diff=avg2-avg1;
        System.out.println("the differencr between avg marks of top and bottom student is"+diff);




    }
}
