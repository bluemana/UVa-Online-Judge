package uvaoj.volume111;

import org.junit.Assert;
import org.junit.Test;

public class P11172Test {

	@Test
	public void testExample() {
		String[] actualResults = new String[] {
			P11172.solve(10, 20),
			P11172.solve(20, 10),
			P11172.solve(10, 10)
		};
		String[] expectedResults = new String[] {
			"<",
			">",
			"="
		};
		Assert.assertArrayEquals(expectedResults, actualResults);
	}
}
