package day8;

import java.util.*;
public class TreeNode 
{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int d)
	{
		data=d;
		left=right=null ;
	}

}

class Solution
{
//	TreeNode root;
	public TreeNode build()
	{
		
		Queue<TreeNode> pending= new LinkedList<TreeNode>();
		System.out.println("Enter root: ");
		Scanner sc = new Scanner(System.in);
		TreeNode root=new TreeNode(sc.nextInt());
		pending.add(root);
		while(!pending.isEmpty())
		{
			TreeNode curr=pending.poll();
			System.out.println("Enter left child: ");
			int lc= sc.nextInt();
			if(lc!=-1)
			{
				TreeNode leftchild= new TreeNode(lc);
				curr.left=leftchild;
				pending.add(leftchild);
			}
			System.out.println("Enter right child: ");
			int rc= sc.nextInt();
			if(rc!=-1)
			{
				TreeNode rightchild= new TreeNode(rc);
				curr.right=rightchild;
				pending.add(rightchild);
			}			
		}
		sc.close();
		return root;
	}
	
	public void printLevelOrder(TreeNode root)
	{
		System.out.println("Level order traversal: ");
		if(root==null)
		{
			System.out.println("Root null");
			return ;
		}
		Queue<TreeNode> pending= new LinkedList<TreeNode>();
		pending.add(root);
		while(!pending.isEmpty())
		{
			TreeNode curr=pending.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null)
			{
				pending.add(curr.left);
			}
			if(curr.right!=null)
			{
				pending.add(curr.right);
			}
		}
		System.out.println();
	}
}
