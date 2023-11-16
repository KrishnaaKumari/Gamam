package day8;

public class DiameterOfBinaryTree {
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left), height(root.right));
	}
	
	public static int diameter(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		int center=leftheight+rightheight;
		
		int left=diameter(root.left);
		int right=diameter(root.right);
		
		int dia= Math.max(left, Math.max(center, right));
		return dia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
