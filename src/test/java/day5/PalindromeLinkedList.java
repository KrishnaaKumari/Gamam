package day5;

public class PalindromeLinkedList {
	
	public static boolean isPalindrome(Node head)
	{
		if(head==null||head.next==null)
			return true;
		
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next ;
		}
		
		Node prev=null;
		Node curr=slow ;
		while(curr!=null)
		{
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		fast=head;
		slow=prev;
		while(slow!=null)
		{
			if(fast.data!=slow.data)
				return false ;
			slow=slow.next;
			fast=fast.next ;
		}
		return true ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s= new Solution();
		s.add(1);
//		s.add(2);
//		s.add(3);
//		s.add(4);
//		s.add(1);
		s.printLinkedList();
		System.out.println(isPalindrome(s.head));

	}

}
