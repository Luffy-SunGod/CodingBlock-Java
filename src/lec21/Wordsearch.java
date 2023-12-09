	package lec21;

public class Wordsearch {
	public static void main(String[] args) {
		 
		
				String word ="ABCCED";
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[0].length; j++) {
						boolean ans=word_search(grid, word, 0, i, j);
						if(ans==true) {
						  System.out.println("true");
						  return;
						}
						
					}
				}
				System.out.println("false");
				
		}
	
	public static boolean word_search(char[][] grid,String word,int idx,int cr,int cc) {
		
		if(idx==word.length())return true;
		if(cc<0||cc>=grid[0].length||cr<0||cr>=grid.length||grid[cr][cc]!=word.charAt(idx))return false;
		
		int[] r= {1,0,-1,0};
		int[] c= {0,1,0,-1};
		grid[cr][cc]='*';
		for (int i = 0; i < c.length; i++) {
			boolean ans=word_search(grid, word, idx+1, cr+r[i], cc+c[i]);
			if(ans) {
				return true;
			}
		}
		grid[cr][cc]=word.charAt(idx);
		return false;
		
	}
	}

