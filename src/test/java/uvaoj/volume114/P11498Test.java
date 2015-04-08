package uvaoj.volume114;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Assert;
import org.junit.Test;

public class P11498Test {

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
		BufferedReader reader = new BufferedReader(new StringReader(input));
		Writer writer = new StringWriter();
		P11498.solve(reader, writer);
		Assert.assertArrayEquals(new String[] {expectedOutput}, new String[] {writer.toString()});
	}
}
