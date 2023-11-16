package day6;

public class IntersectionOfTwoLinkedList {
	
	public static ListNode findIntersection(ListNode head1, ListNode head2)
	{
		if(head1==null||head2==null)
			return null ;
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		ListNode a=head1, b=head2;
		while(a!=b)
		{
			if(a.next==null)
				a=head2;
			else
				a=a.next;
			
			if(b.next==null)
				b=head1;
			else
				b=b.next;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s= new Solution();
		s.add(3);
		s.add(5);
		s.add(6);
		
		Solution s1= new Solution();
		s1.add(1);
		s1.add(2);
		
		Solution s2= new Solution();
		s2.add(4);
		
		s1.tail.next=s.head;
		s2.tail.next=s.head;
		
		ListNode c= findIntersection(s1.head, s2.head);
		
		
	}

}
