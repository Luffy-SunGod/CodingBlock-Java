	package lec18;

public class TowerOfHonai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		Toh(n,"Src", "Hlp","Dis");
		System.out.println(noofmoves(n,"Src", "Hlp","Dis")-1);
}

	
	public static void Toh(int n, String src, String hel, String dis) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		Toh(n-1, src,  dis,hel);
		System.out.println(n+"th Disk Move from "+ src +" to "+dis);
		Toh(n-1, hel, src, dis);
	}
	public static int noofmoves(int n, String src, String hel, String dis) {
		if(n==0)return 1;
		int count=0;
		count+=noofmoves(n-1, src,  dis,hel);
		//System.out.println(n+"th Disk Move from "+ src +" to "+dis);
		count+=noofmoves(n-1, hel, src, dis);
		
		return count;
		
	}
	

}
