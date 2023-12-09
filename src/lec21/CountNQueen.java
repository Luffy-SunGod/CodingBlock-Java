package lec21;

public class CountNQueen {

	public static void main(String[] args) {
		int n=4;
		boolean [][] board=new boolean[n][n];
		Nqueen(board, 0, n);
	}
	public static void Nqueen(boolean[][] board,int row,int tq) {
		if(tq==0) {
			display(board);
			return;
		}
		if(row>=board.length)return;
		for (int col = 0; col < board.length; col++) {
			if(is_it_possible(board,row,col)) {
				board[row][col]=true;
				Nqueen(board, row+1, tq-1);
				board[row][col]=false;
			}
		}
	}
	
	public static boolean is_it_possible(boolean[][] board, int row, int col) {
		int r=row;
		int c=col;
	
		//row
		while(r>=0) {
			if(board[r][col]) {
				return false;
				
			}
			r--;
		}
		//right diagonal;
		r=row;
	    c=col;
		while(r>=0&&c<board.length) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		//left diagonal
		r=row;
		c=col;
		while(r>=0&&c>=0) {
			if(board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
	return true;
	}

	public static void display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}