package lec36;

import lec36.BinarySearchTree.Node;

public class Deletebst {
	
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
	    public TreeNode deleteNode(TreeNode root, int key) {
	    	if(root==null)return null;
	    	if(root.val>key) {
	    		root.right=deleteNode(root.left, key);
	    	}
	    	else if(root.val<key) {
	    		root.right=deleteNode(root.left, key);
	    	}else {
	    		if(root.left==null)return root.right;
	    		else if(root.right==null)return root.left;
	    		
	    		else {
	    			int min=minimum(root.right);
	    			root.val=min;
	    			root.right=deleteNode(root.right, min);
	    			return root;
	    		}
	    			
	    	}
	    	return root;
	    }
	    public int minimum(TreeNode root) {
	    	if(root==null)return Integer.MAX_VALUE;
	    	return Math.min(root.val, minimum(root.left));
	    	
	    }
	    
	}

}
