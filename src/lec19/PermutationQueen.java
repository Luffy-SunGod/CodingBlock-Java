package lec19;

public class PermutationQueen {

	public static void main(String[] args) {
		boolean [] board =new boolean[4];
		int tq=2;
	//	permutation_queen(board, tq, 0, "");
		combination_queen(board, tq, 0, "");
		
		
		
	}
	
	public static void permutation_queen(boolean[] board,int tq,int qpsf,String ans) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				permutation_queen(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf+" ");
				board[i]=false;
			}
			
		}
	}
	
	
	public static void combination_queen(boolean[] board,int tq,int qpsf,String ans) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				combination_queen(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf+" ");
				//board[i]=false;
			}
			
		}
	}
}
