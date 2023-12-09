package lectures;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=s.nextInt();
        int [] barns=new int [n];
        for (int i = 0; i < barns.length; i++) {
			barns[i]=s.nextInt();
		}
        Arrays.sort(barns);
        System.out.println(minimum_distance(barns, c));
        
        
     }
	
	public static int minimum_distance(int [] a,int noc) {
		int lo=a[0];
		int hi=a[a.length-1]-a[0];
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(is_it_possible(a, mid, noc)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
		}
	}
		return ans;

	}

	public static boolean is_it_possible(int [] a,int mid, int noc) {
		int firstplace=a[0];
		int i=1;
		int cow=1;
		while (i<a.length) {
			if(a[i]-firstplace>=mid) {
				firstplace=a[i];
				cow++;
			}
			if(cow>=noc) {
				return true;
			}
			i++;
		}
		
		return false;
	}

}
