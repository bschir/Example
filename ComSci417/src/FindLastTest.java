import org.junit.*;
import static org.junit.Assert.*;

public class FindLastTest {
	@Test public void testFindLast(){
		int[] x = {1, 3, 5};
		int y = 2;
		int expected = 0;
		int actual = FindLastClass.FindLast(x, y);
		assertTrue("FindLast does not return the correct value of index 0", expected == actual);
	}
}
