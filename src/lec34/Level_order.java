package lec34;

import java.util.*;
public class Level_order {
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
	 public Level_order() {
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
	public void lebvel_order_transversal() {
		
		LinkedList<Node> l=new LinkedList<>();
		l.add(this.root);
		while(!l.isEmpty()) {
			Node rv=l.remove();
			System.out.println(rv.data+" ");
			if(rv.left!=null) {
				l.add(rv.left);
			}
			if(rv.right!=null) {
				l.add(rv.right);
			}
		}
		
	}
	
	public void level_order_linewise() {
		LinkedList <Node> l=new LinkedList<>();
		LinkedList<Node> helper=new LinkedList<>();
		l.add(this.root);
		while(!l.isEmpty()) {
			Node x=l.remove();
			System.out.print(x.data+" ");
			if(x.left!=null) {
				helper.add(x.left);
			}
			if(x.right!=null) {
				helper.add(x.right);
			}
			if(l.isEmpty()) {
				l=helper;
				helper=new LinkedList<>();
				System.out.println();
			}
		}
	}
		public List<List<Integer>> level_order_list() {
			LinkedList <Node> l=new LinkedList<>();
			LinkedList<Node> helper=new LinkedList<>();
			List<List<Integer>> ans=new ArrayList<>();
			List<Integer> list=new ArrayList<>();
			l.add(this.root);
			while(!l.isEmpty()) {
				Node x=l.remove();
				list.add(x.data);
				if(x.left!=null) {
					helper.add(x.left);
				}
				if(x.right!=null) {
					helper.add(x.right);
				}
				if(l.isEmpty()) {
					ans.add(list);
					list=new ArrayList<>();
					l=helper;
					helper=new LinkedList<>();
					System.out.println();
				}
			}
			return ans;
		
	}
	
	
	
		
	
	public static void main(String[] args) {
		Level_order lo=new Level_order();
		//lo.lebvel_order_transversal();
		//lo.level_order_linewise();
		System.out.println(lo.level_order_list());

		
	}
	

}
