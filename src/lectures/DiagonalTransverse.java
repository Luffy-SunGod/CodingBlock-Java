package lectures;

import java.util.ArrayList;
import java.util.Arrays;



public class DiagonalTransverse {

	public static void main(String[] args) {
//		int [][] a= {
//				{0,1,2,3,4},
//				{5,6,7,8,9},
//				{9,10,11,12,13},
//				
//			};
		
		int[][] a= {{2,3}};
		
		//System.out.println(Arrays.toString(diagonal_one_D(a)));
		System.out.println("**************");
	    System.out.println(Arrays.toString(diagonal_Zigzag(a)));
		//diagonal_tarnsverse(a);
		
		

	}
	
	
	public static int[] diagonal_one_D(int[][] a) {
		int n=a.length;
		int m=a[0].length;
		int [] ans=new int[n*m];
		int idx=0;
		for (int d = 0; d <n+m-1; d++) {
			int row=0;
			int col=0;
			if(d<m) {
				row=0;
				col=d;
			}else {
				row=d-m+1;
				col=m-1;
				
			}
			
			ArrayList<Integer> list=new ArrayList<>();
			while(row<n&&col>=0) {
				list.add(a[row][col]);
				row++;
				col--;
			}
			
			for (int i = 0; i <list.size(); i++) {
				ans[idx]=list.get(i);
				idx++;
				
			}
			
		}
		return ans;
	}
	
	
	public static int[] diagonal_Zigzag(int[][] a) {
		int n=a.length;
		int m=a[0].length;
		int [] ans=new int[n*m];
		int idx=0;
		for (int d = 0; d <n+m-1; d++) {
			int row=0;
			int col=0;
			if(d<m) {
				row=0;
				col=d;
			}else {
				row=d-m+1;
				col=m-1;
				
			}
			
			ArrayList<Integer> list=new ArrayList<>();
			while(row<n&&col>=0) {
				list.add(a[row][col]);
				row++;
				col--;
			}
			
			if(d%2==0) {//jab humara d even h to niche ki tara arrow diagnal transverse kr rha ha.
			
			for (int i = 0; i <list.size(); i++) {
				ans[idx]=list.get(i);
				idx++;
				
			}
			}else {
				for (int i = list.size()-1; i>=0; i--) {
					ans[idx]=list.get(i);
					idx++;
			}
			
		}
	}
		
		return ans;
		}
	
	
	
	
	 public static void diagonal_tarnsverse(int [][] a){
         int m=a.length;// row range
         int n=a[0].length-1;//coloumn range 
         int [] ans=new int[n*m];
         int idx=0;
         for(int i=0;i<n+m-1;i++){
             int row=0;
             int col=0;
             if(i<n){
                 row=0;
                 col=i;

             }else{
                 row=i-n+1;
                  col=n-1;

             }
             ArrayList<Integer> list=new ArrayList<Integer>();
             while(row<m&&col>=0){
                 list.add(a[row][col]);
                 row++;
                 col--;
                 
               }
               if(i%2==0){

               for(int j=0;j<list.size();j++){
                   
                    ans[idx]=list.get(j);
                    idx++;
                    }
         }else{

               for(int j=list.size()-1;j>=0;j--){
                   
                    ans[idx]=list.get(j);
                    idx++;
                    }

         }
         
         }

         System.out.println(Arrays.toString(ans));



     }

}
