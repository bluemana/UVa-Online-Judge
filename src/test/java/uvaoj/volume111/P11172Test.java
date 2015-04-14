package uvaoj.volume111;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import uvaoj.util.FlushableStringWriter;

public class P11172Test {

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
		BufferedReader reader = new BufferedReader(new StringReader(input));
		StringWriter writer = new FlushableStringWriter();
		P11172.solve(reader, writer);
		Assert.assertArrayEquals(new String[] {expectedOutput}, new String[] {writer.toString()});
	}
}
