package TreeTuf;

import java.util.Scanner;
import java.util.Stack;



public class Btree{
	Scanner s=new Scanner(System.in);
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;

		}
		public Node() {
			// TODO Auto-generated constructor stub
		}
		
		
	}
	private Node root;
	public Btree() {
		this.root=create_B_tree(null, false);
	}
	
	public Node create_B_tree(Node parent,boolean rc) {
		if(parent==null) {
			System.out.println("enter the data of root node");
		}else if(rc==false) {
			System.out.println("enter the data of left child");
		}else {
			System.out.println("enter the data of right child");
		}
		int x=s.nextInt();
		Node nn=new Node(x);
		System.out.println("have left child??");
		boolean hlc=s.nextBoolean();
		if(hlc) {
			nn.left=create_B_tree(nn, false);
		}
		System.out.println("have right child??");
		boolean hrc=s.nextBoolean();
		if(hrc) {
			nn.right=create_B_tree(nn, true);
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
	
	public void preorder() {
		preorder(this.root);
	}
	
	 private void preorder(Node root) {
		 if(root==null)return;
		 Stack<Node> stack=new Stack<>();
		 stack.push(root);
		 while(!stack.empty()) {
			 root=stack.pop();
			 System.out.print(root.data+" ");
			 if(root.right!=null) {
				 stack.push(root.right);
			 }
			 if(root.left!=null) {
				 stack.push(root.left);
			 }
		 }
	 }
	 
	 private void postorder(Node root) {
		 if(root==null)return;
		 Stack<Node> stack=new Stack<>();
		 stack.push(root);
		 while(!stack.empty()) {
			 root=stack.pop();
			 System.out.print(root.data+" ");
			 if(root.right!=null) {
				 stack.push(root.right);
			 }
			 if(root.left!=null) {
				 stack.push(root.left);
			 }
		 }
	 }
	
	
	
	
	

}
