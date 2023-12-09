package lectures;

public class BookAllocati2on {

	public static void main(String[] args) {
		int[] pages = {10,20,30,40};
		int s=2;
		System.out.println(minimum_maximum(pages, s));

	}
	
	public static int minimum_maximum(int[] page,int s) {
		int lo=0;
		int hi=0;
		for (int i : page) {
			hi+=i;
		}
		int ans=0;
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(is_it_possible( page, mid,s)) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
			
		}
		return ans;
	}

	public static boolean is_it_possible(int[] page, int mid, int s) {
		int readpage=0;
		int student=1;
		int i=0;
		while (i<page.length) {
			if(readpage+page[i]<=mid) {
				readpage+=page[i];
				i++;
				
			}else {
				student++;
				readpage=0;
			}
			if(student>s) {
				return false; 
			}
		}
		
		return true;
	}

}
