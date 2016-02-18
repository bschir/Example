
public class Vehicle implements Cloneable{
	private int x;
	public Vehicle(int y) {x = y;}
	public Object clone(){
		Object result = new Vehicle(this.x);
		return result;
	}
	
	public int getX(){
		return x;
	}
}
