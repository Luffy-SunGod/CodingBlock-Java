package lectures;

public class Bubllesort {

	public static void main(String[] args) {
          int[] a= {5,4,3,2,1};
          bubbleSort(a);
          for (int i : a) {
			System.out.print(i+"  ");
		}
          
	}

	
	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
	}
}
