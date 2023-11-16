package day5;

public class MergeTwoSortedList 
{
	public static Node mergeTwoLists(Node list1, Node list2)
	{
        Node temp1=list1 ;
        Node temp2=list2 ;
        Node head = new Node(0);
        Node t = head ;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                t.next=temp1 ; temp1=temp1.next ; 
                t=t.next ;
            }
            else
            {
                t.next=temp2 ; temp2=temp2.next ;
                t=t.next ;
            }
        }

        while(temp1!=null)
        {
            t.next=temp1 ; temp1=temp1.next ; 
                t=t.next ;
        }
        while(temp2!=null)
        {
            t.next=temp2 ; temp2=temp2.next ;
                t=t.next ;
        }
        return head.next ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s1= new Solution();
		s1.add(1);
		s1.add(2);
		s1.add(4);
		s1.printLinkedList();
		
		Solution s2= new Solution();
		s2.add(1);
		s2.add(3);
		s2.add(4);
		s2.printLinkedList();
		
		Node c = mergeTwoLists(s1.head,s2.head);
		s1.printLinkedList(c);

	}

}
