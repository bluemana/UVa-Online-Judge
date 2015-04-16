package uvaoj.volume101;

import org.junit.Test;

import uvaoj.UvaTest;

public class P10114Test extends UvaTest {

	@Override
	protected Class<?> getTestedClass() {
		return P10114.class;
	}
	
	@Test
	public void testExample() throws Exception {
		String input =
				"30 500.0 15000.0 3\n" +
				"0 .10\n" +
				"1 .03\n" +
				"3 .002\n" +
				"12 500.0 9999.99 2\n" +
				"0 .05\n" +
				"2 .1\n" +
				"60 2400.0 30000.0 3\n" +
				"0 .2\n" +
				"1 .05\n" +
				"12 .025\n" +
				"-99 0 17000 1\n";
		String expectedOutput =
				"4 months\n" +
				"1 month\n" +
				"49 months\n";
		test(input, expectedOutput);
	}
	
	@Test
	public void p10114_NoLoan_0Months() throws Exception {
		String input =
				"0 1000 0 1\n" +
				"0 0.10\n" +
				"-99 0 0 0\n";
		String expectedOutput =
				"0 months\n";
		test(input, expectedOutput);
	}
	
	@Test
	public void p10114_InitialCarValueGreaterThanLoan_0Months() throws Exception {
		String input =
				"2 15000 500 1\n" +
				"0 0.10\n" +
				"-99 0 0 0\n";
		String expectedOutput =
				"0 months\n";
		test(input, expectedOutput);
	}
	
	@Test
	public void p10114_IrrationalRepayment_Calculated() throws Exception {
		String input =
				"36 2000 10000 4\n" +
				"0 .2\n" +
				"1 .1\n" +
				"3 .01\n" +
				"10 .005\n" +
				"36 0 12000 3\n" +
				"0 .25\n" +
				"1 .1\n" +
				"10 .005\n" +
				"-10 0 0 4\n";
		String expectedOutput =
				"11 months\n" +
				"27 months\n";
		test(input, expectedOutput);
	}
}
