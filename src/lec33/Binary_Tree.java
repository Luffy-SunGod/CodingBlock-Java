package lec33;

import java.util.Scanner;

public class Binary_Tree {
	Scanner sc=new Scanner(System.in);
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		public Node (int data) {
			this.data=data;
			
		}
		public Node() {
			// TODO Auto-generated constructor stub
		}
		
	}
	private Node root;
	//constructor
	 public Binary_Tree() {
		this.root=create_Tree(null, true);
		
	}
	
	private Node create_Tree(Node parent,boolean rc) {
		if(parent==null) {
			System.out.println("Enter root node ");
		}
		else if(rc==false) {
			System.out.println("Enter the data of left child");
		}else {
			System.out.println("enter thr data of right child");
		}
		
		int item=sc.nextInt();
		Node nn=new Node(item);
		System.out.println("has left child");
		boolean hlc =sc.nextBoolean();//has left child or not 
		if(hlc) {
			nn. left=create_Tree(nn, false);
		}
		System.out.println("has right child");
		boolean hrc=sc.nextBoolean();//has right child or not
		if(hrc) {
			nn.right=create_Tree(nn, true);
		}
		return nn;
		
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
	
	public boolean find(int item) {
		return find(this.root,item);
		
	}
	
	private boolean find(Node root,int item) {
		if(root==null)return false;
		if(root.data==item)return true;
		boolean lb=find(root.left, item);//left branch search
		boolean rb=find(root.right, item);//right branch search
		return lb||rb;
	}
	
	public int minvalue() {
		return minvalue(this.root);
	}
	private int minvalue(Node root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int rootdata=root.data;
		int lbmd=minvalue(root.left);//left branch minimum data;
		int rbmd=minvalue(root.right);// right branch minimum data;
		return Math.min(rootdata, Math.min(lbmd, rbmd));
	}
	
	public int maxvalue() {
		return maxvalue(this.root);
	}
	private int maxvalue(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int rootdata=root.data;
		int lbmd=maxvalue(root.left);//left branch maximum data;
		int rbmd=maxvalue(root.right);//right branch maximum data;
		return Math.max(rootdata, Math.max(lbmd, rbmd));
		
	}
	
	public int size() {
		return size(this.root);
	}
	
	private int size(Node root) {
		if(root==null) {
			return 0;
		}
		int lbs=size(root.left);
		int rbs=size(root.right);
		return lbs+rbs+1;
	}
	
	public int heigth() {
		return heigth(this.root);
	}
	private int heigth(Node root) {
		if(root==null) {
			return -1;
		}
		int lbh=heigth(root.left);
		int rbh=heigth(root.right);
		return Math.max(lbh, rbh)+1;
	}
	public void preorder() {
		preorder(this.root);
	}
	private void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	public void postorder() {
		postorder(this.root);
	}
	
	private void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public void inorder() {
		inorder(this.root);
	}
	
	private void inorder(Node root) {
		if(root==null)return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
}
