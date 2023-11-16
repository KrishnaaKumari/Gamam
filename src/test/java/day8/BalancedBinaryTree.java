package day8;

public class BalancedBinaryTree {
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	public static boolean isBalanced(TreeNode root)
	{
		if(root==null)
			return true;
		
		int b=Math.abs((height(root.left)-height(root.right)));
		if(b<-1||b>1)
			return false ;
		return isBalanced(root.left)&&isBalanced(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s= new Solution();
		TreeNode root=s.build();
		s.printLevelOrder(root);
		System.out.println(isBalanced(root));

	}

}
