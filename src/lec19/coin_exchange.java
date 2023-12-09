package lec19;


public class coin_exchange {
	public static void main(String[] args) {
		int [] coin= {2,3, 5,6 };
		//coin_permutation(coin, 10,"");
		coin_combination(coin, 10, "", 0);
		
		
	}

	public static void coin_permutation(int [] coin,int amount, String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coin.length; i++) {
			if(amount>=coin[i]) {
				coin_permutation(coin, amount-coin[i], ans+coin[i]);
			}
		}
	}
	
	public static void coin_combination(int [] coin,int amount, String ans,int indx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = indx; i < coin.length; i++) {
			if(amount>=coin[i]) {
				coin_combination(coin, amount-coin[i], ans+coin[i],i);
			} 
		}
	}
}
