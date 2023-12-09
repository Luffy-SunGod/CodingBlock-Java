package lec16;

import java.util.*;


public class Parenthesis {

	public static void main(String[] args) {
		int n=3;
		List<String> list=new ArrayList<String>();
		pare(n, "", 0, 0);
		
		

	}
	public static void pare(int n,String ans,int open,int close) {
		
		if(open==n&&close==n) {
			System.out.println(ans);
			return ;
		}
		
		if(open<n) {
		pare(n, ans+"(", open+1, close);
		}
		if(close<open)
		{
		pare(n, ans+")", open, close+1);
		}
		
	}
	
    public static void pare_leetcode(int n,String ans,int open,int close) {
		
		if(open==n&&close==n) {
			System.out.println(ans);
			return ;
		}
		
		if(open<n) {
		pare(n, ans+"(", open+1, close);
		}
		if(close<open)
		{
		pare(n, ans+")", open, close+1);
		}
		
	}
    

}
