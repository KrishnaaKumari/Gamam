package day5;

public class MiddleOfLinkedList {
	
	public static Node middleLinkedList(Node head)
	{
		if(head==null)
			return null;
		
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s= new Solution();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.printLinkedList();
		Node c= middleLinkedList(s.head);
		s.printLinkedList(c);
		
	}

}
