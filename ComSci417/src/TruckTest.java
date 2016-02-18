import org.junit.*;
import static org.junit.Assert.*;

public class TruckTest {
	@Test
	public void TestTruckClone(){
		Truck suv = new Truck(4);
		Truck co = (Truck) suv.clone();
		
		assertTrue("the y values for both trucks are not equal", suv.GetY() == co.GetY());
	}
}
