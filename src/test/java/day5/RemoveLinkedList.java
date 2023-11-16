package day5;

public class RemoveLinkedList {

	public static Node removeNode(Node head,int val)
	{
		if(head==null)
			return null ;
		
		while(head.data==val)
		{
			head=head.next ;
			if(head==null)
				return null ;
		}
		
		Node temp=head ;
		while(temp!=null && temp.next!=null)
		{
			if(temp.next.data==val)
			{
				temp.next=temp.next.next ;
			}
			temp=temp.next ;
		}
		return head ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Solution s= new Solution();
			s.add(1);
			s.add(1);
			s.add(1);
			s.add(1);
			s.add(1);
			s.add(1);
			s.add(1);
			s.printLinkedList();
			Node c=removeNode(s.head,1);
			s.printLinkedList(c);
			
	}

}
