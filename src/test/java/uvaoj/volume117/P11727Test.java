package uvaoj.volume117;

import org.junit.Test;

import uvaoj.UvaTest;

public class P11727Test extends UvaTest {

	@Override
	protected Class<?> getTestedClass() {
		return P11727.class;
	}
	
	@Test
	public void testExample() throws Exception {
		String input = 
				"3\n" +
				"1000 2000 3000\n" +
				"3000 2500 1500\n" +
				"1500 1200 1800\n";
		String expectedOutput =
				"Case 1: 2000\n" +
				"Case 2: 2500\n" +
				"Case 3: 1500\n";
		test(input, expectedOutput);
	}
	
	@Test
	public void p11727_3rdValueWithinValues_3rdValue() throws Exception {
		String input = 
				"2\n" +
				"1000 10000 3000\n" +
				"1001 9005 1450\n";
		String expectedOutput =
				"Case 1: 3000\n" +
				"Case 2: 1450\n";
		test(input, expectedOutput);
	}
	
	@Test
	public void p11727_2ValuesEqual_OneOfValues() throws Exception {
		String input = 
				"2\n" +
				"1001 1001 1450\n" +
				"1900 1500 1900\n";
		String expectedOutput =
				"Case 1: 1001\n" +
				"Case 2: 1900\n";
		test(input, expectedOutput);
	}
	
	@Test
	public void p11727_AllValuesEqual_OneOfValues() throws Exception {
		String input = 
				"1\n" +
				"1000 1000 1000\n";
		String expectedOutput =
				"Case 1: 1000\n";
		test(input, expectedOutput);
	}
}
