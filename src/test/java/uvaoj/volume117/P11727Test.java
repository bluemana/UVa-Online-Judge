package uvaoj.volume117;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

public class P11727Test {

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
		BufferedReader reader = new BufferedReader(new StringReader(input));
		StringWriter writer = new StringWriter();
		P11727.solve(reader, writer);
		Assert.assertArrayEquals(new String[] {expectedOutput}, new String[] {writer.toString()});
	}
	
	@Test
	public void testThirdValue() throws Exception {
		String input = 
				"2\n" +
				"1000 10000 3000\n" +
				"1001 9005 1450\n";
		String expectedOutput =
				"Case 1: 3000\n" +
				"Case 2: 1450\n";
		BufferedReader reader = new BufferedReader(new StringReader(input));
		StringWriter writer = new StringWriter();
		P11727.solve(reader, writer);
		Assert.assertArrayEquals(new String[] {expectedOutput}, new String[] {writer.toString()});
	}
	
	@Test
	public void testEqualValues() throws Exception {
		String input = 
				"3\n" +
				"1000 1000 1000\n" +
				"1001 1001 1450\n" +
				"1900 1500 1900\n";
		String expectedOutput =
				"Case 1: 1000\n" +
				"Case 2: 1001\n" +
				"Case 3: 1900\n";
		BufferedReader reader = new BufferedReader(new StringReader(input));
		StringWriter writer = new StringWriter();
		P11727.solve(reader, writer);
		Assert.assertArrayEquals(new String[] {expectedOutput}, new String[] {writer.toString()});
	}
}
