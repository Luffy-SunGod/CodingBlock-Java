package lec35;

public class PathSum3 {
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
	    public int pathSum(TreeNode root, int targetSum) {
	    	if(root==null)return 0;
	    	
	    	int rp=countpath(root, targetSum);
	    	int lbp=pathSum(root.left, targetSum);
	    	int rbp=pathSum(root.right, targetSum);
	    	
	        return lbp+rbp+rp;
	    }
	    
	    private int countpath(TreeNode root,int target) {
	    if(root==null)return 0;
	    			
	    int count=0;
	    if(target-root.val==0)return count++;
	    
	    count=count+countpath(root.left,target-root.val);
	    count=count+countpath(root.right, target-root.val);
	    return count;
	    
	    }
	    
	    
	}
	
	class Solution {
		public int pathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return 0;
			}

			int count = countpath(root, targetSum);
			int leftpath = pathSum(root.left, targetSum);
			int rightpath = pathSum(root.right, targetSum);
			return count + leftpath + rightpath;

		}

		private int countpath(TreeNode root, int targetSum) {
			// TODO Auto-generated method stub
			if (root == null) {
				return 0;
			}
			int count = 0;
			if (targetSum - root.val == 0) {
				count++;
			}

			count = count + countpath(root.left, targetSum - root.val);
			count = count + countpath(root.right, targetSum - root.val);
			return count;
		}

	}

}
