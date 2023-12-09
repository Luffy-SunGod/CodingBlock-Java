package lectures;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {2,7,8,9,11,15,18};
		int target=15;
		System.out.println(Binary_search(a, target));

	}
		
   public static int Binary_search(int[] a,int target) {
	   int low=0;
	   int high=a.length-1;
	   while(low<=high) {
		   int mid=(low+high)/2;
		  if(a[mid]==target) {
				  return mid;
			  }
			  else if(a[mid]>target) {
				  high=mid-1;
				  
			  }else {
				  low=mid+1;
			  }
		  }
	   
	   
	   return -1;
   }

}
