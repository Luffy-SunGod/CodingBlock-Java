package lectures;

public class MoorthalParatha {

	public static void main(String[] args) {
       int paratha=10;
       int[] chefs= {1,2,3,4};
      // minimum_time(chefs, paratha);
       System.out.println(minimum_time(chefs, paratha));
       
	}
	
	public static int minimum_time(int[] chefs,int no_of_paratha ) {
		int lo=chefs[0];
	//	int hi=chefs[chefs.length-1]* ((no_of_paratha*(no_of_paratha+1))/2);
		int hi=0;
		int ans=0;
		
		
		for (int i =1; i <= no_of_paratha; i++) {
			hi+=chefs[chefs.length-1]*i;
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(is_it_possible(chefs,mid,no_of_paratha)) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return ans;

}

	public  static boolean is_it_possible(int[] chefs, int mid, int no_of_paratha) {
		int paratha=0;
		int initial_time=0;
		int i=0;
		int x=1;
		while(i<chefs.length) {
			if(x*chefs[i]+initial_time<=mid) {
				initial_time+=x*chefs[i];
				paratha++;
				x++;
			}else {
				i++;
				initial_time=0;
				x=1;
			}
			if(paratha==no_of_paratha) {
				return true;
			}
		}
	
		return false;
	}
}
