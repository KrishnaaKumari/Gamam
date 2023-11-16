package day8;

class SubtreeOfAnotherTree
{
	public static boolean isIdentical(TreeNode root1, TreeNode root2)
	{
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false ;
		if(root1.data!=root2.data)
			return false ;
		
		return (isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right));
	}
	
	public static boolean isSubtree(TreeNode root, TreeNode subtree)
	{
		if(root==null&&subtree==null)
			return true;
		if(root==null)
			return false ;
		if(subtree==null)
			return true ;
		
		if(root.data==subtree.data)
		{
			if(isIdentical(root,subtree))
	            return true ;
		}
		
		return isSubtree(root.left,subtree)||isSubtree(root.right,subtree);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode root=s.build();
		s.printLevelOrder(root);
		
		Solution s1 = new Solution();
		TreeNode subtree=s1.build();
		s1.printLevelOrder(subtree);
		
		System.out.println(isSubtree(root,subtree));

	}

}
