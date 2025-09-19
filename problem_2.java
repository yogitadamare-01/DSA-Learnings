package com.company;

import java.util.Scanner;

public class problem_2 {

        static void bubbleSort(int a[])
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
        static int binarySearch(int a[],int left,int right,int x)
        {
            int mid=0;
            while(left<=right)
            {
                mid=(left+right)/2;
                if (a[mid] == x)
                {
                    return mid;
                }
                else if(a[mid]>x)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;

                }

            }
            return -1;
        }

        public static void main (String[]args)
        {
            Scanner sc= new Scanner(System.in);
            int a[]=new int[7];
            System.out.println("enter the a flight numbers ");
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();

            }
            System.out.println("Flight nos. are");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+"\t");
            }
            bubbleSort(a);
            System.out.println("\n enter the sorted flight nos.are");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(+a[i]+"\t");
            }
            System.out.println("\n enter the flight which we have to search is");
            int x=sc.nextInt();
            int n= a.length;
            int result=binarySearch(a,0,n-1,x);
            if(result==-1)
            {
                System.out.println(x + "flight no. is not found");
            }
            else
            {
                System.out.println(x + "\nflight no. is  found");
            }


        }


    }


