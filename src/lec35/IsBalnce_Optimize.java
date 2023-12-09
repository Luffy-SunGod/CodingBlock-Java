package lec35;

import lec35.IsBalance.Is_Balanced.TreeNode;

public class IsBalnce_Optimize {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	 public class Balpair{
		 boolean bf=true;
		 int ht=-1;
	 }
	class Solution {
		
		public boolean isBalanced(TreeNode root) {
			return balance(root).bf;
			
			
		
		}
		
		public  Balpair balance(TreeNode root) {
			if(root==null) {
				return new Balpair();
			}
			Balpair left=balance(root.left);
			Balpair right=balance(root.right);
			Balpair self=new Balpair();
			self.ht=Math.max(left.ht, right.ht)+1;
			self.bf=left.bf&&right.bf&&(Math.abs(left.ht-right.ht)<=1);
			return self;
			
			
		}


	}
}

