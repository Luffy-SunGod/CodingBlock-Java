package lectures;

public class PainterPartition {

	public static void main(String[] args) {
		int k=2;
		
		int [] borads= {10,20,30,40};
		System.out.println(minimum_time(borads, k));
	}
	
	public static int   minimum_time(int[] boards,int nop) {
		int lo=boards[0];
		int hi=0;
		int ans=0;
		for (int i : boards) {
			hi+=i;
		}
	while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(is_it_possible(boards,mid,nop)) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return ans;
		
	}

	public static boolean is_it_possible(int[] boards, int mid, int nop) {
		int p=1;
		int intial_time=0;
		int i=0;
		while(i<boards.length) {
			if(boards[i]+intial_time<=mid) {
				intial_time+=boards[i];
				i++;
				
				
				
			}else {
				p++;
				intial_time=0;
				
			}
			if(p>nop) {
				return false;
				
			}
		
		}
		
		return true;
	}

}
