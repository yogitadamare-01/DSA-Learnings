package com.company;

 class StackDemo {
     int maxsize;
     int stackA[];
     int top;
     StackDemo(int size)
     {
         maxsize=size;
         stackA=new int[maxsize];
         top=-1;

     }
     public void push(int value)
     {
         if(top==maxsize-1)
         {
             System.out.println("the stack is overflow");

         }
         else
         {
             stackA[++top]=value;
             System.out.println(value+"is inserted in the stack");

         }
     }
     public int pop()
     {
         if(top==-1)
         {
             System.out.println("The stack is underflow condition");
             return 0;
         }
         else
         {
             System.out.println(stackA[top]+"is deleted from the stack");
             return stackA[top--];
         }
     }
     public void display()
     {
         if(top==-1)
         {
             System.out.println("The stack is empty");
         }
         else
         {
            for(int i=0;i<=top;i++)
            {
                System.out.println(stackA[i]);
            }
         }
     }
     public int getmin()
     {
         int min=stackA[0];
         for(int i=0;i<=top;i++)
         {
             if(min>=stackA[i])
             {
                 min=stackA[i];
             }
         }
         return min;
     }
     public int getmax()
     {
         int max=stackA[0];
         for(int i=0;i<=top;i++)
         {
             if(max<=stackA[i])
             {
                 max=stackA[i];
             }
         }
         return max;
     }
}
class Stack
{
    public static void main(String []args)
    {
        StackDemo s1=new StackDemo(5);
        s1.push(8);
        s1.push(0);
        s1.push(11);
        s1.push(2);
        s1.push(5);
        s1.push(4);
        s1.pop();
        s1.pop();
        s1.display();
        System.out.println("The minimum value in the stack is:"+s1.getmin());
        System.out.println("The maximum value in the stack is:"+s1.getmax());
    }
}

