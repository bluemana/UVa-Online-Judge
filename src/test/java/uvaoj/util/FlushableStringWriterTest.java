package uvaoj.util;

import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

public class FlushableStringWriterTest {

	@Test
	@SuppressWarnings("resource")
	public void writer_NotFlushed_EmptyString() {
		StringWriter writer = new FlushableStringWriter();
		writer.write("TEST");
		Assert.assertArrayEquals(new String[] {""}, new String[] {writer.toString()});
	}
	
	@Test
	@SuppressWarnings("resource")
	public void writer_Flushed_StringUpToFlushPoint() {
		StringWriter writer = new FlushableStringWriter();
		writer.write("BEFORE");
		writer.flush();
		writer.write("AFTER");
		Assert.assertArrayEquals(new String[] {"BEFORE"}, new String[] {writer.toString()});
	}
}
