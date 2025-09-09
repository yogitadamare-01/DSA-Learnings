class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Linkedlist
{
	Node head;
	public void insert(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public void show()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("Null");
	}
}
class Sample1
{
	public static void main(String []args)
	{
		System.out.println("The given linkedlist is");
		Linkedlist l1=new Linkedlist();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.show();
	}
}
		
