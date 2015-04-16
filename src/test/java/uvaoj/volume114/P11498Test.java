package uvaoj.volume114;

import org.junit.Test;

import uvaoj.UvaTest;

public class P11498Test extends UvaTest {

	@Override
	protected Class<?> getTestedClass() {
		return P11498.class;
	}
	
	@Test
	public void testExample() throws Exception {
		String input =
				"3\n" +
				"2 1\n" +
				"10 10\n" +
				"-10 1\n" +
				"0 33\n" +
				"4\n" +
				"-1000 -1000\n" +
				"-1000 -1000\n" +
				"0 0\n" +
				"-2000 -10000\n" +
				"-999 -1001\n" +
				"0\n";
		String expectedOutput =
				"NE\n" +
				"divisa\n" +
				"NO\n" +
				"divisa\n" +
				"NE\n" +
				"SO\n" +
				"SE\n";
		test(input, expectedOutput);
	}
}
