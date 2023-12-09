package lec19;

public class CombinationQueen {

	public static void main(String[] args) {
		boolean [] board =new boolean[4];
		int tq=2;
		combination_queen(board, tq, 0, "",0);
	}
	public static void combination_queen(boolean[] board,int tq,int qpsf,String ans,int indx) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = indx; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				combination_queen(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf+" ",i+1);
				board[i]=false;
			}
	}
		
	}
}
