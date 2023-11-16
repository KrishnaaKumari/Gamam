package day5;

public class ReverseLinkedList {
	
	public static Node reverseLinkedList(Node head)
	{
		if(head==null)
			return null ;
		
		Node curr=head;
		Node prev=null;
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next ;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s= new Solution();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.printLinkedList();
		Node ans=reverseLinkedList(s.head);
		s.printLinkedList(ans);
	}

}
