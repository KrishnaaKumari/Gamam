package day8;

public class SameTree {
	
	public static boolean isSame(TreeNode root1, TreeNode root2)
	{
		if(root1==null&&root2==null)
			return true;
		if(root1==null||root2==null)
			return false ;
		if(root1.data!=root2.data)
			return false ;
		
		return (isSame(root1.left,root2.left)&&isSame(root1.right,root2.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
