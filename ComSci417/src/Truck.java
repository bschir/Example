
public class Truck extends Vehicle{
	private int y;
	public Truck(int z) {super(z); y=z;}
	public Object clone(){
		Object result = new Truck(this.y);
		return result;
	}
	
	public int GetY(){
		return this.y;
	}
}
