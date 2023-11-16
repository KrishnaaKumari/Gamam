package day5;

public class Node 
{
	int data ;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null ;
	}

}

class Solution
{
	Node head ;
	Node tail ;
	public Node add(int d)
	{
		Node newnode= new Node(d);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			tail.next=null;
			return head;
		}
		
		tail.next=newnode;
		tail=tail.next ;
		
		return head;
	}
	
	public void printLinkedList()
	{
		if(head==null)
		{
			System.out.println("Empty linkedlist");
			return ;
		}
		Node temp=head ;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next ;
		}
		System.out.println();
	}
	
	public void printLinkedList(Node head)
	{
		if(head==null)
		{
			System.out.println("Empty linkedlist");
			return ;
		}
		Node temp=head ;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next ;
		}
		System.out.println();
	}
}
