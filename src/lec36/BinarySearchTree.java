package lec36;



public class BinarySearchTree {
	
	public class Node{
		int data;
		Node left;
		Node right;
		public Node() {
			
		}
		public Node(int data){
			this.data=data;
		}
	}
	private Node root;
	public BinarySearchTree(int [] in){
		root=createBst(in, 0, in.length-1);
	}
		
	private Node  createBst(int [] a,int si,int ei) {
		if(si>ei){
			return null;
		}
		int mid =(si+ei)/2;
		Node nn=new Node(a[mid]);
		nn.left=createBst(a, si, mid-1);
		nn.right=createBst(a, mid+1, ei);
		return nn;
	}
	
	public void preorder() {
		preorder(this.root);
	}
	
	private void preorder(Node root) {
		if(root==null)return ;
		
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	public void display() {
		display(this.root);
	}
	private void display(Node nn) {
		if(nn==null) {
			return;
		}
		
		String s="<--"+nn.data;
		if(nn.left!=null) {
			s=nn.left.data+s;
		}else {
			s="."+s;
		}
		s=s+"-->";
		if(nn.right!=null) {
			s=s+nn.right.data;
		}else {
			s=s+".";
		}
		System.out.println(s);
		display(nn.left);
		display(nn.right);
	
	}

}
