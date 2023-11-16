package day8;

public class MergeTwoBinaryTree {
	
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2)
    {
        if(root1==null)
            return root2;
        if(root2==null)
            return root1;
        
        TreeNode sum=new TreeNode(root1.data+root2.data);
        sum.left=mergeTrees(root1.left,root2.left);
        sum.right=mergeTrees(root1.right,root2.right);

        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution s1= new Solution();
		TreeNode root1=s1.build();
		s1.printLevelOrder(root1);
		
		Solution s2= new Solution();
		TreeNode root2=s2.build();
		s2.printLevelOrder(root2);
		
		TreeNode r= mergeTrees(root1,root2);
		s1.printLevelOrder(r);

	}

}
