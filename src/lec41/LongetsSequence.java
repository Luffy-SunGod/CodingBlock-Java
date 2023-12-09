package lec41;

import java.util.HashMap;

public class LongetsSequence {
	public static void main(String[] args) {
		int [] a= {20,18,5,3,2,11,8,9,10,4,1,16,12,22};
		System.out.println(longestcount(a));
	}
	
	public static int longestcount(int []a) {
		HashMap<Integer, Boolean> map=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i]+1)) {
				map.put(a[i],true);
				map.put(a[i]+1,false);
				
			}
			else if(map.containsKey(a[i]-1)) {
				map.put(a[i], false);
			}
			else {
				map.put(a[i], true);
			}
		}
	
	int ans = 0;

	for (int key : map.keySet()) {
		if (map.get(key)) {
			int count = 0;
			while (map.containsKey(key)) {
				count++;
				key++;
			}
			ans = Math.max(ans, count);
		}

	}
	return ans;
	
	
	
	}
}


