class QueueDemo
{
	int maxsize;
	int count;
	int queueA[];
	int front;
	int rear;
	QueueDemo(int size)
	{
		maxsize=size;
		queueA=new int [maxsize];
		front=0;
		rear=-1;
		count=0;
	}
	public void enqueue(int val)
	{
		if(rear==maxsize-1)
		{
			System.out.println("the queue is full");
		}
		else
		{
			rear=(rear+1)%maxsize;
		
			queueA[rear]=val;
			System.out.println(val+"is inserted in queue");
			count++;
		}
	}
	public void dequeue()
	{
		if(rear==-1)
		{
			System.out.println("the queue is empty");
		}
		else
		{
			System.out.println(queueA[front]+"is removed from queue");
			front=(front+1)%maxsize;
			count--;
		}
	}
	public void display()
	{
	if(count==0)
	{
		System.out.println("The queue is empty");
	}
	else
	{
		System.out.println("The queue elements are");
		
		for(int i=0;i<count;i++)
		
		{
			int index=(front+i)%maxsize;
		 	System.out.print(queueA[index]+"\t");
		 	
		 }
	}
	
	}
}
class Queue
{
	public static void main(String []args)
	{
		QueueDemo q1=new QueueDemo(5);
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.enqueue(70);
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.display();
	}
}	
			
			
			
			
			
			
			
			
			
			
			
			
