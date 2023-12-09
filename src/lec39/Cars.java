package lec39;

public class Cars {
	
	int price;
	int speed;
	String color;

	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Cars [price=" + price + ", speed=" + speed + ", color=" + color + "]";
	}

//	@Override
//	public int compareTo(Cars o) {
//		
//		return this.color.compareTo(o.color);
//	}
	
	
	
	
	

}
