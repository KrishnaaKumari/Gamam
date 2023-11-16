package day5;

public class RemoveDuplicatesFromSortedList {
	
	public static Node removeDuplicates(Node head)
	{
		if(head==null||head.next==null)
			return head ;
		Node t=head;
		Node c=head.next;
		while(t!=null)
		{
			while(c!=null&&t.data==c.data)
			{
				c=c.next ;
			}
			t.next=c;
			t=t.next;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s= new Solution();
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(1);
		s.add(4);
		s.printLinkedList();
		Node c=removeDuplicates(s.head);
		s.printLinkedList(c);
	}

}
