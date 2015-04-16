package uvaoj.volume111;

import org.junit.Test;

import uvaoj.UvaTest;

public class P11172Test extends UvaTest {

	@Override
	protected Class<?> getTestedClass() {
		return P11172.class;
	}
	
	@Test
	public void testExample() throws Exception {
		String input =
				"3\n" +
				"10 20\n" +
				"20 10\n" +
				"10 10\n";
		String expectedOutput =
				"<\n" +
				">\n" +
				"=\n";
		test(input, expectedOutput);
	}
}
