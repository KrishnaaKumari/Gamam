package day6;

public class ListNode {
	int data;
	ListNode next;
	ListNode (int d)
	{
		data=d;
		next=null;
	}

}

class Solution
{
	ListNode head;
	ListNode tail;
	public ListNode add(int d)
	{
		ListNode newnode= new ListNode(d);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
			return head ;
		}
		
		tail.next=newnode;
		tail=tail.next;
		return head;		
	}
	public void print()
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void print(ListNode head)
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
