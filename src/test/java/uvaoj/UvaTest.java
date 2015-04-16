package uvaoj;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;

import org.junit.Assert;

import uvaoj.util.FlushableStringWriter;

public abstract class UvaTest {
	
	protected abstract Class<?> getTestedClass();
	
	protected void test(String input, String expectedOutput) throws Exception{
		BufferedReader reader = new BufferedReader(new StringReader(input));
		StringWriter writer = new FlushableStringWriter();
		Method method = getTestedClass().getMethod("solve", BufferedReader.class, Writer.class);
		method.setAccessible(true);
		method.invoke(null, reader, writer);
		Assert.assertArrayEquals(new String[] {expectedOutput}, new String[] {writer.toString()});
	}
}
