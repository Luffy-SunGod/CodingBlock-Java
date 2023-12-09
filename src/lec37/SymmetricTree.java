package lec37;

public class SymmetricTree {

	 public class TreeNode {
		      int val;
		     TreeNode left;
		     TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
		 
		class Solution {
		    public boolean isSymmetric(TreeNode root) {
		    	if(root==null)return true;
		    	
		    	return func(root.left, root.right);
		    	
		    	
		    	
		        
		    }
		    public boolean func(TreeNode left,TreeNode right) {
		    	if(left==null&&right==null)return true;
		    	if(left==null||right==null)return false;
		    	if(left.val!=right.val)return false;
		    	boolean x=func(left.left, right.right);
		    	boolean y=func(left.right, right.left);
		    	return x&&y;
		    	
		    }
		}
}
