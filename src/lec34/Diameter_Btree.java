package lec34;

public class Diameter_Btree {

	
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
		      public int diameterOfBinaryTree(TreeNode root) {
		    	  
		    	  if(root==null) {
		    		  return 0;
		    	  }
		    	  int lb=diameterOfBinaryTree(root.left);
		    	  int rb=diameterOfBinaryTree(root.right);
		    	  int rd=heigth_Btree(root.left)+heigth_Btree(root.right)+2;
		    	 return Math.max(rd,Math.max(lb, rb));
		    	  
		    	        
		    }
		      
		      public int heigth_Btree(TreeNode root) {
		    	  if(root==null) {
		    		  return-1;
		    		  
		    	  }
		    	  int lb=heigth_Btree(root.left);
		    	  int rb=heigth_Btree(root.right);
		    	  return Math.max(lb, rb)+1;
		      }
	
   
   }
		  
}
